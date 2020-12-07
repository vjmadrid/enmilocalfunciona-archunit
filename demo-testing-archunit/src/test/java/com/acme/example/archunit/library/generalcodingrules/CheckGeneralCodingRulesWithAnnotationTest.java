package com.acme.example.archunit.library.generalcodingrules;

import static com.tngtech.archunit.library.GeneralCodingRules.NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import com.tngtech.archunit.library.GeneralCodingRules;

//@RunWith(ArchUnitRunner.class) // Important: Only for JUnit 4 and not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example", 
	importOptions = { 
			ImportOption.DoNotIncludeTests.class, 
			ImportOption.DoNotIncludeJars.class, 
			ImportOption.DoNotIncludeArchives.class 
	}
)
public class CheckGeneralCodingRulesWithAnnotationTest {
	
	@ArchTest
	public static ArchRule no_classes_should_throw_generic_exceptions = ArchRuleDefinition.noClasses().should(GeneralCodingRules.THROW_GENERIC_EXCEPTIONS);
	
	@ArchTest
	static ArchRule other_no_classes_should_throw_generic_exceptions = NO_CLASSES_SHOULD_THROW_GENERIC_EXCEPTIONS;
	
	@ArchTest
	public static ArchRule no_classes_should_use_standard_logging = ArchRuleDefinition.noClasses().should(GeneralCodingRules.USE_JAVA_UTIL_LOGGING);
}