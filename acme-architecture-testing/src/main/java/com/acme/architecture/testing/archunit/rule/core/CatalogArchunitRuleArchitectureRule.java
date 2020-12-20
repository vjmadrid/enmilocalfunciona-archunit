package com.acme.architecture.testing.archunit.rule.core;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.acme.architecture.testing.archunit.constant.ArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogArchunitRuleArchitectureRule {
	
	@ArchTest
	public static final ArchRule archunit_rule_classes_should_be_in_archunit_rule_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_ARCHUNIT_RULE_CLASS)
		    .should().resideInAnyPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS, ArchUnitConstant.RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS);

	@ArchTest
	public static final ArchRule archunit_rule_classes_should_have_names_ending_with_the_word_archunit_rule = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS, ArchUnitConstant.RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_ARCHUNIT_RULE_CLASS);

	@ArchTest
	public static final ArchRule archunit_rule_classes_should_be_public = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS, ArchUnitConstant.RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule no_archunit_rule_classes_should_be_reside_other_packages = 
			noClasses()
			.that().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_ARCHUNIT_RULE_CLASS)
		    .should()
		    .resideOutsideOfPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .andShould().resideOutsideOfPackage(ArchUnitConstant.RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS);
}
