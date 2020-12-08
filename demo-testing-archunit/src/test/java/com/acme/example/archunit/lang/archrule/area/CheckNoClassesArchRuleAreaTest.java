package com.acme.example.archunit.lang.archrule.area;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

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
public class CheckNoClassesArchRuleAreaTest {

	@ArchTest
	static ArchRule classes_must_not_be_suffixed_with_Implements = 
    noClasses()
    .should().haveSimpleNameEndingWith("Implements")
    .because("seriously, you can do better than that");

}