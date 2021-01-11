package com.acme.greeting.api.archunit;

import com.acme.architecture.testing.spring.archunit.rule.layered.architecture.CatalogSpringLayeredArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "com.acme.greeting.api", 
importOptions = { 
		ImportOption.DoNotIncludeTests.class
	}
)
public class ApiLayeredUseDefaultArchitectureTest {
		
	@ArchTest
	public static final ArchRule spring_api_layered_architecture_should_have_a_default_definition =  CatalogSpringLayeredArchitectureRule.spring_api_layered_architecture_should_have_a_default_definition;
	
}
