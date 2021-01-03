package com.acme.architecture.testing.archunit.rule.core.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogExceptionArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = TestingArchUnitPackageConstant.PACKAGE_EXAMPLE, 
importOptions = { 
		ImportOption.DoNotIncludeArchives.class, 
		ImportOption.DoNotIncludeJars.class 
}
)
//Includes test classes
public class CatalogExceptionArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule exception_classes_should_be_in_exception_package = CatalogExceptionArchitectureRule.exception_classes_should_be_in_exception_package;

	@ArchTest
	public static final ArchRule exception_classes_should_have_names_ending_with_the_word_exception = CatalogExceptionArchitectureRule.exception_classes_should_have_names_ending_with_the_word_exception;
	
	@ArchTest
	public static final ArchRule exception_classes_should_be_public = CatalogExceptionArchitectureRule.exception_classes_should_be_public;

}
