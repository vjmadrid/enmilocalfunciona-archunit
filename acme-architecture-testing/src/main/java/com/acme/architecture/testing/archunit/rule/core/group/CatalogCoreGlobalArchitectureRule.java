package com.acme.architecture.testing.archunit.rule.core.group;

import com.acme.architecture.testing.archunit.rule.core.CatalogConstantArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogCustomAnnotationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDummyArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDummyDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogEntityArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogEnumerationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogExceptionArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogMapperArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogMapperImplArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogQueryRequestDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogRepositoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogRepositoryImplArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogRequestDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogResponseDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogServiceArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogServiceImplArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogSupportArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogUtilArchitectureRule;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

public class CatalogCoreGlobalArchitectureRule {

	@ArchTest
	public static final ArchRules base_constant_architecture = ArchRules.in(CatalogConstantArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_annotation_architecture = ArchRules.in(CatalogCustomAnnotationArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_data_factory_architecture = ArchRules.in(CatalogDataFactoryArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_dummy_architecture = ArchRules.in(CatalogDummyArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_dummy_data_factory_architecture = ArchRules.in(CatalogDummyDataFactoryArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_entity_architecture = ArchRules.in(CatalogEntityArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_enumeration_architecture = ArchRules.in(CatalogEnumerationArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_exception_architecture = ArchRules.in(CatalogExceptionArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_mapper_architecture = ArchRules.in(CatalogMapperArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_mapper_impl_architecture = ArchRules.in(CatalogMapperImplArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_query_request_dto_architecture = ArchRules.in(CatalogQueryRequestDtoArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_repository_architecture = ArchRules.in(CatalogRepositoryArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_repository_impl_architecture = ArchRules.in(CatalogRepositoryImplArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_request_dto_architecture = ArchRules.in(CatalogRequestDtoArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_response_dto_architecture = ArchRules.in(CatalogResponseDtoArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_service_architecture = ArchRules.in(CatalogServiceArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_service_impl_architecture = ArchRules.in(CatalogServiceImplArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_support_architecture = ArchRules.in(CatalogSupportArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_util_architecture = ArchRules.in(CatalogUtilArchitectureRule.class);
	
}
