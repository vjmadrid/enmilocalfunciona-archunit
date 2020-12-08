package com.acme.architecture.testing.archunit.rule;

import com.acme.architecture.testing.archunit.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.CatalogEnumerationArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = ArchUnitPackageConstant.PACKAGE_EXAMPLE, importOptions = { ImportOption.DoNotIncludeArchives.class, ImportOption.DoNotIncludeJars.class })
public class BaseEnumerationArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule enumeration_classes_should_be_in_enumeration_package = CatalogEnumerationArchitectureRule.enumeration_classes_should_be_in_enumeration_package;

	@ArchTest
	public static final ArchRule enumeration_classes_should_have_names_ending_with_the_word_enumeration = CatalogEnumerationArchitectureRule.enumeration_classes_should_have_names_ending_with_the_word_enumeration;

	@ArchTest
	public static final ArchRule enumeration_classes_should_be_public_enum = CatalogEnumerationArchitectureRule.enumeration_classes_should_be_public_enum;
}
