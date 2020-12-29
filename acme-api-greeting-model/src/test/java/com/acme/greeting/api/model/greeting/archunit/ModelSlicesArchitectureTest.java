package com.acme.greeting.api.model.greeting.archunit;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.dependencies.SlicesRuleDefinition;

@AnalyzeClasses(packages = "com.acme.greeting.api.model.greeting", 
importOptions = { 
		ImportOption.DoNotIncludeTests.class,
		ImportOption.DoNotIncludeJars.class, 
		ImportOption.DoNotIncludeArchives.class 
	}
)
public class ModelSlicesArchitectureTest {
	
	@ArchTest
	public static final ArchRule slices_free_cycles = 
				SlicesRuleDefinition.slices().matching("com.acme.greeting.api.model.greeting.(*)..").should().beFreeOfCycles();
	
	@ArchTest
	public static final ArchRule slices_no_depend_on_each_other = 
				SlicesRuleDefinition.slices().matching("com.acme.greeting.api.model.greeting.request.(**)..").should().notDependOnEachOther();


}
