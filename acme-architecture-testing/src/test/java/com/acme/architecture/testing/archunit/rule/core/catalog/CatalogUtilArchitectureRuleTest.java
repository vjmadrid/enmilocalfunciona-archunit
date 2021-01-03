package com.acme.architecture.testing.archunit.rule.core.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogUtilArchitectureRule;
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
public class CatalogUtilArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule util_classes_should_be_in_util_package = CatalogUtilArchitectureRule.util_classes_should_be_in_util_package;

	@ArchTest
	public static final ArchRule util_classes_should_have_names_ending_with_the_word_util = CatalogUtilArchitectureRule.util_classes_should_have_names_ending_with_the_word_util;
	
	@ArchTest
	public static final ArchRule util_classes_should_be_public = CatalogUtilArchitectureRule.util_classes_should_be_public;
	
	@ArchTest
	public static final ArchRule util_classes_should_be_final = CatalogUtilArchitectureRule.util_classes_should_be_final;
	
	@ArchTest
	public static final ArchRule util_classes_constructors_should_have_one_private_constructor = CatalogUtilArchitectureRule.util_classes_constructors_should_have_one_private_constructor;
	
	@ArchTest
	public static final ArchRule util_classes_methods_should_be_static = CatalogUtilArchitectureRule.util_classes_methods_should_be_static;


}
