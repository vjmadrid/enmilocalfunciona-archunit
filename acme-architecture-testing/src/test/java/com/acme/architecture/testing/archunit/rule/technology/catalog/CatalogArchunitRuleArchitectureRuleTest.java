package com.acme.architecture.testing.archunit.rule.technology.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.technology.catalog.CatalogArchunitRuleArchitectureRule;
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
public class CatalogArchunitRuleArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule archunit_rule_classes_should_be_in_archunit_rule_package = CatalogArchunitRuleArchitectureRule.archunit_rule_classes_should_be_in_archunit_rule_package;

	@ArchTest
	public static final ArchRule archunit_rule_classes_should_have_names_ending_with_the_word_archunit_rule = CatalogArchunitRuleArchitectureRule.archunit_rule_classes_should_have_names_ending_with_the_word_archunit_rule;
	
	@ArchTest
	public static final ArchRule archunit_rule_classes_should_be_public = CatalogArchunitRuleArchitectureRule.archunit_rule_classes_should_be_public;

	@ArchTest
	public static final ArchRule no_archunit_rule_classes_should_be_reside_other_packages = CatalogArchunitRuleArchitectureRule.no_archunit_rule_classes_should_be_reside_other_packages;

}

