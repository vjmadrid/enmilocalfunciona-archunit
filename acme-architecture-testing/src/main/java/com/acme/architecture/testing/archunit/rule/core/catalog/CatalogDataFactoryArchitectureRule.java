package com.acme.architecture.testing.archunit.rule.core.catalog;

import static com.tngtech.archunit.core.domain.JavaModifier.FINAL;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.constructors;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogDataFactoryArchitectureRule {
	
	@ArchTest
	public static final ArchRule data_factory_classes_should_be_in_data_factory_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_DATA_FACTORY_CLASS)
		    .and().haveSimpleNameNotStartingWith(ArchUnitNameConstant.PREFIX_NAME_DUMMY_DATA_FACTORY_CLASS)
		    .should().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS);

	@ArchTest
	public static final ArchRule data_factory_classes_should_have_names_ending_with_the_word_data_factory = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_DATA_FACTORY_CLASS)
		    .andShould().haveSimpleNameNotStartingWith(ArchUnitNameConstant.PREFIX_NAME_DUMMY_DATA_FACTORY_CLASS);

	@ArchTest
	public static final ArchRule data_factory_classes_should_be_public = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule data_factory_classes_should_be_final = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS)
		    .should().haveModifier(FINAL);
	
	@ArchTest
	public static final ArchRule data_factory_classes_constructors_should_have_one_private_constructor = 
			constructors()
			.that().areDeclaredInClassesThat().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS)
			.should().bePrivate();
	
	@ArchTest
	public static final ArchRule data_factory_classes_methods_should_be_public_static = 
			methods()
			.that().areDeclaredInClassesThat().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS)
			.and().arePublic()
			.should().beStatic();
	
}
