package com.acme.example.archunit.lang.archcondition.adhoc;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.all;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import com.acme.example.archunit.core.importclasses.abstracttest.AbstractArchTest;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.domain.JavaConstructor;
import com.tngtech.archunit.core.domain.JavaMethod;
import com.tngtech.archunit.core.domain.JavaModifier;
import com.tngtech.archunit.lang.AbstractClassesTransformer;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ClassesTransformer;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;

public class CheckAdhocClassesWithMethodTest extends AbstractArchTest {

	@Test
	public void shouldBeUtilClassesWithPrivateConstructor() {

		ClassesTransformer<JavaConstructor> utilityConstructors = new AbstractClassesTransformer<JavaConstructor>(
				"utility constructors") {

			@Override
			public Iterable<JavaConstructor> doTransform(JavaClasses classes) {
				Set<JavaConstructor> result = new HashSet<>();

				for (JavaClass javaClass : classes) {

					if (javaClass.getSimpleName().endsWith("Util")) {
						result.addAll(javaClass.getConstructors());
					}

				}
				
				return result;
			}

		};

		ArchCondition<JavaConstructor> bePrivateConstructors = new ArchCondition<JavaConstructor>("be private") {

			@Override
			public void check(JavaConstructor constructor, ConditionEvents events) {
				boolean privateAccess = constructor.getModifiers().contains(JavaModifier.PRIVATE);

				String message = String.format("%s is not private", constructor.getFullName());
				events.add(new SimpleConditionEvent(constructor, privateAccess, message));
			}

		};

		all(utilityConstructors).should(bePrivateConstructors).check(IMPORTED_CLASSES);
	}

	@Test
	public void shouldBeUtilClassesWithPublicMehtods() {

		ClassesTransformer<JavaMethod> utilityMethods = new AbstractClassesTransformer<JavaMethod>("utility methods") {
			
			@Override
			public Iterable<JavaMethod> doTransform(JavaClasses classes) {
				Set<JavaMethod> result = new HashSet<>();
				
				for (JavaClass javaClass : classes) {
					if (javaClass.getSimpleName().endsWith("Util")) {
						result.addAll(javaClass.getMethods());
					}
				}
				
				return result;
			}
			
		};

		ArchCondition<JavaMethod> havePublicStaticFunctions = new ArchCondition<JavaMethod>("be public and static ") {
			
			@Override
			public void check(JavaMethod method, ConditionEvents events) {
				boolean publicStaticFunctions = method.getModifiers().contains(JavaModifier.PUBLIC)
						&& method.getModifiers().contains(JavaModifier.STATIC);
				
				String message = String.format("%s is not public and static", method.getFullName());
				events.add(new SimpleConditionEvent(method, publicStaticFunctions, message));
			}
			
		};

		all(utilityMethods).should(havePublicStaticFunctions).check(IMPORTED_CLASSES);
	}

}