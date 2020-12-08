package com.acme.architecture.testing.archunit;

import com.acme.architecture.testing.archunit.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.CatalogGenericArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringGlobalArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = ArchUnitPackageConstant.PACKAGE_BASE, 
importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class, ImportOption.DoNotIncludeArchives.class })
public class GlobalArchitectureTest {
	
	@ArchTest
	public static final ArchRules base_global_architecture = ArchRules.in(CatalogGenericArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_spring_global_architecture = ArchRules.in(CatalogSpringGlobalArchitectureRule.class);
	
}
