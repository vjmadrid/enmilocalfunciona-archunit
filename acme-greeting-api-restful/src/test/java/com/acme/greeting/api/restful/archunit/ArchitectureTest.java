package com.acme.greeting.api.restful.archunit;

import com.acme.architecture.testing.archunit.rule.core.group.CatalogCoreGlobalArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.group.CatalogSpringGlobalArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = "com.acme.greeting.api.restful", 
	importOptions = { 
			ImportOption.DoNotIncludeTests.class,
			ImportOption.DoNotIncludeJars.class, 
			ImportOption.DoNotIncludeArchives.class 
	}
)
public class ArchitectureTest {
	
	@ArchTest
	public static final ArchRules global_core_architecture = ArchRules.in(CatalogCoreGlobalArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules global_spring_architecture = ArchRules.in(CatalogSpringGlobalArchitectureRule.class);
	
}
