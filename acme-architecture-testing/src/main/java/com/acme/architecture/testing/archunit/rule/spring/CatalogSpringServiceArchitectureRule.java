package com.acme.architecture.testing.archunit.rule.spring;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.springframework.stereotype.Service;

import com.acme.architecture.testing.archunit.constant.SpringArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSpringServiceArchitectureRule {

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_be_in_spring_service_package = classes().that()
			.haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_SERVICE_CLASS).should()
			.resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS);

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_have_names_ending_with_the_word_service = classes()
			.that().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS).should()
			.haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_SERVICE_CLASS);

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_be_interface = classes().that()
			.resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS).and()
			.haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_SERVICE_CLASS).should().beInterfaces();

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_not_be_annotated_with_service = classes()
			.that().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS).and()
			.haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_SERVICE_CLASS).should()
			.notBeAnnotatedWith(Service.class);
	
	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_not_be_placed_in_spring_service_impl_package = noClasses()
			.that().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS).should().beInterfaces();

	@ArchTest
	public static final ArchRule spring_service_interface_classes_should_not_be_access_controller = noClasses()
			.that().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS).should().accessClassesThat().resideInAnyPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS);
			

	
	
//	@ArchTest
//	public static final ArchRule spring_service_interface_classes_should_not_access_rest_controllers = noClasses()
//			.that().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS).should()
//			.accessClassesThat()
//			.resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS);
//
//	@ArchTest
//	static final ArchRule spring_service_interface_classes_should_only_be_accessed_by_controllers_or_other_services = classes()
//			.that().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS).should()
//			.onlyBeAccessed().byAnyPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS,
//					SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS);

}
