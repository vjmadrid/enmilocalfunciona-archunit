package com.acme.architecture.testing.spring.archunit;

import com.acme.architecture.testing.spring.archunit.constant.TestingSpringArchUnitPackageConstant;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringConfigurationArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringRepositoryArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringRestControllerArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringServiceArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringServiceImplArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = TestingSpringArchUnitPackageConstant.PACKAGE_EXAMPLE, 
//importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class, ImportOption.DoNotIncludeArchives.class })
importOptions = { ImportOption.DoNotIncludeJars.class, ImportOption.DoNotIncludeArchives.class })
public class SpringGenericArchUnitArchitectureWithExampleTest {
	
	@ArchTest
	public static final ArchRules base_spring_configuration_architecture = ArchRules.in(CatalogSpringConfigurationArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_spring_service_architecture = ArchRules.in(CatalogSpringServiceArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_spring_service_impl_architecture = ArchRules.in(CatalogSpringServiceImplArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_spring_repository_architecture = ArchRules.in(CatalogSpringRepositoryArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_spring_rest_controller_architecture = ArchRules.in(CatalogSpringRestControllerArchitectureRule.class);
	
}
