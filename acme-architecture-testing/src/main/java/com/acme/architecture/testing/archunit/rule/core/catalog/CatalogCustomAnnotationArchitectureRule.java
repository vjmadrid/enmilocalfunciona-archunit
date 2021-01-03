package com.acme.architecture.testing.archunit.rule.core.catalog;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogCustomAnnotationArchitectureRule {
	
	@ArchTest
	public static final ArchRule custom_annotation_classes_should_be_public_interface = 
		    classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ANNOTATION_CLASS)
		    .should().bePublic().andShould().beInterfaces();
	
	@ArchTest
	public static final ArchRule custom_annotation_classes_should_be_annotated_with_retention_target = 
			classes()
		    .that().resideInAPackage(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ANNOTATION_CLASS)
		    .should().beAnnotatedWith(Retention.class)
		    .andShould().beAnnotatedWith(Target.class);
	
	/*
	 * IMPORTANT
	 * 
	 * A specific rule should be created where a specific notation is to be used. It can be at the architectural 
	 * level when it is clear what you want to do and if it affects more projects or the project you apply.
	 * 
	 * Bear in mind that you have to add characteristics that the annotation created should comply with (name, 
	 * attributes, classes in which it is used, packages that can contain it, restrictions)
	 * 
	 */
	
}
