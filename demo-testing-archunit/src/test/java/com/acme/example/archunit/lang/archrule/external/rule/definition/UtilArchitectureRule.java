package com.acme.example.archunit.lang.archrule.external.rule.definition;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

import com.acme.example.archunit.constant.ArchUnitConstant;
import com.acme.example.archunit.lang.archrule.external.rule.definition.base.BaseUtilArchitectureRule;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class UtilArchitectureRule extends BaseUtilArchitectureRule {
	
	@ArchTest
	public static final ArchRule util_classes_methods_should_be_static = methods().that().arePublic()
			.and().areDeclaredInClassesThat().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_UTIL_CLASS)
			.and().areDeclaredInClassesThat().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_UTIL_CLASS)
			.should().beStatic();

}
