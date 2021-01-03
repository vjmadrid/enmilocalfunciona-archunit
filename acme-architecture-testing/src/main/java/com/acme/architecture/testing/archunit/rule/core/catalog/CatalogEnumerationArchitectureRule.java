package com.acme.architecture.testing.archunit.rule.core.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogEnumerationArchitectureRule {
	
	@ArchTest
	public static final ArchRule enumeration_classes_should_be_in_enumeration_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_ENUMERATION_CLASS)
		    .should().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ENUMERATION_CLASS);

	@ArchTest
	public static final ArchRule enumeration_classes_should_have_names_ending_with_the_word_enumeration = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ENUMERATION_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_ENUMERATION_CLASS);

	@ArchTest
	public static final ArchRule enumeration_classes_should_be_public_enum = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_PACKAGE_ENUMERATION_CLASS)
		    .should().bePublic().andShould().beEnums();
	
}
