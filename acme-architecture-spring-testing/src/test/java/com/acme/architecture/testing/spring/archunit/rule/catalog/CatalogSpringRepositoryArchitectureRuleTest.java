package com.acme.architecture.testing.spring.archunit.rule.catalog;

import com.acme.architecture.testing.spring.archunit.constant.TestingSpringArchUnitPackageConstant;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringRepositoryArchitectureRule;
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
public class CatalogSpringRepositoryArchitectureRuleTest {
	
	// Common
	
	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_in_spring_repository_package = CatalogSpringRepositoryArchitectureRule.spring_repository_classes_should_be_in_spring_repository_package;

	@ArchTest
	public static final ArchRule spring_repository_classes_should_have_names_ending_with_the_word_repository = CatalogSpringRepositoryArchitectureRule.spring_repository_classes_should_have_names_ending_with_the_word_repository;
	
	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_public = CatalogSpringRepositoryArchitectureRule.spring_repository_classes_should_be_public;

	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_interface = CatalogSpringRepositoryArchitectureRule.spring_repository_classes_should_be_interface;
	
	@ArchTest
	public static final ArchRule spring_repository_interface_classes_should_not_be_placed_in_repository_impl_package = CatalogSpringRepositoryArchitectureRule.spring_repository_interface_classes_should_not_be_placed_in_repository_impl_package;

	// Specific
	
	@ArchTest
	public static final ArchRule no_spring_repository_classes_should_be_reside_in_repository_impl_package = CatalogSpringRepositoryArchitectureRule.no_spring_repository_classes_should_be_reside_in_repository_impl_package;

	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_annotated_with_repository = CatalogSpringRepositoryArchitectureRule.spring_repository_classes_should_be_annotated_with_repository;

	
	@ArchTest
	public static final ArchRule spring_repository_classes_should_extends_jparepository = CatalogSpringRepositoryArchitectureRule.spring_repository_classes_should_extends_jparepository;

}

