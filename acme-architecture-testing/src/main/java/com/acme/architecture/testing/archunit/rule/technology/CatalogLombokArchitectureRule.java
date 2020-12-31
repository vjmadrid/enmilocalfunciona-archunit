package com.acme.architecture.testing.archunit.rule.technology;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import lombok.Getter;

public class CatalogLombokArchitectureRule {
	
	@ArchTest
	public static final ArchRule classes_should_be_annotated_with_getter = 
		    classes()
		    .should().beAnnotatedWith(Getter.class);

	@ArchTest
	public static final ArchRule entity_classes_should_be_annotated_with_getter = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_PACKAGE_ENTITY_CLASS)
		    .should().beAnnotatedWith(Getter.class);

}
