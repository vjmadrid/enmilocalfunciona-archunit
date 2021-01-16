package com.acme.architecture.testing.archunit.rule.core.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.acme.architecture.testing.archunit.condition.ImplementInterfaceWithSameNameArchitectureCondition;
import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogRepositoryImplArchitectureRule {
	
	@ArchTest
	public static final ArchRule repository_impl_classes_should_be_in_repository_impl_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_REPOSITORY_IMPL_CLASS)
		    .should().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_IMPL_CLASS);
	
	@ArchTest
	public static final ArchRule repository_impl_classes_should_have_names_ending_with_the_word_repository_impl = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_IMPL_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_REPOSITORY_IMPL_CLASS);
	
	@ArchTest
	public static final ArchRule repository_impl_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_IMPL_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule repository_impl_should_implement_respository = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_IMPL_CLASS)
		    .should(new ImplementInterfaceWithSameNameArchitectureCondition());
	
	@ArchTest
	public static final ArchRule repository_impl_classes_should_no_be_interface = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_IMPL_CLASS)
		    .should().notBeInterfaces();

}


