package com.acme.architecture.testing.archunit.rule.core.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogEnumerationArchitectureRule;
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
public class CatalogEnumerationArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule enumeration_classes_should_be_in_enumeration_package = CatalogEnumerationArchitectureRule.enumeration_classes_should_be_in_enumeration_package;

	@ArchTest
	public static final ArchRule enumeration_classes_should_have_names_ending_with_the_word_enumeration = CatalogEnumerationArchitectureRule.enumeration_classes_should_have_names_ending_with_the_word_enumeration;

	@ArchTest
	public static final ArchRule enumeration_classes_should_be_public_enum = CatalogEnumerationArchitectureRule.enumeration_classes_should_be_public_enum;

}
