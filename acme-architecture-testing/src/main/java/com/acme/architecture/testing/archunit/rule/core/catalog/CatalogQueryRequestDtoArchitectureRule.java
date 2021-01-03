package com.acme.architecture.testing.archunit.rule.core.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import java.io.Serializable;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogQueryRequestDtoArchitectureRule {
	
	@ArchTest
	public static final ArchRule query_request_dto_classes_should_be_in_query_request_dto_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_QUERY_REQUEST_DTO_CLASS)
		    .and().haveSimpleNameNotStartingWith(ArchUnitNameConstant.PREFIX_NAME_DUMMY_CLASS)
		    .should().resideInAPackage(ArchUnitPackageConstant.RESIDE_PACKAGE_QUERY_REQUEST_DTO_CLASS);

	@ArchTest
	public static final ArchRule query_request_dto_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_PACKAGE_QUERY_REQUEST_DTO_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule query_request_dto_classes_should_implements_serializable = 
			classes()
			    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_PACKAGE_QUERY_REQUEST_DTO_CLASS)
			    .should().implement(Serializable.class);
}


