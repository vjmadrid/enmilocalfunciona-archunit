package com.acme.architecture.testing.archunit.rule.core.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogResponseDtoArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = TestingArchUnitPackageConstant.PACKAGE_EXAMPLE, 
importOptions = { 
		ImportOption.DoNotIncludeArchives.class, 
		ImportOption.DoNotIncludeJars.class 
	}
)
//Includes test classes
public class CatalogResponseDtoArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule response_dto_classes_should_be_in_response_dto_package = CatalogResponseDtoArchitectureRule.response_dto_classes_should_be_in_response_dto_package;

	@ArchTest
	public static final ArchRule response_dto_classes_should_be_public = CatalogResponseDtoArchitectureRule.response_dto_classes_should_be_public;

	@ArchTest
	public static final ArchRule response_dto_classes_should_implements_serializable = CatalogResponseDtoArchitectureRule.response_dto_classes_should_implements_serializable;

}
