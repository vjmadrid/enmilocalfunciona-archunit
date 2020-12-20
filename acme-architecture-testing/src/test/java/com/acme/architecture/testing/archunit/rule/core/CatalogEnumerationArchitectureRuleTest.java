package com.acme.architecture.testing.archunit.rule.core;

import com.acme.architecture.testing.archunit.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.CatalogEnumerationArchitectureRule;
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
public class CatalogEnumerationArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule enumeration_classes_should_be_in_enumeration_package = CatalogEnumerationArchitectureRule.enumeration_classes_should_be_in_enumeration_package;

	@ArchTest
	public static final ArchRule enumeration_classes_should_have_names_ending_with_the_word_enumeration = CatalogEnumerationArchitectureRule.enumeration_classes_should_have_names_ending_with_the_word_enumeration;

	@ArchTest
	public static final ArchRule enumeration_classes_should_be_public_enum = CatalogEnumerationArchitectureRule.enumeration_classes_should_be_public_enum;

	@ArchTest
	public static final ArchRule no_enumeration_classes_should_be_reside_other_packages = CatalogEnumerationArchitectureRule.no_enumeration_classes_should_be_reside_other_packages;

}
