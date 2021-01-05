package com.acme.greeting.api.archunit.specific;

import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogConstantArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogDummyArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogEntityArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogMapperArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogMapperImplArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogUtilArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringConfigurationArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringRepositoryArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringRestControllerArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringServiceArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringServiceImplArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = "com.acme.greeting.api", 
	importOptions = { 
			ImportOption.DoNotIncludeTests.class,
			ImportOption.DoNotIncludeJars.class, 
			ImportOption.DoNotIncludeArchives.class 
	}
)
public class ApiSpecificArchitectureTest {
	
	// Core
	
	@ArchTest
	public static final ArchRules base_constant_architecture = ArchRules.in(CatalogConstantArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_dummy_architecture = ArchRules.in(CatalogDummyArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_entity_architecture = ArchRules.in(CatalogEntityArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_data_factory_architecture = ArchRules.in(CatalogDataFactoryArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_mapper_architecture = ArchRules.in(CatalogMapperArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_mapper_impl_architecture = ArchRules.in(CatalogMapperImplArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_util_architecture = ArchRules.in(CatalogUtilArchitectureRule.class);
	
	// Spring
	
	@ArchTest
	public static final ArchRules base_spring_configuration_architecture = ArchRules.in(CatalogSpringConfigurationArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_spring_repository_architecture = ArchRules.in(CatalogSpringRepositoryArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_spring_service_architecture = ArchRules.in(CatalogSpringServiceArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_spring_service_impl_architecture = ArchRules.in(CatalogSpringServiceImplArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_spring_rest_controller_architecture = ArchRules.in(CatalogSpringRestControllerArchitectureRule.class);
		
	
}
