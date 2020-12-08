package com.acme.architecture.testing.archunit.rule.spring;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.springframework.stereotype.Service;

import com.acme.architecture.testing.archunit.constant.SpringArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSpringServiceImplArchitectureRule {
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_be_in_spring_service_impl_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_IMPL_SERVICE_CLASS)
		    .should().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS);

	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_have_names_ending_with_the_word_service_impl = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS)
		    .should().haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_IMPL_SERVICE_CLASS);
	
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_be_annotated_with_service = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS)
		    .and().haveSimpleNameEndingWith(SpringArchUnitConstant.SUFFIX_NAME_SPRING_IMPL_SERVICE_CLASS)
		    .should().beAnnotatedWith(Service.class);
	
	@ArchTest
	public static final ArchRule no_spring_service_impl_classes_should_be_reside_other_packages = 
			noClasses()
			.that().areAnnotatedWith(Service.class)
		    .should().resideOutsideOfPackage(SpringArchUnitConstant.RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS);



}
