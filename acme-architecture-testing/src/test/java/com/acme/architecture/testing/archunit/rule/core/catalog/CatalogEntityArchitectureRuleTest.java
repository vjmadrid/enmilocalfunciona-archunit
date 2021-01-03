package com.acme.architecture.testing.archunit.rule.core.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogEntityArchitectureRule;
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
public class CatalogEntityArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule entity_classes_should_be_in_entity_package = CatalogEntityArchitectureRule.entity_classes_should_be_in_entity_package;

	@ArchTest
	public static final ArchRule entity_classes_should_be_public = CatalogEntityArchitectureRule.entity_classes_should_be_public;

	@ArchTest
	public static final ArchRule entity_classes_should_implements_serializable = CatalogEntityArchitectureRule.entity_classes_should_implements_serializable;

}
