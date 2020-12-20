package com.acme.architecture.testing.archunit.rule.core;

import com.acme.architecture.testing.archunit.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.CatalogSupportArchitectureRule;
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
public class CatalogSupportArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule support_classes_should_be_in_support_package = CatalogSupportArchitectureRule.support_classes_should_be_in_support_package;

	@ArchTest
	public static final ArchRule support_classes_should_have_names_ending_with_the_word_support = CatalogSupportArchitectureRule.support_classes_should_have_names_ending_with_the_word_support;

	@ArchTest
	public static final ArchRule support_classes_should_be_public = CatalogSupportArchitectureRule.support_classes_should_be_public;

	@ArchTest
	public static final ArchRule no_support_classes_should_be_reside_other_packages = CatalogSupportArchitectureRule.no_support_classes_should_be_reside_other_packages;

}
