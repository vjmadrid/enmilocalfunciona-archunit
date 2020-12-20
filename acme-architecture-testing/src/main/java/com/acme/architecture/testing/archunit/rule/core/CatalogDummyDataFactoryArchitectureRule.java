package com.acme.architecture.testing.archunit.rule.core;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

import com.acme.architecture.testing.archunit.constant.ArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogDummyDataFactoryArchitectureRule {
	
	@ArchTest
	public static final ArchRule dummy_data_factory_classes_should_be_in_dummy_data_factory_package = 
		    classes()
		    .that().haveSimpleNameStartingWith(ArchUnitConstant.PREFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
		    .should().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_DUMMY_DATA_FACTORY_CLASS);

	@ArchTest
	public static final ArchRule dummy_data_factory_classes_should_have_names_starting_with_the_word_dummy_and_ending_with_the_word_data_factory = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_DUMMY_DATA_FACTORY_CLASS)
		    .should().haveSimpleNameStartingWith(ArchUnitConstant.PREFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
		    .andShould().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_DUMMY_DATA_FACTORY_CLASS);

	@ArchTest
	public static final ArchRule dummy_data_factory_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_DUMMY_DATA_FACTORY_CLASS)
		    .and().haveSimpleNameStartingWith(ArchUnitConstant.PREFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule dummy_data_factory_classes_methods_should_be_static = 
			methods().that().arePublic()
			.and().areDeclaredInClassesThat().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_DUMMY_DATA_FACTORY_CLASS)
			.and().areDeclaredInClassesThat().haveSimpleNameStartingWith(ArchUnitConstant.PREFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
			.and().areDeclaredInClassesThat().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
			.should().beStatic();
	
}
