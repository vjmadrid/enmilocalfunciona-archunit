package com.acme.example.archunit.lang.archrule.feature;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

//@RunWith(ArchUnitRunner.class) // Important: Only for JUnit 4 and not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example.archunit", importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class })
public class ExcamplesCheckSpecificClassValidationsArchRuleTest {

	@ArchTest
	public static final ArchRule check_control_validation = noClasses()
	        .that().resideOutsideOfPackage("com.acme.example.archunit.user..")
	        .should().accessClassesThat().resideInAnyPackage("com.acme.example.archunit.user.util");

}