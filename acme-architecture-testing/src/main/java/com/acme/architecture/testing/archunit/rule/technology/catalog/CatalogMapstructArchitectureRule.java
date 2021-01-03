package com.acme.architecture.testing.archunit.rule.technology.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import org.mapstruct.Mapper;

import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.constant.TechnologyArchUnitNameConstant;
import com.acme.architecture.testing.constant.TechnologyArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogMapstructArchitectureRule {
	
	@ArchTest
	public static final ArchRule map_struct_classes_should_be_in_mapper_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(TechnologyArchUnitNameConstant.SUFFIX_NAME_MAPPER_STRUCT_CLASS)
		    .should().resideInAPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_STRUCT_CLASS);
	
	@ArchTest
	public static final ArchRule map_struct_classes_should_have_names_ending_with_the_word_mapper = 
		    classes()
		    .that().resideInAnyPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_STRUCT_CLASS)
		    .should().haveSimpleNameEndingWith(TechnologyArchUnitNameConstant.SUFFIX_NAME_MAPPER_STRUCT_CLASS);

	@ArchTest
	public static final ArchRule map_struct_classes_should_be_public = 
		    classes()
		    .that().resideInAPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_STRUCT_CLASS)
		    .should().bePublic();
	
	@ArchTest
	public static final ArchRule map_struct_classes_should_be_interface = 
			classes()
			.that().resideInAPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_STRUCT_CLASS)
			.should().beInterfaces();
	
	@ArchTest
	public static final ArchRule no_map_struct_classes_should_be_reside_other_packages = 
			noClasses()
			.that().resideInAPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_STRUCT_CLASS)
		    .should().resideOutsideOfPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_STRUCT_CLASS);
	
	@ArchTest
	public static final ArchRule map_struct_classes_should_be_annotated_with_mapper = 
		    classes()
		    .that().resideInAPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_STRUCT_CLASS)
		    .should().beAnnotatedWith(Mapper.class);
		
	@ArchTest
	public static final ArchRule map_struct_classes_should_only_be_accessed_by_mapper_impl = 
			classes()
			.that().resideInAPackage(TechnologyArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_STRUCT_CLASS)
			.should()
			.onlyBeAccessed().byAnyPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_IMPL_CLASS);
			

	
}


