package com.acme.architecture.testing.archunit.rule.technology;

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
public class CatalogMapstructArchitectureRuleTest {
	
	// Interface
	
	@ArchTest
	public static final ArchRule map_struct_classes_should_be_in_mapper_package = CatalogMapstructArchitectureRule.map_struct_classes_should_be_in_mapper_package;

	@ArchTest
	public static final ArchRule map_struct_classes_should_have_names_ending_with_the_word_mapper = CatalogMapstructArchitectureRule.map_struct_classes_should_have_names_ending_with_the_word_mapper;

	@ArchTest
	public static final ArchRule map_struct_classes_should_be_public = CatalogMapstructArchitectureRule.map_struct_classes_should_be_public;
	
	@ArchTest
	public static final ArchRule map_struct_classes_should_be_interface = CatalogMapstructArchitectureRule.map_struct_classes_should_be_interface;

	@ArchTest
	public static final ArchRule map_struct_classes_should_not_be_placed_in_map_struct_impl_package = CatalogMapstructArchitectureRule.map_struct_classes_should_not_be_placed_in_map_struct_impl_package;

	@ArchTest
	public static final ArchRule no_map_struct_classes_should_be_reside_other_packages = CatalogMapstructArchitectureRule.no_map_struct_classes_should_be_reside_other_packages;

	@ArchTest
	public static final ArchRule map_struct_classes_should_only_be_accessed_by_services = CatalogMapstructArchitectureRule.map_struct_classes_should_only_be_accessed_by_services;

}