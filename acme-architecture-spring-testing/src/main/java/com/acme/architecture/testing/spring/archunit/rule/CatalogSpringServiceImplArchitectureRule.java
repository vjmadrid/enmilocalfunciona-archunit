package com.acme.architecture.testing.spring.archunit.rule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.springframework.stereotype.Service;

import com.acme.architecture.testing.spring.constant.SpringArchUnitNameConstant;
import com.acme.architecture.testing.spring.constant.SpringArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSpringServiceImplArchitectureRule {
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_be_in_spring_service_impl_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(SpringArchUnitNameConstant.SUFFIX_NAME_SPRING_IMPL_SERVICE_CLASS)
		    .should().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS);

	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_have_names_ending_with_the_word_service_impl = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS)
		    .should().haveSimpleNameEndingWith(SpringArchUnitNameConstant.SUFFIX_NAME_SPRING_IMPL_SERVICE_CLASS);
	
	
	@ArchTest
	public static final ArchRule spring_service_impl_classes_should_be_annotated_with_service = 
		    classes()
		    .that().resideInAPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS)
		    .and().haveSimpleNameEndingWith(SpringArchUnitNameConstant.SUFFIX_NAME_SPRING_IMPL_SERVICE_CLASS)
		    .should().beAnnotatedWith(Service.class);
	
	@ArchTest
	public static final ArchRule no_spring_service_impl_classes_should_be_reside_other_packages = 
			noClasses()
			.that().areAnnotatedWith(Service.class)
		    .should().resideOutsideOfPackage(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS);



}
