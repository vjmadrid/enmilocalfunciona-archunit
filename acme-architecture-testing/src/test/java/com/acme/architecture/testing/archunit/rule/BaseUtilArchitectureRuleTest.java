package com.acme.architecture.testing.archunit.rule;

import com.acme.architecture.testing.archunit.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.CatalogUtilArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = ArchUnitPackageConstant.PACKAGE_EXAMPLE, importOptions = { ImportOption.DoNotIncludeArchives.class, ImportOption.DoNotIncludeJars.class })
public class BaseUtilArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule util_classes_should_be_in_util_package = CatalogUtilArchitectureRule.util_classes_should_be_in_util_package;

	@ArchTest
	public static final ArchRule util_classes_should_have_names_ending_with_the_word_util = CatalogUtilArchitectureRule.util_classes_should_have_names_ending_with_the_word_util;

	@ArchTest
	public static final ArchRule util_classes_should_be_public = CatalogUtilArchitectureRule.util_classes_should_be_public;

}
