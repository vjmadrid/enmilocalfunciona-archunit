package com.acme.architecture.testing.archunit.rule.core.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogDummyArchitectureRule;
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
public class CatalogDummyArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule dummy_classes_should_be_in_dummy_package = CatalogDummyArchitectureRule.dummy_classes_should_be_in_dummy_package;

	@ArchTest
	public static final ArchRule dummy_classes_should_have_names_starting_with_the_word_dummy = CatalogDummyArchitectureRule.dummy_classes_should_have_names_starting_with_the_word_dummy;
	
	@ArchTest
	public static final ArchRule dummy_classes_should_be_public = CatalogDummyArchitectureRule.dummy_classes_should_be_public;

}

