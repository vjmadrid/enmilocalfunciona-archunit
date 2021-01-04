package com.acme.architecture.testing.archunit.rule.core.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogMapperArchitectureRule;
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
public class CatalogMapperArchitectureRuleTest {
	
	// Interface
	
	@ArchTest
	public static final ArchRule mapper_classes_should_be_in_mapper_package = CatalogMapperArchitectureRule.mapper_classes_should_be_in_mapper_package;

	@ArchTest
	public static final ArchRule mapper_classes_should_have_names_ending_with_the_word_mapper = CatalogMapperArchitectureRule.mapper_classes_should_have_names_ending_with_the_word_mapper;

	@ArchTest
	public static final ArchRule mapper_classes_should_be_public = CatalogMapperArchitectureRule.mapper_classes_should_be_public;
	
	@ArchTest
	public static final ArchRule mapper_classes_should_be_interface = CatalogMapperArchitectureRule.mapper_classes_should_be_interface;

	@ArchTest
	public static final ArchRule mapper_classes_should_not_be_placed_in_mapper_impl_package = CatalogMapperArchitectureRule.mapper_classes_should_not_be_placed_in_mapper_impl_package;

	@ArchTest
	public static final ArchRule mapper_classes_should_only_be_accessed_by_services_impl = CatalogMapperArchitectureRule.mapper_classes_should_only_be_accessed_by_services_impl;

}

