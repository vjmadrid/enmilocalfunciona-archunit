package com.acme.architecture.testing.archunit.rule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

import com.acme.architecture.testing.archunit.constant.ArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogUtilArchitectureRule {
	
	@ArchTest
	public static final ArchRule util_classes_should_be_in_util_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_UTIL_CLASS)
		    .should().resideInAnyPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_UTIL_CLASS, ArchUnitConstant.RESIDE_PACKAGE_UTIL_CLASS);

	@ArchTest
	public static final ArchRule util_classes_should_have_names_ending_with_the_word_util = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_UTIL_CLASS, ArchUnitConstant.RESIDE_PACKAGE_UTIL_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_UTIL_CLASS);

	@ArchTest
	public static final ArchRule util_classes_should_be_public = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_UTIL_CLASS, ArchUnitConstant.RESIDE_PACKAGE_UTIL_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_UTIL_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule util_classes_methods_should_be_static = methods().that().arePublic()
			.and().areDeclaredInClassesThat().resideInAnyPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_UTIL_CLASS, ArchUnitConstant.RESIDE_PACKAGE_UTIL_CLASS)
			.and().areDeclaredInClassesThat().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_UTIL_CLASS)
			.should().beStatic();
}