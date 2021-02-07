package com.acme.greeting.api.model.greeting.archunit.sonar;

import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogConstantArchitectureRule;
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
public class CheckArchitectureOnlyUsesAnnotationArchTestOnAttributesArchRulesGroupTest {
	
	@ArchTest
	public static final ArchRules base_constant_architecture = ArchRules.in(CatalogConstantArchitectureRule.class);
	
}
