package com.acme.architecture.testing.archunit.rule.technology.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.acme.architecture.testing.constant.TechnologyArchUnitNameConstant;
import com.acme.architecture.testing.constant.TechnologyArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogArchunitRuleArchitectureRule {
	
	@ArchTest
	public static final ArchRule archunit_rule_classes_should_be_in_archunit_rule_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(TechnologyArchUnitNameConstant.SUFFIX_NAME_ARCHUNIT_RULE_CLASS)
		    .should().resideInAnyPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS, TechnologyArchUnitPackageConstant.RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS);

	@ArchTest
	public static final ArchRule archunit_rule_classes_should_have_names_ending_with_the_word_archunit_rule = 
		    classes()
		    .that().resideInAnyPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS, TechnologyArchUnitPackageConstant.RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .should().haveSimpleNameEndingWith(TechnologyArchUnitNameConstant.SUFFIX_NAME_ARCHUNIT_RULE_CLASS);

	@ArchTest
	public static final ArchRule archunit_rule_classes_should_be_public = 
		    classes()
		    .that().resideInAnyPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS, TechnologyArchUnitPackageConstant.RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule no_archunit_rule_classes_should_be_reside_other_packages = 
			noClasses()
			.that().haveSimpleNameEndingWith(TechnologyArchUnitNameConstant.SUFFIX_NAME_ARCHUNIT_RULE_CLASS)
		    .should()
		    .resideOutsideOfPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .andShould().resideOutsideOfPackage(TechnologyArchUnitPackageConstant.RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS);
}
