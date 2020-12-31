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
public class CatalogRepositoryImplArchitectureRuleTest {
		
	@ArchTest
	public static final ArchRule repository_impl_classes_should_be_in_repository_impl_package = CatalogRepositoryImplArchitectureRule.repository_impl_classes_should_be_in_repository_impl_package;

	@ArchTest
	public static final ArchRule repository_impl_classes_should_have_names_ending_with_the_word_repository_impl = CatalogRepositoryImplArchitectureRule.repository_impl_classes_should_have_names_ending_with_the_word_repository_impl;

	@ArchTest
	public static final ArchRule repository_impl_classes_classes_should_be_public = CatalogRepositoryImplArchitectureRule.repository_impl_classes_classes_should_be_public;

	@ArchTest
	public static final ArchRule no_repository_impl_classes_should_be_reside_other_packages = CatalogRepositoryImplArchitectureRule.no_repository_impl_classes_should_be_reside_other_packages;
	
}
