package com.acme.greeting.api.restful.archunit;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.dependencies.SlicesRuleDefinition;

@AnalyzeClasses(packages = "com.acme.greeting.api.restful", 
importOptions = { 
		ImportOption.DoNotIncludeTests.class,
		ImportOption.DoNotIncludeJars.class, 
		ImportOption.DoNotIncludeArchives.class 
	}
)
public class SlicesArchitectureTest {
	
	@ArchTest
	public static final ArchRule slices_free_cycles = 
				SlicesRuleDefinition.slices().matching("com.acme.greeting.api.restful.(*)..").should().beFreeOfCycles();
	
	@ArchTest
	public static final ArchRule slices_no_depend_on_each_other = 
				SlicesRuleDefinition.slices().matching("com.acme.greeting.api.restful.controller.(**)..").should().notDependOnEachOther();


}
