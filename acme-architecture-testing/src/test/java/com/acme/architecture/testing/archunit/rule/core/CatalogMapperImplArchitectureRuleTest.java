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
public class CatalogMapperImplArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule mapper_impl_classes_should_be_in_mapper_impl_package = CatalogMapperImplArchitectureRule.mapper_impl_classes_should_be_in_mapper_impl_package;

	@ArchTest
	public static final ArchRule mapper_impl_classes_should_have_names_ending_with_the_word_mapper_impl = CatalogMapperImplArchitectureRule.mapper_impl_classes_should_have_names_ending_with_the_word_mapper_impl;

	@ArchTest
	public static final ArchRule mapper_impl_classes_classes_should_be_public = CatalogMapperImplArchitectureRule.mapper_impl_classes_classes_should_be_public;

	@ArchTest
	public static final ArchRule no_mapper_impl_classes_should_be_reside_other_packages = CatalogMapperImplArchitectureRule.no_mapper_impl_classes_should_be_reside_other_packages;
	
}