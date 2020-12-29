package com.acme.greeting.api.model.greeting.archunit;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "com.acme.greeting.api.model.greeting", 
importOptions = { 
		ImportOption.DoNotIncludeTests.class,
		ImportOption.DoNotIncludeJars.class, 
		ImportOption.DoNotIncludeArchives.class 
	}
)
public class ModelLayeredArchitectureTest {
	
	@ArchTest
	public static final ArchRule model_layered_architecture_should_have_a_definition = 
	    layeredArchitecture()
	    
	    // **************
	    // *** Layers ***
		// **************
	    
	    // DTOs
		.layer("Request DTO layer").definedBy("..request")
		.layer("Response DTO layer").definedBy("..response")
		.layer("Query Request DTO layer").definedBy("..query")
		
		// Others
		.layer("Dummy layer").definedBy("..dummy")
		.layer("Util layer").definedBy("..util..")
		
	
		// ******************
		// *** Conditions ***
		// ******************
		
		// DTOs
		.whereLayer("Request DTO layer").mayOnlyBeAccessedByLayers("Dummy layer", "Util layer")
		.whereLayer("Response DTO layer").mayOnlyBeAccessedByLayers("Dummy layer", "Util layer")
		.whereLayer("Query Request DTO layer").mayOnlyBeAccessedByLayers("Query Request DTO layer", "Dummy layer")
		
		// Others
		// * "Dummy layer" can be accessed by all 
		.whereLayer("Util layer").mayOnlyBeAccessedByLayers("Util layer");

}
