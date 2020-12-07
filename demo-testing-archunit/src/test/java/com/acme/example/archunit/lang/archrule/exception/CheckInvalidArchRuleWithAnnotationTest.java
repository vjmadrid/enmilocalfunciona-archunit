package com.acme.example.archunit.lang.archrule.exception;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import java.io.Serializable;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

//@RunWith(ArchUnitRunner.class) //Only for JUnit 4 , not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example")
public class CheckInvalidArchRuleWithAnnotationTest {
	
	@ArchTest
	public static ArchRule entity_classes_should_be_serializable = classes().that().resideInAPackage("..user.util").should().implement(Serializable.class);
	
}