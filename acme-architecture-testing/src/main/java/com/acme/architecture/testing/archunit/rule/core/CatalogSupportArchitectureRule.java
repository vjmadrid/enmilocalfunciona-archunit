package com.acme.architecture.testing.archunit.rule.core;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.acme.architecture.testing.archunit.constant.ArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSupportArchitectureRule {
	
	@ArchTest
	public static final ArchRule support_classes_should_be_in_support_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_SUPPORT_CLASS)
		    .should().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_SUPPORT_CLASS);

	@ArchTest
	public static final ArchRule support_classes_should_have_names_ending_with_the_word_support = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_SUPPORT_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_SUPPORT_CLASS);

	@ArchTest
	public static final ArchRule support_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_SUPPORT_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_SUPPORT_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule no_support_classes_should_be_reside_other_packages = 
			noClasses()
			.that().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_SUPPORT_CLASS)
		    .should().resideOutsideOfPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_SUPPORT_CLASS);
	
}
