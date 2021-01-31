package com.acme.architecture.testing.archunit.rule.technology.group;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
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
public class CatalogTechnologyGroupArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRules group_technology_architecture = ArchRules.in(CatalogTechnologyGroupArchitectureRule.class);
	
}
