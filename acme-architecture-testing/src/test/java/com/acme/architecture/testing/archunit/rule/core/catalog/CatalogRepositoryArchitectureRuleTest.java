package com.acme.architecture.testing.archunit.rule.core.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogRepositoryArchitectureRule;
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
public class CatalogRepositoryArchitectureRuleTest {
	
	// Interface
	
	@ArchTest
	public static final ArchRule repository_interface_classes_should_be_in_repository_package = CatalogRepositoryArchitectureRule.repository_interface_classes_should_be_in_repository_package;

	@ArchTest
	public static final ArchRule repository_interface_should_have_names_ending_with_the_word_repository = CatalogRepositoryArchitectureRule.repository_interface_should_have_names_ending_with_the_word_repository;

	@ArchTest
	public static final ArchRule repository_interface_classes_should_be_public = CatalogRepositoryArchitectureRule.repository_interface_classes_should_be_public;
	
	@ArchTest
	public static final ArchRule repository_interface_classes_should_be_interface = CatalogRepositoryArchitectureRule.repository_interface_classes_should_be_interface;

	@ArchTest
	public static final ArchRule repository_interface_classes_should_not_be_placed_in_repository_impl_package = CatalogRepositoryArchitectureRule.repository_interface_classes_should_not_be_placed_in_repository_impl_package;

	@ArchTest
	public static final ArchRule reppository_interface_classes_should_only_be_accessed_by_services_impl = CatalogRepositoryArchitectureRule.repository_interface_classes_should_only_be_accessed_by_services_impl;

}
