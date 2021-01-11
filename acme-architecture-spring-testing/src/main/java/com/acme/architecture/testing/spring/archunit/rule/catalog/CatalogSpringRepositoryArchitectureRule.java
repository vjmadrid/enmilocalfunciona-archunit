package com.acme.architecture.testing.spring.archunit.rule.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogRepositoryArchitectureRule;
import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.spring.constant.SpringArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSpringRepositoryArchitectureRule {

	// Common
	
	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_in_spring_repository_package = CatalogRepositoryArchitectureRule.repository_interface_classes_should_be_in_repository_package;

	@ArchTest
	public static final ArchRule spring_repository_classes_should_have_names_ending_with_the_word_repository = CatalogRepositoryArchitectureRule.repository_interface_should_have_names_ending_with_the_word_repository;

	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_public = CatalogRepositoryArchitectureRule.repository_interface_classes_should_be_public;

	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_interface = CatalogRepositoryArchitectureRule.repository_interface_classes_should_be_interface;
	
	@ArchTest
	public static final ArchRule spring_repository_interface_classes_should_not_be_placed_in_repository_impl_package = CatalogRepositoryArchitectureRule.repository_interface_classes_should_not_be_placed_in_repository_impl_package;

	@ArchTest
	public static final ArchRule spring_repository_interface_classes_should_only_be_accessed_by_spring_services_impl = CatalogRepositoryArchitectureRule.repository_interface_classes_should_only_be_accessed_by_services_impl;

	// Specific
	
	@ArchTest
	public static final ArchRule no_spring_repository_classes_should_be_reside_in_repository_impl_package = 
			noClasses()
			.that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_IMPL_CLASS)
			.and().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_REPOSITORY_CLASS)
		    .should().resideOutsideOfPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS);
	
	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_annotated_with_repository = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS)
		    .should().beAnnotatedWith(Repository.class);

	@ArchTest
	public static final ArchRule spring_repository_classes_should_extends_jparepository = 
			classes()
			.that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS)
			.and().areAnnotatedWith(Repository.class)
			.should().beAssignableTo(JpaRepository.class);
			
	@ArchTest
	public static final ArchRule spring_repository_classes_should_no_depend_on_mapper = 
			noClasses()
			.that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS)
			.should().dependOnClassesThat().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_CLASS);
	
	@ArchTest
	public static final ArchRule spring_repository_classes_should_no_depend_on_spring_service_interface_and_spring_service_impl = 
			noClasses()
			.that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS)
			.should().dependOnClassesThat().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS)
			.andShould().dependOnClassesThat().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_IMPL_CLASS);
	
	@ArchTest
	public static final ArchRule spring_repository_classes_should_no_depend_on_spring_rest_controller = 
			noClasses()
			.that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS)
			.should().dependOnClassesThat().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS);
	
}
