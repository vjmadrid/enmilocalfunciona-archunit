package com.acme.greeting.api.restful.archunit;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "com.acme.greeting.api.restful", 
importOptions = { 
		ImportOption.DoNotIncludeTests.class,
		ImportOption.DoNotIncludeJars.class, 
		ImportOption.DoNotIncludeArchives.class 
	}
)
public class LayeredArchitectureTest {
	
	@ArchTest
	public static final ArchRule layered_architecture_dependencies_are_respected = 
	    layeredArchitecture()
	    //Layers
		.layer("Entity layer").definedBy("..entity")
		.layer("Controller layer").definedBy("..controller")
		.layer("Config layer").definedBy("..config")
		.layer("Factory layer").definedBy("..factory")
		.layer("Dummy layer").definedBy("..dummy")
		//Conditions
		.whereLayer("Entity layer").mayOnlyBeAccessedByLayers("Controller layer", "Factory layer", "Dummy layer")
		.whereLayer("Controller layer").mayOnlyBeAccessedByLayers("Factory layer")
		//.whereLayer("Controller layer").mayNotBeAccessedByAnyLayer()
		.whereLayer("Config layer").mayNotBeAccessedByAnyLayer();

}
