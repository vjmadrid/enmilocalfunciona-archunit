package com.acme.example.archunit.lang.archrule.external.rule.definition.base;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.example.archunit.constant.ArchUnitConstant;
import com.tngtech.archunit.lang.ArchRule;

public class BaseEntityArchitectureRule {
	
	public static final ArchRule entity_classes_should_be_in_entity_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_ENTITY_CLASS)
		    .should().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS);
	
	public static final ArchRule entity_classes_should_be_in_domain_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_ENTITY_CLASS)
		    .should().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_DOMAIN_CLASS);
	
	public static final ArchRule entity_classes_should_have_names_ending_with_the_word_entity = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_ENTITY_CLASS);
	
	public static final ArchRule entity_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
		    .should().bePublic();
	
}





