package com.acme.architecture.testing.archunit.rule.core;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
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
public class CatalogServiceArchitectureRuleTest {
	
	// Interface
	
	@ArchTest
	public static final ArchRule service_interface_classes_should_be_in_service_package = CatalogServiceArchitectureRule.service_interface_classes_should_be_in_service_package;

	@ArchTest
	public static final ArchRule service_interface_should_have_names_ending_with_the_word_service = CatalogServiceArchitectureRule.service_interface_should_have_names_ending_with_the_word_service;

	@ArchTest
	public static final ArchRule service_interface_classes_should_be_public = CatalogServiceArchitectureRule.service_interface_classes_should_be_public;
	
	@ArchTest
	public static final ArchRule service_interface_classes_should_be_interface = CatalogServiceArchitectureRule.service_interface_classes_should_be_interface;

	@ArchTest
	public static final ArchRule service_interface_classes_should_not_be_placed_in_service_impl_package = CatalogServiceArchitectureRule.service_interface_classes_should_not_be_placed_in_service_impl_package;

	@ArchTest
	public static final ArchRule no_service_interface_classes_should_be_reside_other_packages = CatalogServiceArchitectureRule.no_service_interface_classes_should_be_reside_other_packages;

}
