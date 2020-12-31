package com.acme.architecture.testing.archunit.rule.technology;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.technology.CatalogLombokArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = TestingArchUnitPackageConstant.PACKAGE_EXAMPLE+".lombok", 
importOptions = { 
		ImportOption.DoNotIncludeArchives.class, 
		ImportOption.DoNotIncludeJars.class 
}
)
//Includes test classes
public class CatalogLombokArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule entity_classes_should_be_annotated_with_getter = CatalogLombokArchitectureRule.entity_classes_should_be_annotated_with_getter;

	
}

