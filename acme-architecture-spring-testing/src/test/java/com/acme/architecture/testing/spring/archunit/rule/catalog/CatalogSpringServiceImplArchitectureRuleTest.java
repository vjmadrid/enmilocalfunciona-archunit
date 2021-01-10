package com.acme.architecture.testing.spring.archunit.rule.catalog;

import com.acme.architecture.testing.spring.archunit.constant.TestingSpringArchUnitPackageConstant;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringServiceImplArchitectureRule;
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
public class CatalogSpringServiceImplArchitectureRuleTest {
	
	// *** Implements ***
	
	// Common
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_be_in_spring_service_impl_package = CatalogSpringServiceImplArchitectureRule.spring_service_impl_classes_should_be_in_spring_service_impl_package;

	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_have_names_ending_with_the_word_service_impl = CatalogSpringServiceImplArchitectureRule.spring_service_impl_classes_should_have_names_ending_with_the_word_service_impl;

	@ArchTest
	public static final ArchRule spring_service_impl_classes_classes_should_be_public = CatalogSpringServiceImplArchitectureRule.spring_service_impl_classes_classes_should_be_public;

	// Specific
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_be_annotated_with_service = CatalogSpringServiceImplArchitectureRule.spring_service_impl_classes_should_be_annotated_with_service;
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_depend_on_spring_repository_and_mapper_and_service_spring_service_interface = CatalogSpringServiceImplArchitectureRule.spring_service_impl_classes_should_depend_on_spring_repository_and_mapper_and_service_spring_service_interface;
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_no_depend_on_spring_rest_controller = CatalogSpringServiceImplArchitectureRule.spring_service_impl_classes_should_no_depend_on_spring_rest_controller;
	
}
