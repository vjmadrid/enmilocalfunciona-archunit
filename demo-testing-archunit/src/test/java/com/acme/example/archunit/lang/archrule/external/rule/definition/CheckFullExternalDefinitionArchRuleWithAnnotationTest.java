package com.acme.example.archunit.lang.archrule.external.rule.definition;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = "com.acme.example", 
importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class, ImportOption.DoNotIncludeArchives.class })
public class CheckFullExternalDefinitionArchRuleWithAnnotationTest {
	
	@ArchTest
	public static final ArchRules entity_architecture = ArchRules.in(EntityArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules util_architecture = ArchRules.in(UtilArchitectureRule.class);
	
}
