package com.acme.example.archunit.lang.archrule.adhoc;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noMethods;

import java.io.Serializable;

import org.junit.jupiter.api.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

public class CheckAdhocArchRuleWithMethodTest {

	private static final String PACKAGE_TEST_VALUE = "com.acme.example";

	private JavaClasses IMPORTED_CLASSES = new ClassFileImporter()
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS).importPackages(PACKAGE_TEST_VALUE);
	
	@Test
    public void whenCallCheckAdhocArchRuleForSerializableEntities_thenReturnSuccess() {
		// Define Rule
        ArchRule entity_classes_should_be_serializable = classes().that().resideInAPackage("..archunit.entity").should().implement(Serializable.class);

        System.out.println("* Show Description Rule :: "+entity_classes_should_be_serializable);

        entity_classes_should_be_serializable.check(IMPORTED_CLASSES);
    }
	
	
	@Test
    public void whenCallDirectCheckAdhocArchRuleForSerializableEntities_thenReturnSuccess() {
		// Define Rule
        classes().that().resideInAPackage("..archunit.entity").should().implement(Serializable.class).check(IMPORTED_CLASSES);
    }
	
	@Test
    public void whenCallArchRuleDefinitionDirectCheckAdhocArchRuleForSerializableEntities_thenReturnSuccess() {
		// Define Rule
		ArchRuleDefinition.classes().that().resideInAPackage("..archunit.entity").should().implement(Serializable.class).check(IMPORTED_CLASSES);
    }
	
	@Test
	public void whenCallArchRuleForNotUseJunit4Classes() {
		
	    JavaClasses CLASSES = new ClassFileImporter()
	        .importPackages("com.acme.example");

	    noClasses()
	        .should().accessClassesThat().resideInAnyPackage("org.junit")
	        .because("Tests should use Junit5 instead of Junit4")
	        .check(CLASSES);

	    noMethods().should().beAnnotatedWith("org.junit.Test")
	        .orShould().beAnnotatedWith("org.junit.Ignore")
	        .because("Tests should use Junit5 instead of Junit4")
	        .check(CLASSES);
	}

}