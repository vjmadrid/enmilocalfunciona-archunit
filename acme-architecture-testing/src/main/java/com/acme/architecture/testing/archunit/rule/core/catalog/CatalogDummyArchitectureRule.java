package com.acme.architecture.testing.archunit.rule.core.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogDummyArchitectureRule {
	
	@ArchTest
	public static final ArchRule dummy_classes_should_be_in_dummy_package = 
		    classes()
		    .that().haveSimpleNameStartingWith(ArchUnitNameConstant.PREFIX_NAME_DUMMY_CLASS)
		    .should().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_CLASS);

	@ArchTest
	public static final ArchRule dummy_classes_should_have_names_starting_with_the_word_dummy = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_CLASS)
		    .should().haveSimpleNameStartingWith(ArchUnitNameConstant.PREFIX_NAME_DUMMY_CLASS);

	@ArchTest
	public static final ArchRule dummy_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_CLASS)
		    .and().haveSimpleNameStartingWith(ArchUnitNameConstant.PREFIX_NAME_DUMMY_CLASS)
		    .should().bePublic();
	
}
