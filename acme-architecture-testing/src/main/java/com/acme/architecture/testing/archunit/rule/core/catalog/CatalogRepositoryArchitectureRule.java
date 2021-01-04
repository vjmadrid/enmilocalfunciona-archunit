package com.acme.architecture.testing.archunit.rule.core.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogRepositoryArchitectureRule {
	
	@ArchTest
	public static final ArchRule repository_interface_classes_should_be_in_repository_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_REPOSITORY_CLASS)
		    .should().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_CLASS);
	
	@ArchTest
	public static final ArchRule repository_interface_should_have_names_ending_with_the_word_repository = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_REPOSITORY_CLASS);

	@ArchTest
	public static final ArchRule repository_interface_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule repository_interface_classes_should_be_interface = 
			classes()
			.that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_CLASS)
			.should().beInterfaces();
	
	
	@ArchTest
	public static final ArchRule repository_interface_classes_should_not_be_placed_in_repository_impl_package = 
			noClasses()
			.that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_IMPL_CLASS)
			.should().beInterfaces();
	
	@ArchTest
	public static final ArchRule repository_interface_classes_should_only_be_accessed_by_services_impl = 
			classes()
			.that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_CLASS)
			.should()
			.onlyBeAccessed().byAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_IMPL_CLASS);
	
}


