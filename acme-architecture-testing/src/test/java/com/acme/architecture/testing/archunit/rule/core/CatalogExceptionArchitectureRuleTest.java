package com.acme.architecture.testing.archunit.rule.core;

import com.acme.architecture.testing.archunit.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.CatalogExceptionArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = ArchUnitPackageConstant.PACKAGE_EXAMPLE, 
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

	@ArchTest
	public static final ArchRule no_exception_classes_should_be_reside_other_packages = CatalogExceptionArchitectureRule.no_exception_classes_should_be_reside_other_packages;

}
