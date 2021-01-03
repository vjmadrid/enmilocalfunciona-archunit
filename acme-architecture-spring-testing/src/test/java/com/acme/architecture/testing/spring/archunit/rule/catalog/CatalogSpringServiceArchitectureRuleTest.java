package com.acme.architecture.testing.spring.archunit.rule.catalog;

import com.acme.architecture.testing.spring.archunit.constant.TestingSpringArchUnitPackageConstant;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringServiceArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = TestingSpringArchUnitPackageConstant.PACKAGE_EXAMPLE, 
importOptions = { 
		ImportOption.DoNotIncludeArchives.class, 
		ImportOption.DoNotIncludeJars.class 
	}
)
//Includes test classes
public class CatalogSpringServiceArchitectureRuleTest {
	
	// *** Interface ***
	
	// Common
	
	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_be_in_spring_service_package = CatalogSpringServiceArchitectureRule.spring_service_interface_classes_should_be_in_spring_service_package;

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_have_names_ending_with_the_word_service = CatalogSpringServiceArchitectureRule.spring_service_interface_classes_should_have_names_ending_with_the_word_service;

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_be_public = CatalogSpringServiceArchitectureRule.spring_service_interface_classes_should_be_public;
	
	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_be_interface = CatalogSpringServiceArchitectureRule.spring_service_interface_classes_should_be_interface;

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_not_be_placed_in_service_impl_package = CatalogSpringServiceArchitectureRule.spring_service_interface_classes_should_not_be_placed_in_service_impl_package;

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_only_be_accessed_by_controllers_or_other_services_impl = CatalogSpringServiceArchitectureRule.spring_service_interface_classes_should_only_be_accessed_by_controllers_or_other_services_impl;

	// Specific
	
	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_not_be_annotated_with_service = CatalogSpringServiceArchitectureRule.spring_service_interface_classes_should_not_be_annotated_with_service;

}

