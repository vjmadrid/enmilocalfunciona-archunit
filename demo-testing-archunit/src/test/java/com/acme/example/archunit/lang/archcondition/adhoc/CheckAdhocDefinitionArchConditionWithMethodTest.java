package com.acme.example.archunit.lang.archcondition.adhoc;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import org.junit.jupiter.api.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.lang.ArchRule;

public class CheckAdhocDefinitionArchConditionWithMethodTest {
	
	private static final String PACKAGE_TEST_VALUE = "com.acme.example";

	private JavaClasses IMPORTED_CLASSES = new ClassFileImporter()
    		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
    		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
    		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
    		.importPackages(PACKAGE_TEST_VALUE);
	
	@Test
    public void whenCallCheckAdhocArchConditionForNoSettersInUtils_thenReturnSuccess() {
		// Define Rule
        ArchRule util_classes_no_have_setters = classes()
        	    .that().resideInAPackage("..util..")
        	    .should(new ClassesNoPublicSetterArchCondition());

        System.out.println("* Show Description Rule :: "+util_classes_no_have_setters);
        
        util_classes_no_have_setters.check(IMPORTED_CLASSES);
    }
	
	@Test
    public void whenCallDirectCheckAdhocArchConditionForNoSettersInUtils_thenReturnSuccess() {
		// Define Rule
		classes()
	    .that().resideInAPackage("..util..")
	    .should(new ClassesNoPublicSetterArchCondition()).check(IMPORTED_CLASSES);
    }
	
	
}