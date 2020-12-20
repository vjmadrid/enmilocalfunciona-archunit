package com.acme.architecture.testing.archunit.rule.core;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.acme.architecture.testing.archunit.constant.ArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogEnumerationArchitectureRule {
	
	@ArchTest
	public static final ArchRule enumeration_classes_should_be_in_enumeration_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_ENUMERATION_CLASS)
		    .should().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_ENUMERATION_CLASS);

	@ArchTest
	public static final ArchRule enumeration_classes_should_have_names_ending_with_the_word_enumeration = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_ENUMERATION_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_ENUMERATION_CLASS);

	@ArchTest
	public static final ArchRule enumeration_classes_should_be_public_enum = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENUMERATION_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_ENUMERATION_CLASS)
		    .should().bePublic().andShould().beEnums();
	
	@ArchTest
	public static final ArchRule no_enumeration_classes_should_be_reside_other_packages = 
			noClasses()
			.that().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_ENUMERATION_CLASS)
		    .should().resideOutsideOfPackage(ArchUnitConstant.RESIDE_PACKAGE_ENUMERATION_CLASS);
}
