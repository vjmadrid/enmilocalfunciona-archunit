package com.acme.example.archunit.lang.archcondition.external;

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
public class CheckFullExternalDefinitionArchConditionWithAnnotationTest {

	@ArchTest
    public static final ArchRule util_classes_no_have_setters = classes()
	    .that().resideInAPackage("..util..")
	    .should(ExternalArchCondition.classes_no_public_setter_condition);
	

}
