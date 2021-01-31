package com.acme.architecture.testing.spring.archunit;

import com.acme.architecture.testing.spring.archunit.constant.TestingSpringArchUnitPackageConstant;
import com.acme.architecture.testing.spring.archunit.rule.group.CatalogSpringGroupArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = TestingSpringArchUnitPackageConstant.PACKAGE_BASE, 
importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class, ImportOption.DoNotIncludeArchives.class })
public class GlobalArchitectureTest {
	
	@ArchTest
	public static final ArchRules base_spring_global_architecture = ArchRules.in(CatalogSpringGroupArchitectureRule.class);
	
}
