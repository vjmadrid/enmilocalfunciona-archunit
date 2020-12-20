package com.acme.greeting.api.restful.archunit;

import com.acme.architecture.testing.archunit.rule.core.CatalogConstantArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogEntityArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringConfigurationArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = "com.acme.greeting.api.restful", importOptions = { ImportOption.DoNotIncludeTests.class,
		ImportOption.DoNotIncludeJars.class, ImportOption.DoNotIncludeArchives.class })
public class SpecificArchitectureTest {
	
	@ArchTest
	public static final ArchRules base_spring_configuration_architecture = ArchRules.in(CatalogSpringConfigurationArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_constant_architecture = ArchRules.in(CatalogConstantArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_entity_architecture = ArchRules.in(CatalogEntityArchitectureRule.class);
	
}
