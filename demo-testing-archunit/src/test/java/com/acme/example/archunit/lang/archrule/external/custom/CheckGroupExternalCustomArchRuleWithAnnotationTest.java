package com.acme.example.archunit.lang.archrule.external.custom;

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
public class CheckGroupExternalCustomArchRuleWithAnnotationTest {
	
	@ArchTest
	public static final ArchRules entity_architecture = ArchRules.in(CheckFullExternalEntityArchRuleWithAnnotationTest.class);
	
	@ArchTest
	public static final ArchRules utility_architecture = ArchRules.in(CheckFullExternalUtilArchRuleWithAnnotationTest.class);
	
}