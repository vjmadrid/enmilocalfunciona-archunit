package com.acme.architecture.testing.archunit.rule.core.catalog;

import static com.tngtech.archunit.core.domain.JavaModifier.FINAL;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.constructors;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogUtilArchitectureRule {
	
	@ArchTest
	public static final ArchRule util_classes_should_be_in_util_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_UTIL_CLASS)
		    .should().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_UTIL_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_UTIL_CLASS);

	@ArchTest
	public static final ArchRule util_classes_should_have_names_ending_with_the_word_util = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_UTIL_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_UTIL_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_UTIL_CLASS);

	@ArchTest
	public static final ArchRule util_classes_should_be_public = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_UTIL_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_UTIL_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule util_classes_should_be_final = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_UTIL_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_UTIL_CLASS)
		    .should().haveModifier(FINAL);
	
	@ArchTest
	public static final ArchRule util_classes_constructors_should_have_one_private_constructor = 
			constructors()
			.that().areDeclaredInClassesThat().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_UTIL_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_UTIL_CLASS)
			.should().bePrivate();
	
	@ArchTest
	public static final ArchRule util_classes_methods_should_be_static = 
			methods()
			.that().arePublic()
			.and().areDeclaredInClassesThat().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_UTIL_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_UTIL_CLASS)
			.should().beStatic();
	
}
