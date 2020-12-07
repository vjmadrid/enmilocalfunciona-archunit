package com.acme.example.archunit.lang.archrule.external.custom;

import com.acme.example.archunit.lang.archrule.external.rule.definition.EntityArchitectureRule;
import com.acme.example.archunit.lang.archrule.external.rule.definition.base.BaseEntityArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

//@RunWith(ArchUnitRunner.class) //Only for JUnit 4 , not needed JUnit5∂
@AnalyzeClasses(packages = "com.acme.example", 
	importOptions = { 
			ImportOption.DoNotIncludeTests.class, 
			ImportOption.DoNotIncludeJars.class, 
			ImportOption.DoNotIncludeArchives.class 
	}
)
public class CheckSelectedExternalCustomArchRuleWithAnnotationTest {
	
	@ArchTest
	public static ArchRule entity_classes_should_be_in_entity_package = BaseEntityArchitectureRule.entity_classes_should_be_in_entity_package;
	
	@ArchTest
	public static ArchRule entity_classes_should_be_annotated_with_entity = EntityArchitectureRule.entity_classes_should_be_annotated_with_entity;
	
	// ....
}