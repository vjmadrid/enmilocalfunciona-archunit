package com.acme.architecture.testing.archunit.rule.spring;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.springframework.web.bind.annotation.RestController;

import com.acme.architecture.testing.archunit.constant.SpringArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSpringRestControllerArchitectureRule {

	@ArchTest
	public static final ArchRule spring_rest_controller_classes_should_be_in_spring_rest_controller_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_REST_CONTROLLER_CLASS)
		    .should().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS);
	
	@ArchTest
	public static final ArchRule spring_rest_controller_classes_should_have_names_ending_with_the_word_rest_controller = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS)
		    .should().haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_REST_CONTROLLER_CLASS);
	
	@ArchTest
	public static final ArchRule spring_rest_controller_classes_should_be_annotated_with_rest_controller = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS)
		    .and().haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_REST_CONTROLLER_CLASS)
		    .should().beAnnotatedWith(RestController.class);
	
	@ArchTest
	public static final ArchRule no_spring_rest_controller_classes_should_be_reside_other_packages = 
			noClasses()
			.that().areAnnotatedWith(RestController.class)
		    .should().resideOutsideOfPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS);
	  
}
