package com.acme.architecture.testing.archunit.rule.core.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogDataFactoryArchitectureRule;
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
public class CatalogDataFactoryArchitectureRuleTest {
	
	@ArchTest
	public static final ArchRule data_factory_classes_should_be_in_data_factory_package = CatalogDataFactoryArchitectureRule.data_factory_classes_should_be_in_data_factory_package;

	@ArchTest
	public static final ArchRule data_factory_classes_should_have_names_ending_with_the_word_data_factory = CatalogDataFactoryArchitectureRule.data_factory_classes_should_have_names_ending_with_the_word_data_factory;
	
	@ArchTest
	public static final ArchRule data_factory_classes_should_be_public = CatalogDataFactoryArchitectureRule.data_factory_classes_should_be_public;
	
	@ArchTest
	public static final ArchRule data_factory_classes_should_be_final = CatalogDataFactoryArchitectureRule.data_factory_classes_should_be_final;
	
	@ArchTest
	public static final ArchRule data_factory_classes_constructors_should_have_one_private_constructor = CatalogDataFactoryArchitectureRule.data_factory_classes_constructors_should_have_one_private_constructor;
	
	@ArchTest
	public static final ArchRule data_factory_classes_methods_should_be_public_static = CatalogDataFactoryArchitectureRule.data_factory_classes_methods_should_be_public_static;

}
