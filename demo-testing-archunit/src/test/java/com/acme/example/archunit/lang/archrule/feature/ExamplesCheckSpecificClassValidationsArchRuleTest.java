package com.acme.example.archunit.lang.archrule.feature;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

//@RunWith(ArchUnitRunner.class) // Important: Only for JUnit 4 and not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example.archunit", importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class })
public class ExamplesCheckSpecificClassValidationsArchRuleTest {

	@ArchTest
	public static final ArchRule check_control_validation = noClasses()
	        .that().resideOutsideOfPackage("com.acme.example.archunit.user..")
	        .should().accessClassesThat().resideInAnyPackage("com.acme.example.archunit.user.util");

	@ArchTest
	public static final ArchRule check_services_and_repositories_classes_should_not_depends_on_controllers = noClasses()
	        .that()
	        .resideOutsideOfPackage("..service..")
	        .or().resideInAnyPackage("..repository..")
	        .should()
	        .dependOnClassesThat()
            .resideInAnyPackage("..controller..")
            .because("Services and Repositories should not depend on Controllers");

}