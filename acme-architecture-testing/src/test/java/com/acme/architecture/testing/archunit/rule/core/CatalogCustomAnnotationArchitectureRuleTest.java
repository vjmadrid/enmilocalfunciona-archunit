package com.acme.architecture.testing.archunit.rule.core;

import com.acme.architecture.testing.archunit.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.core.CatalogCustomAnnotationArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = ArchUnitPackageConstant.PACKAGE_EXAMPLE, 
	importOptions = { 
			ImportOption.DoNotIncludeArchives.class, 
			ImportOption.DoNotIncludeJars.class 
	}
)
// Includes test classes
public class CatalogCustomAnnotationArchitectureRuleTest {

	@ArchTest
	public static final ArchRule custom_annotation_classes_should_be_public_interface = CatalogCustomAnnotationArchitectureRule.custom_annotation_classes_should_be_public_interface;

	@ArchTest
	public static final ArchRule custom_annotation_classes_should_be_annotated_with_retention_target = CatalogCustomAnnotationArchitectureRule.custom_annotation_classes_should_be_annotated_with_retention_target;
	
	
}


