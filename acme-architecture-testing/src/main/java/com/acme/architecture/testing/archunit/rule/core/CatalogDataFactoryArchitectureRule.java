package com.acme.architecture.testing.archunit.rule.core;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.methods;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.acme.architecture.testing.archunit.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.archunit.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogDataFactoryArchitectureRule {
	
	@ArchTest
	public static final ArchRule data_factory_classes_should_be_in_data_factory_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_DATA_FACTORY_CLASS)
		    .should().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_DATA_FACTORY_CLASS);

	@ArchTest
	public static final ArchRule data_factory_classes_should_have_names_ending_with_the_word_data_factory = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_DATA_FACTORY_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_DATA_FACTORY_CLASS);

	@ArchTest
	public static final ArchRule data_factory_classes_should_be_public = 
		    classes()
		    .that().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_DATA_FACTORY_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_DATA_FACTORY_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule data_factory_classes_methods_should_be_static = methods().that().arePublic()
			.and().areDeclaredInClassesThat().resideInAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS, ArchUnitPackageConstant.RESIDE_PACKAGE_DATA_FACTORY_CLASS)
			.and().areDeclaredInClassesThat().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_DATA_FACTORY_CLASS)
			.should().beStatic();
	
	@ArchTest
	public static final ArchRule no_data_factory_classes_should_be_reside_other_packages = 
			noClasses()
			.that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_DATA_FACTORY_CLASS)
		    .should().resideOutsideOfPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS)
		    .andShould().resideOutsideOfPackage(ArchUnitPackageConstant.RESIDE_PACKAGE_DATA_FACTORY_CLASS);
}
