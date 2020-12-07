package com.acme.example.archunit.lang.archrule.feature;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

//@RunWith(ArchUnitRunner.class) // Important: Only for JUnit 4 and not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example.archunit", importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class })
public class ExamplesCheckNamingConventionsArchRuleTest {

	private static final String FACTORY_SUFFIX = "Factory";
	
	@ArchTest
	public static final ArchRule factory_classes_should_be_in_factory_package = 
		    classes()
		    .that().haveSimpleNameEndingWith(FACTORY_SUFFIX)
		    .should().resideInAnyPackage("..factory");

	@ArchTest
	public static final ArchRule factory_classes_should_have_names_ending_with_the_word_factory = 
		    classes()
		    .that().resideInAnyPackage("..factory")
		    .should().haveSimpleNameEndingWith(FACTORY_SUFFIX);

	
	@ArchTest
	public static ArchRule factory_classes_should_have_names_contains_the_word_UserData = classes().that().haveSimpleNameContaining("UserData")
			.should().resideInAPackage("..factory");
	
	@ArchTest
	public static ArchRule factory_should_be_example_package = classes().that().haveSimpleNameContaining("Factory")
			.should().resideInAPackage("..example.archunit..");

}