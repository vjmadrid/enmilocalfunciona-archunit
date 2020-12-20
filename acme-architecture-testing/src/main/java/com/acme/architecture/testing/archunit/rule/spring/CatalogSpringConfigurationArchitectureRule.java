package com.acme.architecture.testing.archunit.rule.spring;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.springframework.context.annotation.Configuration;

import com.acme.architecture.testing.archunit.constant.SpringArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSpringConfigurationArchitectureRule {

	@ArchTest
	public static final ArchRule spring_configuration_classes_should_be_in_spring_config_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_CONFIG_CLASS)
		    .should().resideInAPackage(SpringArchUnitConstant.RESIDE_PACKAGE_SPRING_CONFIG_CLASS);
	
	@ArchTest
	public static final ArchRule spring_configuration_classes_should_have_names_ending_with_the_word_config = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitConstant.RESIDE_PACKAGE_SPRING_CONFIG_CLASS)
		    .should().haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_CONFIG_CLASS);
	
	@ArchTest
	public static final ArchRule spring_configuration_classes_should_be_annotated_with_configuration = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitConstant.RESIDE_PACKAGE_SPRING_CONFIG_CLASS)
		    .and().haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_CONFIG_CLASS)
		    .should().beAnnotatedWith(Configuration.class);
	
	@ArchTest
	public static final ArchRule spring_configuration_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitConstant.RESIDE_PACKAGE_SPRING_CONFIG_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule no_spring_configuration_classes_should_be_reside_other_packages = 
			noClasses()
			.that().areAnnotatedWith(Configuration.class)
		    .should().resideOutsideOfPackage(SpringArchUnitConstant.RESIDE_PACKAGE_SPRING_CONFIG_CLASS);
	  
}