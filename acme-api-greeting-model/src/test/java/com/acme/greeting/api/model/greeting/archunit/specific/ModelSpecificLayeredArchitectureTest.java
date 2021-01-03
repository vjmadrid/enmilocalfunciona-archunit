package com.acme.greeting.api.model.greeting.archunit.specific;

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
public class ModelSpecificLayeredArchitectureTest {
	
	@ArchTest
	public static final ArchRule model_layered_architecture_should_have_a_custom_definition = 
	    layeredArchitecture()
	    
	    // **************
	    // *** Layers ***
		// **************
	    
	    // Constants
	    .layer("Constant layer").definedBy("..constant")
	    
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
		
		// Constants
		// 	"Constant layer" should be accessible to all (no condition is established)
		
		// DTOs
		.whereLayer("Request DTO layer").mayOnlyBeAccessedByLayers("Dummy layer", "Util layer")
		.whereLayer("Response DTO layer").mayOnlyBeAccessedByLayers("Dummy layer", "Util layer")
		.whereLayer("Query Request DTO layer").mayOnlyBeAccessedByLayers("Query Request DTO layer", "Dummy layer")
		
		// Others
		// 	"Dummy layer"
		// 		Option 1 : 	should be accessible to all (no condition is established)
		// 		Option 2 : 	should not be accessed by anyone in this context project (beware of scanning JARs)
		//					.whereLayer("Dummy layer").mayNotBeAccessedByAnyLayer()
		.whereLayer("Util layer").mayOnlyBeAccessedByLayers("Util layer");
	
	
	

}
