package com.acme.architecture.testing.spring.archunit.rule.spring;

import com.acme.architecture.testing.spring.archunit.constant.TestingSpringArchUnitPackageConstant;
import com.acme.architecture.testing.spring.archunit.rule.CatalogSpringRepositoryArchitectureRule;
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
	
	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_in_spring_repository_package = CatalogSpringRepositoryArchitectureRule.spring_repository_classes_should_be_in_spring_repository_package;

	@ArchTest
	public static final ArchRule spring_repository_classes_should_have_names_ending_with_the_word_repository = CatalogSpringRepositoryArchitectureRule.spring_repository_classes_should_have_names_ending_with_the_word_repository;
	
	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_public = CatalogSpringRepositoryArchitectureRule.spring_repository_classes_should_be_public;

	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_interface = CatalogSpringRepositoryArchitectureRule.spring_repository_classes_should_be_interface;

	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_annotated_with_repository = CatalogSpringRepositoryArchitectureRule.spring_repository_classes_should_be_annotated_with_repository;

	@ArchTest
	public static final ArchRule no_spring_repository_classes_should_be_reside_other_packages = CatalogSpringRepositoryArchitectureRule.no_spring_repository_classes_should_be_reside_other_packages;

}

