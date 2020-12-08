package com.acme.example.archunit.lang.archrule.external.custom;

import com.acme.example.archunit.lang.archrule.external.rule.definition.base.BaseUtilArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

//@RunWith(ArchUnitRunner.class) // Important: Only for JUnit 4 and not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example", 
importOptions = { 
		ImportOption.DoNotIncludeTests.class, 
		ImportOption.DoNotIncludeJars.class, 
		ImportOption.DoNotIncludeArchives.class 
})
public class CheckFullExternalUtilArchRuleWithAnnotationTest {
	
	@ArchTest
	public static final ArchRule utility_classes_are_located_in_util_package = BaseUtilArchitectureRule.util_classes_should_be_in_util_package;
	
	@ArchTest
	public static final ArchRule utility_methods_should_be_static = BaseUtilArchitectureRule.util_classes_should_be_in_util_package;
	
}