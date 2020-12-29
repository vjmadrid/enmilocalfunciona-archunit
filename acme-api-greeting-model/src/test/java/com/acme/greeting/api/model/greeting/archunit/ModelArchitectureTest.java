package com.acme.greeting.api.model.greeting.archunit;

import com.acme.architecture.testing.archunit.rule.core.group.CatalogCoreGlobalArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = "com.acme.greeting.api.model.greeting", 
	importOptions = { 
			ImportOption.DoNotIncludeTests.class,
			ImportOption.DoNotIncludeJars.class, 
			ImportOption.DoNotIncludeArchives.class 
	}
)
public class ModelArchitectureTest {
	
	@ArchTest
	public static final ArchRules global_core_architecture = ArchRules.in(CatalogCoreGlobalArchitectureRule.class);
	
}
