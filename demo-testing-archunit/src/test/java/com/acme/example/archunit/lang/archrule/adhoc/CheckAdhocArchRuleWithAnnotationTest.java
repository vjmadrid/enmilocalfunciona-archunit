package com.acme.example.archunit.lang.archrule.adhoc;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import java.io.Serializable;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;

//@RunWith(ArchUnitRunner.class) // Important: Only for JUnit 4 and not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example", 
	importOptions = { 
			ImportOption.DoNotIncludeTests.class, 
			ImportOption.DoNotIncludeJars.class, 
			ImportOption.DoNotIncludeArchives.class 
	}
)
public class CheckAdhocArchRuleWithAnnotationTest {

	public static ArchRule entity_classes_should_be_serializable = classes().that().resideInAPackage("..archunit.entity").should().implement(Serializable.class);
	
	@ArchTest
	public static ArchRule entity_classes_should_be_serializable_1 = entity_classes_should_be_serializable;
	
	@ArchTest
	public static ArchRule entity_classes_should_be_serializable_2 = classes().that().resideInAPackage("..archunit.entity").should().implement(Serializable.class);
	
	@ArchTest
	public static ArchRule entity_classes_should_be_serializable_3 = ArchRuleDefinition.classes().that().resideInAPackage("..archunit.entity").should().implement(Serializable.class);
	
}