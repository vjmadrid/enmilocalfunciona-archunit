package com.acme.architecture.testing.archunit.rule.core.group;

import com.acme.architecture.testing.archunit.rule.core.CatalogConstantArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogCustomAnnotationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDummyArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDummyDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogEnumerationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogExceptionArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogQueryRequestDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogRequestDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogResponseDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogSupportArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogUtilArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.CatalogArchunitRuleArchitectureRule;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

public class CatalogCoreGlobalArchitectureRule {

	@ArchTest
	public static final ArchRules base_constant_architecture = ArchRules.in(CatalogConstantArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_enumeration_architecture = ArchRules.in(CatalogEnumerationArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_exception_architecture = ArchRules.in(CatalogExceptionArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_util_architecture = ArchRules.in(CatalogUtilArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_support_architecture = ArchRules.in(CatalogSupportArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_archunit_rule_architecture = ArchRules.in(CatalogArchunitRuleArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_annotation_architecture = ArchRules.in(CatalogCustomAnnotationArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_dummy_architecture = ArchRules.in(CatalogDummyArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_data_factory_architecture = ArchRules.in(CatalogDataFactoryArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_dummy_data_factory_architecture = ArchRules.in(CatalogDummyDataFactoryArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_request_dto_architecture = ArchRules.in(CatalogRequestDtoArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_response_dto_architecture = ArchRules.in(CatalogResponseDtoArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_query_request_dto_architecture = ArchRules.in(CatalogQueryRequestDtoArchitectureRule.class);
	
}
