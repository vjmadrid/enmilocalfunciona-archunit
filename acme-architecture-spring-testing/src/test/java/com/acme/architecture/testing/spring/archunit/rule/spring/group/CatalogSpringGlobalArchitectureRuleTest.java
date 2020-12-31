package com.acme.architecture.testing.spring.archunit.rule.spring.group;

import com.acme.architecture.testing.spring.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.spring.archunit.rule.group.CatalogSpringGlobalArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = TestingArchUnitPackageConstant.PACKAGE_EXAMPLE, 
importOptions = { 
		ImportOption.DoNotIncludeArchives.class, 
		ImportOption.DoNotIncludeJars.class 
}
)
//Includes test classes
public class CatalogSpringGlobalArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRules global_spring_architecture = ArchRules.in(CatalogSpringGlobalArchitectureRule.class);
	
}
