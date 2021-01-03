package com.acme.architecture.testing.archunit.rule.core.catalog;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogConstantArchitectureRule;
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
// Includes test classes
public class CatalogConstantArchitectureRuleTest {

	@ArchTest
	public static final ArchRule constant_classes_should_be_in_constant_package = CatalogConstantArchitectureRule.constant_classes_should_be_in_constant_package;

	@ArchTest
	public static final ArchRule constant_classes_should_have_names_ending_with_the_word_constant = CatalogConstantArchitectureRule.constant_classes_should_have_names_ending_with_the_word_constant;
	
	@ArchTest
	public static final ArchRule constant_classes_should_be_public = CatalogConstantArchitectureRule.constant_classes_should_be_public;
	
	@ArchTest
	public static final ArchRule constant_classes_should_be_final = CatalogConstantArchitectureRule.constant_classes_should_be_final;
	
	@ArchTest
	public static final ArchRule constant_classes_fields_should_be_public_static_final = CatalogConstantArchitectureRule.constant_classes_fields_should_be_public_static_final;
	
	@ArchTest
	public static final ArchRule constant_classes_fields_should_no_be_private = CatalogConstantArchitectureRule.constant_classes_fields_should_no_be_private;
	
	@ArchTest
	public static final ArchRule constant_classes_constructors_should_have_one_private_constructor = CatalogConstantArchitectureRule.constant_classes_constructors_should_have_one_private_constructor;

	@ArchTest
	public static final ArchRule constant_classes_should_no_have_methods = CatalogConstantArchitectureRule.constant_classes_should_no_have_methods;

}
