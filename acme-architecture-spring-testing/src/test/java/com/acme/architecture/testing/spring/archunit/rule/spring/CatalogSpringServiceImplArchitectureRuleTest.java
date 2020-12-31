package com.acme.architecture.testing.spring.archunit.rule.spring;

import com.acme.architecture.testing.spring.archunit.constant.TestingSpringArchUnitPackageConstant;
import com.acme.architecture.testing.spring.archunit.rule.CatalogSpringServiceImplArchitectureRule;
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
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_be_in_spring_service_impl_package = CatalogSpringServiceImplArchitectureRule.spring_service_impl_classes_should_be_in_spring_service_impl_package;

	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_have_names_ending_with_the_word_service_impl = CatalogSpringServiceImplArchitectureRule.spring_service_impl_classes_should_have_names_ending_with_the_word_service_impl;

	@ArchTest
	public static final ArchRule spring_service_impl_classes_classes_should_be_public = CatalogSpringServiceImplArchitectureRule.spring_service_impl_classes_classes_should_be_public;

	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_be_annotated_with_service = CatalogSpringServiceImplArchitectureRule.spring_service_impl_classes_should_be_annotated_with_service;
	
	@ArchTest
	public static final ArchRule no_spring_service_impl_classes_should_be_reside_other_packages = CatalogSpringServiceImplArchitectureRule.no_spring_service_impl_classes_should_be_reside_other_packages;
	
}
