package com.acme.architecture.testing.archunit.rule.core.catalog;

import static com.tngtech.archunit.core.domain.JavaModifier.FINAL;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.constructors;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogDummyDataFactoryArchitectureRule {
	
	@ArchTest
	public static final ArchRule dummy_data_factory_classes_should_be_in_dummy_data_factory_package = 
		    classes()
		    .that().haveSimpleNameStartingWith(ArchUnitNameConstant.PREFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
		    .should().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_DATA_FACTORY_CLASS);

	@ArchTest
	public static final ArchRule dummy_data_factory_classes_should_have_names_starting_with_the_word_dummy_and_ending_with_the_word_data_factory = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_DATA_FACTORY_CLASS)
		    .should().haveSimpleNameStartingWith(ArchUnitNameConstant.PREFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
		    .andShould().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_DUMMY_DATA_FACTORY_CLASS);

	@ArchTest
	public static final ArchRule dummy_data_factory_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_DATA_FACTORY_CLASS)
		    .and().haveSimpleNameStartingWith(ArchUnitNameConstant.PREFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule dummy_data_factory_classes_should_be_final = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_DATA_FACTORY_CLASS)
		    .should().haveModifier(FINAL);
	
	@ArchTest
	public static final ArchRule dummy_data_factory_classes_constructors_should_have_one_private_constructor = 
			constructors()
			.that().areDeclaredInClassesThat().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_DATA_FACTORY_CLASS)
			.should().bePrivate();
	
	@ArchTest
	public static final ArchRule dummy_data_factory_classes_methods_should_be_static = 
			methods()
			.that().areDeclaredInClassesThat().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_DATA_FACTORY_CLASS)
			.and().areDeclaredInClassesThat().haveSimpleNameStartingWith(ArchUnitNameConstant.PREFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
			.and().areDeclaredInClassesThat().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
			.and().arePublic()
			.should().beStatic();
	
}
