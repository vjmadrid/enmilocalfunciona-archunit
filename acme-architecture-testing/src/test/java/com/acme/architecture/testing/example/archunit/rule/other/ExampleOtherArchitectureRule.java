package com.acme.architecture.testing.example.archunit.rule.other;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.architecture.testing.archunit.constant.ArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class ExampleOtherArchitectureRule {
	
	@ArchTest
	public static final ArchRule example_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_SUPPORT_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .should().bePublic();
}
