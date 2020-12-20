package com.acme.architecture.testing.archunit.rule.core;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import java.io.Serializable;

import com.acme.architecture.testing.archunit.constant.ArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogEntityArchitectureRule {
	
	@ArchTest
	public static final ArchRule entity_classes_should_be_in_entity_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_ENTITY_CLASS)
		    .should().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS);

	@ArchTest
	public static final ArchRule entity_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule entity_classes_should_implements_serializable = 
			classes()
			    .that().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
			    .should().implement(Serializable.class);
}


