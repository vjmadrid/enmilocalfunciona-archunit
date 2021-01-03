package com.acme.architecture.testing.archunit.rule.core.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogServiceImplArchitectureRule;
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
public class CatalogServiceImplArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule service_impl_classes_should_be_in_service_impl_package = CatalogServiceImplArchitectureRule.service_impl_classes_should_be_in_service_impl_package;

	@ArchTest
	public static final ArchRule service_impl_classes_should_have_names_ending_with_the_word_service_impl = CatalogServiceImplArchitectureRule.service_impl_classes_should_have_names_ending_with_the_word_service_impl;

	@ArchTest
	public static final ArchRule service_impl_classes_classes_should_be_public = CatalogServiceImplArchitectureRule.service_impl_classes_classes_should_be_public;

	@ArchTest
	public static final ArchRule service_impl_should_implement_service = CatalogServiceImplArchitectureRule.service_impl_should_implement_service;
	
}
