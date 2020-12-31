package com.acme.architecture.testing.archunit.rule.core;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogArchunitRuleArchitectureRule {
	
	@ArchTest
	public static final ArchRule archunit_rule_classes_should_be_in_archunit_rule_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_ARCHUNIT_RULE_CLASS)
		    .should().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS);

	@ArchTest
	public static final ArchRule archunit_rule_classes_should_have_names_ending_with_the_word_archunit_rule = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_ARCHUNIT_RULE_CLASS);

	@ArchTest
	public static final ArchRule archunit_rule_classes_should_be_public = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule no_archunit_rule_classes_should_be_reside_other_packages = 
			noClasses()
			.that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_ARCHUNIT_RULE_CLASS)
		    .should()
		    .resideOutsideOfPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .andShould().resideOutsideOfPackage(ArchUnitPackageConstant.RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS);
}
