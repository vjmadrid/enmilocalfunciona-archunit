package com.acme.architecture.testing.archunit.rule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.architecture.testing.archunit.constant.ArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogDummyArchitectureRule {
	
	@ArchTest
	public static final ArchRule dummy_classes_should_be_in_dummy_package = 
		    classes()
		    .that().haveSimpleNameStartingWith(ArchUnitConstant.PREFIX_NAME_DUMMY_CLASS)
		    .should().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_DUMMY_CLASS);

	@ArchTest
	public static final ArchRule dummy_classes_should_have_names_starting_with_the_word_dummy = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_DUMMY_CLASS)
		    .should().haveSimpleNameStartingWith(ArchUnitConstant.PREFIX_NAME_DUMMY_CLASS);

	@ArchTest
	public static final ArchRule dummy_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_DUMMY_CLASS)
		    .and().haveSimpleNameStartingWith(ArchUnitConstant.PREFIX_NAME_DUMMY_CLASS)
		    .should().bePublic();
}
