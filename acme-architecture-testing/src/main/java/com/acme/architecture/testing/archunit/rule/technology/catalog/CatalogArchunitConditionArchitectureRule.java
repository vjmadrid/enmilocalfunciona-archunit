package com.acme.architecture.testing.archunit.rule.technology.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.architecture.testing.constant.TechnologyArchUnitNameConstant;
import com.acme.architecture.testing.constant.TechnologyArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogArchunitConditionArchitectureRule {
	
	@ArchTest
	public static final ArchRule archunit_condition_classes_should_be_in_archunit_condition_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(TechnologyArchUnitNameConstant.SUFFIX_NAME_ARCHUNIT_CONDITION_CLASS)
		    .should().resideInAnyPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_CONDITION_CLASS, TechnologyArchUnitPackageConstant.RESIDE_PACKAGE_ARCHUNIT_CONDITION_CLASS);

	@ArchTest
	public static final ArchRule archunit_condition_classes_should_have_names_ending_with_the_word_archunit_condition = 
		    classes()
		    .that().resideInAnyPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_CONDITION_CLASS, TechnologyArchUnitPackageConstant.RESIDE_PACKAGE_ARCHUNIT_CONDITION_CLASS)
		    .should().haveSimpleNameEndingWith(TechnologyArchUnitNameConstant.SUFFIX_NAME_ARCHUNIT_CONDITION_CLASS);

	@ArchTest
	public static final ArchRule archunit_condition_classes_should_be_public = 
		    classes()
		    .that().resideInAnyPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_CONDITION_CLASS, TechnologyArchUnitPackageConstant.RESIDE_PACKAGE_ARCHUNIT_CONDITION_CLASS)
		    .should().bePublic();
	
}
