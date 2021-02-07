package com.acme.greeting.api.model.greeting.archunit.sonar;

import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogConstantArchitectureRule;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.lang.ArchRule;

public class CheckArchitectureOnlyUsesImplementationTest {
	
	JavaClasses IMPORTED_CLASSES = new ClassFileImporter()
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
			.importPackages("com.acme.greeting.api.model.greeting");

	@Test
	public void constant_classes_should_have_names_ending_with_the_word_constant() {

		ArchRule rule = CatalogConstantArchitectureRule.constant_classes_should_have_names_ending_with_the_word_constant;
		rule.check(IMPORTED_CLASSES);

	}
	
	@Test
	public void constant_classes_should_be_final() {

		CatalogConstantArchitectureRule.constant_classes_should_be_final.check(IMPORTED_CLASSES);

	}

}
