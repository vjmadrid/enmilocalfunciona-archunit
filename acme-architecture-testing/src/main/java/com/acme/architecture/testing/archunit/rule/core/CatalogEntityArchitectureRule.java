package com.acme.architecture.testing.archunit.rule.core;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import java.io.Serializable;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogEntityArchitectureRule {
	
	@ArchTest
	public static final ArchRule entity_classes_should_be_in_entity_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_ENTITY_CLASS)
		    .should().resideInAPackage(ArchUnitPackageConstant.RESIDE_PACKAGE_ENTITY_CLASS);

	@ArchTest
	public static final ArchRule entity_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_PACKAGE_ENTITY_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule entity_classes_should_implements_serializable = 
			classes()
			    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_PACKAGE_ENTITY_CLASS)
			    .should().implement(Serializable.class);
}


