package com.acme.architecture.testing.archunit.rule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.acme.architecture.testing.archunit.constant.ArchUnitConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogAnnotationArchitectureRule {
	
	@ArchTest
	public static final ArchRule annotation_classes_should_be_public_interface = 
		    classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_ANNOTATION_CLASS)
		    .should().bePublic().andShould().beInterfaces();
	
	@ArchTest
	public static final ArchRule annotation_classes_should_be_annotated_with_retention_target = 
			classes()
		    .that().resideInAPackage(ArchUnitConstant.RESIDE_FINAL_PACKAGE_ANNOTATION_CLASS)
		    .should().beAnnotatedWith(Retention.class)
		    .andShould().beAnnotatedWith(Target.class);
	
}
