package com.acme.architecture.testing.archunit.rule.core;

import com.acme.architecture.testing.archunit.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.CatalogUtilArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = ArchUnitPackageConstant.PACKAGE_EXAMPLE, 
importOptions = { 
		ImportOption.DoNotIncludeArchives.class, 
		ImportOption.DoNotIncludeJars.class 
	}
)
//Includes test classes
public class CatalogUtilArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule util_classes_should_be_in_util_package = CatalogUtilArchitectureRule.util_classes_should_be_in_util_package;

	@ArchTest
	public static final ArchRule util_classes_should_have_names_ending_with_the_word_util = CatalogUtilArchitectureRule.util_classes_should_have_names_ending_with_the_word_util;

	@ArchTest
	public static final ArchRule util_classes_should_be_public = CatalogUtilArchitectureRule.util_classes_should_be_public;

	@ArchTest
	public static final ArchRule util_classes_methods_should_be_static = CatalogUtilArchitectureRule.util_classes_methods_should_be_static;

	@ArchTest
	public static final ArchRule no_util_classes_should_be_reside_other_packages = CatalogUtilArchitectureRule.no_util_classes_should_be_reside_other_packages;

}
