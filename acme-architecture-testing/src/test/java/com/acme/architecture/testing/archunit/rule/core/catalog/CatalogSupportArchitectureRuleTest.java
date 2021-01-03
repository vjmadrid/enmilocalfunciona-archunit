package com.acme.architecture.testing.archunit.rule.core.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogSupportArchitectureRule;
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
public class CatalogSupportArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule support_classes_should_be_in_support_package = CatalogSupportArchitectureRule.support_classes_should_be_in_support_package;

	@ArchTest
	public static final ArchRule support_classes_should_have_names_ending_with_the_word_support = CatalogSupportArchitectureRule.support_classes_should_have_names_ending_with_the_word_support;

	@ArchTest
	public static final ArchRule support_classes_should_be_public = CatalogSupportArchitectureRule.support_classes_should_be_public;

}
