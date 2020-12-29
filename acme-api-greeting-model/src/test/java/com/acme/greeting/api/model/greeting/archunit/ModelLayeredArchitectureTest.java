package com.acme.greeting.api.model.greeting.archunit;

import com.acme.architecture.testing.archunit.rule.layered.architecture.CatalogModelLayeredArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "com.acme.greeting.api.model.greeting", 
importOptions = { 
		ImportOption.DoNotIncludeTests.class,
		ImportOption.DoNotIncludeJars.class, 
		ImportOption.DoNotIncludeArchives.class 
	}
)
public class ModelLayeredArchitectureTest {
	
	@ArchTest
	public static final ArchRule model_layered_architecture_should_have_a_default_definition = CatalogModelLayeredArchitectureRule.model_layered_architecture_should_have_a_default_definition;

}
