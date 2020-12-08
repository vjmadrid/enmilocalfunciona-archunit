package com.acme.example.archunit.lang.archrule.area;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

//@RunWith(ArchUnitRunner.class) // Important: Only for JUnit 4 and not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example", 
importOptions = { 
		ImportOption.DoNotIncludeTests.class, 
		ImportOption.DoNotIncludeJars.class, 
		ImportOption.DoNotIncludeArchives.class 
})
public class CheckClassesArchRuleAreaTest {

	@ArchTest
	private final ArchRule util_classes_should_be_in_util_package = classes().that().haveSimpleNameEndingWith("Util")
			.should().resideInAPackage("..util");
	
}