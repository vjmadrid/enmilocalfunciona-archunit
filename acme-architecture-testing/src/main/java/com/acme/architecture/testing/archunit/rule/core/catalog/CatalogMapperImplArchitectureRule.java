package com.acme.architecture.testing.archunit.rule.core.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogMapperImplArchitectureRule {
	
	@ArchTest
	public static final ArchRule mapper_impl_classes_should_be_in_mapper_impl_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_MAPPER_IMPL_CLASS)
		    .should().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_IMPL_CLASS);
	
	@ArchTest
	public static final ArchRule mapper_impl_classes_should_have_names_ending_with_the_word_mapper_impl = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_IMPL_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_MAPPER_IMPL_CLASS);
	
	@ArchTest
	public static final ArchRule mapper_impl_classes_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_IMPL_CLASS)
		    .should().bePublic();
	
}


