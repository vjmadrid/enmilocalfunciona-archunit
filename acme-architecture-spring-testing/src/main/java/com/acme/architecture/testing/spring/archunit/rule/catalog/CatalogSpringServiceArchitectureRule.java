package com.acme.architecture.testing.spring.archunit.rule.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import org.springframework.stereotype.Service;

import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogServiceArchitectureRule;
import com.acme.architecture.testing.spring.constant.SpringArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSpringServiceArchitectureRule {
	
	// *** Interface ***
	
	// Common

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_be_in_spring_service_package = CatalogServiceArchitectureRule.service_interface_classes_should_be_in_service_package;
	
	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_have_names_ending_with_the_word_service = CatalogServiceArchitectureRule.service_interface_classes_should_have_names_ending_with_the_word_service;

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_be_public = CatalogServiceArchitectureRule.service_interface_classes_should_be_public;

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_be_interface = CatalogServiceArchitectureRule.service_interface_classes_should_be_interface;

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_not_be_placed_in_service_impl_package = CatalogServiceArchitectureRule.service_interface_classes_should_not_be_placed_in_service_impl_package;

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_only_be_accessed_by_controllers_or_other_services_impl = CatalogServiceArchitectureRule.service_interface_classes_should_only_be_accessed_by_controllers_or_other_services_impl;

	// Specific
	
	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_not_be_annotated_with_service = 
			classes()
			.that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS)
			.should().notBeAnnotatedWith(Service.class);

}

