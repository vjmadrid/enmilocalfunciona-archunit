package com.acme.architecture.testing.spring.archunit.rule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.springframework.stereotype.Service;

import com.acme.architecture.testing.archunit.rule.core.CatalogServiceImplArchitectureRule;
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

	// Specific
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_be_annotated_with_service = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS)
		    .should().beAnnotatedWith(Service.class);
	
	@ArchTest
	public static final ArchRule no_spring_service_impl_classes_should_be_reside_other_packages = 
			noClasses()
			.that().areAnnotatedWith(Service.class)
		    .should().resideOutsideOfPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS);

}
