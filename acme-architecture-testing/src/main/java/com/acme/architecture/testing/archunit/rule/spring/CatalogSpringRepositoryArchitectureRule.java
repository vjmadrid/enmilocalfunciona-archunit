package com.acme.architecture.testing.archunit.rule.spring;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.springframework.stereotype.Repository;

import com.acme.architecture.testing.archunit.constant.SpringArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSpringRepositoryArchitectureRule {

	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_in_spring_repository_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_REPOSITORY_CLASS)
		    .should().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS);
	
	@ArchTest
	public static final ArchRule spring_repository_classes_should_have_names_ending_with_the_word_repository = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS)
		    .should().haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_REPOSITORY_CLASS);
	
	@ArchTest
	public static final ArchRule spring_repository_classes_should_be_annotated_with_repository = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS)
		    .and().haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_REPOSITORY_CLASS)
		    .should().beAnnotatedWith(Repository.class);
	
	@ArchTest
	public static final ArchRule no_spring_repository_classes_should_be_reside_other_packages = 
			noClasses()
			.that().areAnnotatedWith(Repository.class)
		    .should().resideOutsideOfPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS);
	  
}