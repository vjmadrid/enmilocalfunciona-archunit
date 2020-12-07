package com.acme.example.archunit.core.importclasses.abstracttest;

import org.junit.jupiter.api.BeforeAll;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;

public class AbstractArchTest {
	
	private static final String GENERIC_PACKAGE_TEST_VALUE = "com.acme.example";

	public static JavaClasses IMPORTED_CLASSES;

	@BeforeAll
	public static void setUp() {
		IMPORTED_CLASSES = new ClassFileImporter()
				.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
				.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
				.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
				.importPackages(GENERIC_PACKAGE_TEST_VALUE);
	}
	
}
