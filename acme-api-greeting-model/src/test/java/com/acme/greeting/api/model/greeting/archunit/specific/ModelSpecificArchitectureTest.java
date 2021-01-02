package com.acme.greeting.api.model.greeting.archunit.specific;

import com.acme.architecture.testing.archunit.rule.core.CatalogConstantArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDummyArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogQueryRequestDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogRequestDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogResponseDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogUtilArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = "com.acme.greeting.api.model.greeting", 
	importOptions = { 
			ImportOption.DoNotIncludeTests.class,
			ImportOption.DoNotIncludeJars.class, 
			ImportOption.DoNotIncludeArchives.class 
	}
)
public class ModelSpecificArchitectureTest {
	
	@ArchTest
	public static final ArchRules base_constant_architecture = ArchRules.in(CatalogConstantArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_dummy_architecture = ArchRules.in(CatalogDummyArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_util_architecture = ArchRules.in(CatalogUtilArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_query_request_dto_architecture = ArchRules.in(CatalogQueryRequestDtoArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_request_dto_architecture = ArchRules.in(CatalogRequestDtoArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_response_dto_architecture = ArchRules.in(CatalogResponseDtoArchitectureRule.class);
	
}
