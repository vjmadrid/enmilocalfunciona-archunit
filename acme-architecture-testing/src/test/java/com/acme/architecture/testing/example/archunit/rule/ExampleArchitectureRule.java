package com.acme.architecture.testing.example.archunit.rule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.architecture.testing.constant.TechnologyArchUnitNameConstant;
import com.acme.architecture.testing.constant.TechnologyArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class ExampleArchitectureRule {
	
	@ArchTest
	public static final ArchRule archunit_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .and().haveSimpleNameEndingWith(TechnologyArchUnitNameConstant.SUFFIX_NAME_ARCHUNIT_RULE_CLASS)
		    .should().bePublic();
}
