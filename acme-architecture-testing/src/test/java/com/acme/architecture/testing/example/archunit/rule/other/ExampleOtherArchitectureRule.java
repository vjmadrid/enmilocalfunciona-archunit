package com.acme.architecture.testing.example.archunit.rule.other;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class ExampleOtherArchitectureRule {
	
	@ArchTest
	public static final ArchRule example_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SUPPORT_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS)
		    .should().bePublic();
}
