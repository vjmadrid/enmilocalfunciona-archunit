package com.acme.architecture.testing.spring.archunit.rule.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.architecture.testing.spring.constant.SpringArchUnitNameConstant;
import com.acme.architecture.testing.spring.constant.SpringArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSpringRestControllerArchitectureRule {

	@ArchTest
	public static final ArchRule spring_rest_controller_classes_should_be_in_spring_rest_controller_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(SpringArchUnitNameConstant.SUFFIX_NAME_SPRING_REST_CONTROLLER_CLASS)
		    .should().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS);
	
	@ArchTest
	public static final ArchRule spring_rest_controller_classes_should_have_names_ending_with_the_word_rest_controller = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS)
		    .should().haveSimpleNameEndingWith(SpringArchUnitNameConstant.SUFFIX_NAME_SPRING_REST_CONTROLLER_CLASS);
	
	@ArchTest
	public static final ArchRule spring_rest_controller_classes_should_be_annotated_with_rest_controller = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS)
		    .and().haveSimpleNameEndingWith(SpringArchUnitNameConstant.SUFFIX_NAME_SPRING_REST_CONTROLLER_CLASS)
		    .should().beAnnotatedWith(RestController.class);
	
	@ArchTest
	public static final ArchRule spring_rest_controller_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule spring_rest_controller_classes_should_depend_on_spring_service = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS)
		    .should().dependOnClassesThat()
            .resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS);
	
	@ArchTest
	public static final ArchRule spring_rest_controller_classes_should_no_depend_on_spring_rest_controller = 
			noClasses()
			.that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS)
			.should().dependOnClassesThat()
            .resideInAnyPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS);
	
	@ArchTest
	public static final ArchRule spring_rest_controller_classes_should_no_depend_on_spring_repository = 
			noClasses()
			.that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS)
			.should().dependOnClassesThat()
            .resideInAnyPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS, SpringArchUnitPackageConstant.RESIDE_PACKAGE_SPRING_REPOSITORY_CLASS);
	
	@ArchTest
	public static final ArchRule spring_rest_controller_classes_should_no_depend_on_spring_service_impl = 
			noClasses()
			.that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS)
			.should().dependOnClassesThat()
            .resideInAnyPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_IMPL_CLASS, SpringArchUnitPackageConstant.RESIDE_PACKAGE_SPRING_SERVICE_IMPL_CLASS);
	
}
