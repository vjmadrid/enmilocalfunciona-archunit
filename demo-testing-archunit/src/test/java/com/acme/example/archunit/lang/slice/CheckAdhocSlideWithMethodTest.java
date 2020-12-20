package com.acme.example.archunit.lang.slice;

import org.junit.jupiter.api.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.library.dependencies.SliceRule;
import com.tngtech.archunit.library.dependencies.SlicesRuleDefinition;

public class CheckAdhocSlideWithMethodTest {
	
	private static final String PACKAGE_TEST_VALUE = "com.acme.example";

	private JavaClasses IMPORTED_CLASSES = new ClassFileImporter()
    		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
    		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
    		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
    		.importPackages(PACKAGE_TEST_VALUE);
	
	@Test
	public void whenCallCheckSlicesForBeFreeOfCycles_thenReturnSuccess() {
		SliceRule rule = SlicesRuleDefinition.slices().matching("com.acme.example.(*)..").should().beFreeOfCycles();
		rule.check(IMPORTED_CLASSES);
	}

	@Test
	public void whenCallCheckSlicesForControllersShouldNotDependOnEachOther_thenReturnSuccess() {
		SliceRule rule = SlicesRuleDefinition.slices().matching("com.acme.example.controller.(**)").should()
				.notDependOnEachOther();
		rule.check(IMPORTED_CLASSES);
	}

	
}