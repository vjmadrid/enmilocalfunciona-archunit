package com.acme.architecture.testing.archunit.rule.spring.group;

import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringConfigurationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringRestControllerArchitectureRule;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

public class CatalogSpringGlobalArchitectureRule {
	
	@ArchTest
	public static final ArchRules base_spring_configuration_architecture = ArchRules.in(CatalogSpringConfigurationArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_spring_rest_controller_architecture = ArchRules.in(CatalogSpringRestControllerArchitectureRule.class);
	
}
