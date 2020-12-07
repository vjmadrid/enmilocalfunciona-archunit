package com.acme.example.archunit.lang.archrule.external;

import org.junit.jupiter.api.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.lang.ArchRule;

public class CheckExternalArchRuleWithMethodTest {
	
	private static final String PACKAGE_TEST_VALUE = "com.acme.example";

	private JavaClasses IMPORTED_CLASSES = new ClassFileImporter()
    		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
    		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
    		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
    		.importPackages(PACKAGE_TEST_VALUE);
	
	@Test
    public void whenCallCheckExternalArchRuleForSerializableEntities_thenReturnSuccess() {
		// Rule entities_impl_serializable
        ArchRule entity_classes_should_be_serializable = ExternalEntityArchitectureRule.entity_classes_should_be_serializable;

        System.out.println("* Show Description Rule :: "+entity_classes_should_be_serializable);
        
        entity_classes_should_be_serializable.check(IMPORTED_CLASSES);
    }
	
	@Test
    public void whenCallDirectCheckExternalArchRuleForSerializableEntities_thenReturnSuccess() {
		// Define Rule
		ExternalEntityArchitectureRule.entity_classes_should_be_serializable.check(IMPORTED_CLASSES);
    }
	
	
}