package com.acme.example.archunit.lang.archrule.external.rule.definition.base;


import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.example.archunit.constant.ArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class BaseUtilArchitectureRule {
	
	@ArchTest
	public static final ArchRule util_classes_should_be_in_util_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_UTIL_CLASS)
		    .should().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_UTIL_CLASS);

	@ArchTest
	public static final ArchRule util_classes_should_have_names_ending_with_the_word_util = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_UTIL_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_UTIL_CLASS);

	@ArchTest
	public static final ArchRule util_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_UTIL_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_UTIL_CLASS)
		    .should().bePublic();
}
