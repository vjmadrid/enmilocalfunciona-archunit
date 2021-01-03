package com.acme.architecture.testing.spring.archunit.rule.catalog;

import com.acme.architecture.testing.spring.archunit.constant.TestingSpringArchUnitPackageConstant;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringConfigurationArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = TestingSpringArchUnitPackageConstant.PACKAGE_EXAMPLE, 
importOptions = { 
		ImportOption.DoNotIncludeArchives.class, 
		ImportOption.DoNotIncludeJars.class 
}
)
//Includes test classes
public class CatalogSpringConfigurationArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule spring_configuration_classes_should_be_in_spring_config_package = CatalogSpringConfigurationArchitectureRule.spring_configuration_classes_should_be_in_spring_config_package;

	@ArchTest
	public static final ArchRule spring_configuration_classes_should_have_names_ending_with_the_word_config = CatalogSpringConfigurationArchitectureRule.spring_configuration_classes_should_have_names_ending_with_the_word_config;
	
	@ArchTest
	public static final ArchRule spring_configuration_classes_should_be_annotated_with_configuration = CatalogSpringConfigurationArchitectureRule.spring_configuration_classes_should_be_annotated_with_configuration;

	@ArchTest
	public static final ArchRule spring_configuration_classes_should_be_public = CatalogSpringConfigurationArchitectureRule.spring_configuration_classes_should_be_public;

	@ArchTest
	public static final ArchRule spring_configuration_classes_methods_should_be_public = CatalogSpringConfigurationArchitectureRule.spring_configuration_classes_methods_should_be_public;
	
}

