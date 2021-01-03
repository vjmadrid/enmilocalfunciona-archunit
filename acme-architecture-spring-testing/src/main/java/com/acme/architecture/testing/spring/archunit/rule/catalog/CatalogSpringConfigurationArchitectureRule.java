package com.acme.architecture.testing.spring.archunit.rule.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

import org.springframework.context.annotation.Configuration;

import com.acme.architecture.testing.spring.constant.SpringArchUnitNameConstant;
import com.acme.architecture.testing.spring.constant.SpringArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSpringConfigurationArchitectureRule {

	@ArchTest
	public static final ArchRule spring_configuration_classes_should_be_in_spring_config_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(SpringArchUnitNameConstant.SUFFIX_NAME_SPRING_CONFIG_CLASS)
		    .should().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_PACKAGE_SPRING_CONFIG_CLASS);
	
	@ArchTest
	public static final ArchRule spring_configuration_classes_should_have_names_ending_with_the_word_config = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_PACKAGE_SPRING_CONFIG_CLASS)
		    .should().haveSimpleNameEndingWith(SpringArchUnitNameConstant.SUFFIX_NAME_SPRING_CONFIG_CLASS);
	
	@ArchTest
	public static final ArchRule spring_configuration_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_PACKAGE_SPRING_CONFIG_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule spring_configuration_classes_should_be_annotated_with_configuration = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_PACKAGE_SPRING_CONFIG_CLASS)
		    .should().beAnnotatedWith(Configuration.class);
	
	@ArchTest
	public static final ArchRule spring_configuration_classes_methods_should_be_public = 
			methods()
			.that().areDeclaredInClassesThat().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_PACKAGE_SPRING_CONFIG_CLASS)
			.should().bePublic();
	
}