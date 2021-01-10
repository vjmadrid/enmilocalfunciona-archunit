package com.acme.architecture.testing.spring.archunit.rule.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.springframework.stereotype.Service;

import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogServiceImplArchitectureRule;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.spring.constant.SpringArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSpringServiceImplArchitectureRule {
	
	// *** Implements ***
	
	// Common
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_be_in_spring_service_impl_package = CatalogServiceImplArchitectureRule.service_impl_classes_should_be_in_service_impl_package;

	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_have_names_ending_with_the_word_service_impl = CatalogServiceImplArchitectureRule.service_impl_classes_should_have_names_ending_with_the_word_service_impl;

	@ArchTest
	public static final ArchRule spring_service_impl_classes_classes_should_be_public = CatalogServiceImplArchitectureRule.service_impl_classes_classes_should_be_public;

	@ArchTest
	public static final ArchRule spring_service_impl_should_implement_spring_service = CatalogServiceImplArchitectureRule.service_impl_should_implement_service;

	// Specific
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_be_annotated_with_service = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_IMPL_CLASS)
		    .should().beAnnotatedWith(Service.class);
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_depend_on_spring_repository_and_mapper_and_service_spring_service_interface = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_IMPL_CLASS)
		    .should().dependOnClassesThat().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS)
			.andShould().dependOnClassesThat().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_CLASS)
			.andShould().dependOnClassesThat().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_CLASS);
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_no_depend_on_spring_rest_controller = 
			noClasses()
			.that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_IMPL_CLASS)
			.should().dependOnClassesThat()
            .resideInAnyPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS);
}
