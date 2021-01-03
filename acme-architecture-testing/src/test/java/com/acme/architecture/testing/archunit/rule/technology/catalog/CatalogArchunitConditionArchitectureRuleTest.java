package com.acme.architecture.testing.archunit.rule.technology.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.technology.catalog.CatalogArchunitConditionArchitectureRule;
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
public class CatalogArchunitConditionArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule archunit_condition_classes_should_be_in_archunit_condition_package = CatalogArchunitConditionArchitectureRule.archunit_condition_classes_should_be_in_archunit_condition_package;

	@ArchTest
	public static final ArchRule archunit_condition_classes_should_have_names_ending_with_the_word_archunit_condition = CatalogArchunitConditionArchitectureRule.archunit_condition_classes_should_have_names_ending_with_the_word_archunit_condition;
	
	@ArchTest
	public static final ArchRule archunit_condition_classes_should_be_public = CatalogArchunitConditionArchitectureRule.archunit_condition_classes_should_be_public;

}

