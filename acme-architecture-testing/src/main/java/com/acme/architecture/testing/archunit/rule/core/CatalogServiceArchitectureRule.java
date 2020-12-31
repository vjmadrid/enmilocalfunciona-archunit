package com.acme.architecture.testing.archunit.rule.core;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogServiceArchitectureRule {
	
	@ArchTest
	public static final ArchRule service_interface_classes_should_be_in_service_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_SERVICE_CLASS)
		    .should().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_CLASS);
	
	@ArchTest
	public static final ArchRule service_interface_should_have_names_ending_with_the_word_service = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_SERVICE_CLASS);

	@ArchTest
	public static final ArchRule service_interface_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule service_interface_classes_should_be_interface = 
			classes()
			.that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_CLASS)
			.should().beInterfaces();
	
	
	@ArchTest
	public static final ArchRule service_interface_classes_should_not_be_placed_in_service_impl_package = 
			noClasses()
			.that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_IMPL_CLASS)
			.should().beInterfaces();
	
	@ArchTest
	public static final ArchRule no_service_interface_classes_should_be_reside_other_packages = 
			noClasses()
			.that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_SERVICE_CLASS)
		    .should().resideOutsideOfPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_CLASS);
	
	@ArchTest
	public static final ArchRule service_interface_classes_should_only_be_accessed_by_controllers_or_other_services = 
			classes()
			.that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_CLASS)
			.should()
			.onlyBeAccessed().byAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONTROLLER_CLASS, ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_CLASS);
	
}


