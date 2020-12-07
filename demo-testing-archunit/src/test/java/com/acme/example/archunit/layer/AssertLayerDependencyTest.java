package com.acme.example.archunit.layer;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.domain.JavaModifier;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;

public class AssertLayerDependencyTest {
	
	private static final String GENERIC_PACKAGE_TEST_VALUE = "com.acme.example";

	private JavaClasses IMPORTED_CLASSES = new ClassFileImporter()
    		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
    		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
    		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
    		.importPackages(GENERIC_PACKAGE_TEST_VALUE);
	
	public final Class<?>[] SUPPORTED_RETURN_TYPES = new Class<?>[] { Collections.class, Map.class };

	ArchCondition<JavaClass> findMethodsMustReturnCollectionsOrMaps = new ArchCondition<JavaClass>("..desc..") {
		
		
		
		
		
		public void check(JavaClass clazz, ConditionEvents events) {
			Set<Class<?>> VALID_TYPES_SET = new HashSet<>(Arrays.asList(SUPPORTED_RETURN_TYPES));
			
			clazz.getMethods().stream()
				.filter(method -> method.getName().startsWith("getNumeric"))
				.filter(method -> method.getModifiers().contains(JavaModifier.PUBLIC))
				.forEach(method -> {
					JavaClass returnType = method.getRawReturnType();
					System.out.println("returnType :: " + returnType);
						
//				if (!any(VALID_TYPES_SET, vrt -> returnType.isAssignableTo(vrt))) {
//					String message = String.format(
//						"Method %s.%s does not return a collection or map. It returns: %s", item.getName(),
//						method.getName(), returnType.getName());
//					events.add(SimpleConditionEvent.violated(item, message));
//				}
			});
			
		}
		
	};
	
	
	@Test
	public void methodsPrefixedFindShouldReturnCollections() {
		//ArchRule rule = classes().that().resideInAPackage("..user.info").and()
		//		.areNotInterfaces().and().haveNameMatching(".*Util").should().beAnnotatedWith(UtilDescription.class);
		
		ArchRule rule = classes().that().areNotInterfaces().and().haveNameMatching(".*Util")
				.should(findMethodsMustReturnCollectionsOrMaps);

		rule.check(IMPORTED_CLASSES);
	}
	
}



	
		

					



