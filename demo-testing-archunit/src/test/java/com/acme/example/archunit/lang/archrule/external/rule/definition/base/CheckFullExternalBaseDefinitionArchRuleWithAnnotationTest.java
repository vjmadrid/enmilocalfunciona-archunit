package com.acme.example.archunit.lang.archrule.external.rule.definition.base;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

//@RunWith(ArchUnitRunner.class) // Important: Only for JUnit 4 and not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example", 
importOptions = { 
		ImportOption.DoNotIncludeTests.class, 
		ImportOption.DoNotIncludeJars.class, 
		ImportOption.DoNotIncludeArchives.class 
})
public class CheckFullExternalBaseDefinitionArchRuleWithAnnotationTest {
	
	@ArchTest
	public static final ArchRules base_constant_architecture = ArchRules.in(BaseConstantArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_entity_architecture = ArchRules.in(BaseEntityArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_util_architecture = ArchRules.in(BaseUtilArchitectureRule.class);
	
}
