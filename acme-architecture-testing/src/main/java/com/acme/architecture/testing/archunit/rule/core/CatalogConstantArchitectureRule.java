package com.acme.architecture.testing.archunit.rule.core;

import static com.tngtech.archunit.core.domain.JavaModifier.FINAL;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.fields;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noFields;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noMethods;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogConstantArchitectureRule {
	
	@ArchTest
	public static final ArchRule constant_classes_should_be_in_constant_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_CONSTANT_CLASS)
		    .should().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS);

	@ArchTest
	public static final ArchRule constant_classes_should_have_names_ending_with_the_word_constant = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS)
		    .should().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_CONSTANT_CLASS);
	
	@ArchTest
	public static final ArchRule constant_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_PACKAGE_CONSTANT_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule constant_classes_should_be_final = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_PACKAGE_CONSTANT_CLASS)
		    .should().haveModifier(FINAL);
	
	@ArchTest
	public static final ArchRule constant_classes_fields_should_be_public_static_final = 
			fields().that().arePublic()
			.and().areDeclaredInClassesThat().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS)
			.should().bePublic().andShould().beStatic().andShould().beFinal();
	
	@ArchTest
	public static final ArchRule constant_classes_fields_no_should_be_private = 
			noFields().that().areDeclaredInClassesThat().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS)
			.and().areDeclaredInClassesThat().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_CONSTANT_CLASS)
			.should().bePrivate();
	
	@ArchTest
	public static final ArchRule constant_classes_methods_no_should_be_public = 
			noMethods().that().areDeclaredInClassesThat().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS)
			.and().areDeclaredInClassesThat().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_CONSTANT_CLASS)
			.should().bePublic();
	
	@ArchTest
	public static final ArchRule no_constant_classes_should_be_reside_other_packages = 
			noClasses()
			.that().haveSimpleNameEndingWith(ArchUnitNameConstant.SUFFIX_NAME_CONSTANT_CLASS)
		    .should().resideOutsideOfPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS);

}
