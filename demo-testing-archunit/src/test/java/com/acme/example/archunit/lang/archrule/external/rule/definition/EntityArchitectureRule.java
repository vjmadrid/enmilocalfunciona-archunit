package com.acme.example.archunit.lang.archrule.external.rule.definition;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import java.io.Serializable;

import com.acme.example.archunit.constant.ArchUnitConstant;
import com.acme.example.archunit.entity.AbstractEntity;
import com.acme.example.archunit.lang.archrule.external.rule.definition.base.BaseEntityArchitectureRule;
import com.tngtech.archunit.lang.ArchRule;

public class EntityArchitectureRule extends BaseEntityArchitectureRule {
	
	public static final ArchRule entity_classes_should_be_annotated_with_entity = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
		    .and().haveSimpleNameEndingWith(ArchUnitConstant.SUFFIX_NAME_ENTITY_CLASS)
		    .should().beAnnotatedWith("Entity");
	
	public static final ArchRule entity_classes_should_implements_serializable = 
			classes()
			    .that().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
			    .or().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
			    .should().implement(Serializable.class);
	
	public static final ArchRule entity_classes_should_implements_abstract_entity_class = 
			classes()
			    .that().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
			    .or().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
			    .should().beAssignableTo(AbstractEntity.class);
	
	public static final ArchRule entity_classes_should_be_accessed_by_other_entity_class = 
			classes()
			    .that().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
			    .or().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
			    .should().onlyBeAccessed().byAnyPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS);
	
	public static final ArchRule entity_classes_should_be_accessed_by_others_layers = 
			classes()
			    .that().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
			    .or().resideInAPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS)
			    .should().onlyBeAccessed().byAnyPackage(ArchUnitConstant.RESIDE_PACKAGE_ENTITY_CLASS, ArchUnitConstant.RESIDE_PACKAGE_REPOSITORY_CLASS, ArchUnitConstant.RESIDE_PACKAGE_SERVICE_CLASS);
	
	
	
}





