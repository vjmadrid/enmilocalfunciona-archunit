package com.acme.greeting.api.archunit;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "com.acme.greeting.api", 
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
		.layer("Repository layer").definedBy("..repository")
		.layer("Controller layer").definedBy("..controller")
		.layer("Service layer").definedBy("..service..")
		.layer("Config layer").definedBy("..config")
		.layer("Factory layer").definedBy("..factory")
		.layer("Dummy layer").definedBy("..dummy")
		.layer("Util layer").definedBy("..util..")
		.layer("Mapper layer").definedBy("..mapper..")
		//Conditions
		.whereLayer("Entity layer").mayOnlyBeAccessedByLayers("Controller layer", "Service layer", "Repository layer", "Factory layer", "Dummy layer", "Util layer", "Mapper layer")
		.whereLayer("Repository layer").mayOnlyBeAccessedByLayers("Service layer")
		.whereLayer("Service layer").mayOnlyBeAccessedByLayers("Controller layer")
		.whereLayer("Mapper layer").mayOnlyBeAccessedByLayers("Service layer")
		.whereLayer("Util layer").mayOnlyBeAccessedByLayers("Controller layer", "Service layer")
		.whereLayer("Controller layer").mayNotBeAccessedByAnyLayer()
		.whereLayer("Config layer").mayNotBeAccessedByAnyLayer();
	
	@ArchTest
	public static final ArchRule layered_architecture_dependencies_are_respected_advance = 
	    layeredArchitecture()
	    //Layers
		.layer("Entity layer").definedBy("..entity")
		.layer("Request layer").definedBy("..request")
		.layer("Response layer").definedBy("..response")
		.layer("Repository layer").definedBy("..repository")
		.layer("Service layer").definedBy("..service..")
		.layer("Controller layer").definedBy("..controller")
		.layer("Config layer").definedBy("..config")
		.layer("Factory layer").definedBy("..factory")
		.layer("Dummy layer").definedBy("..dummy")
		.layer("Util layer").definedBy("..util..")
		.layer("Mapper layer").definedBy("..mapper..")
		//Conditions
		.whereLayer("Entity layer").mayOnlyBeAccessedByLayers("Service layer", "Repository layer", "Factory layer", "Dummy layer", "Util layer", "Mapper layer")
		.whereLayer("Request layer").mayOnlyBeAccessedByLayers("Controller layer", "Service layer", "Mapper layer", "Util layer", "Dummy layer")
		.whereLayer("Response layer").mayOnlyBeAccessedByLayers("Controller layer", "Service layer", "Mapper layer", "Util layer", "Dummy layer")
		.whereLayer("Repository layer").mayOnlyBeAccessedByLayers("Service layer")
		.whereLayer("Service layer").mayOnlyBeAccessedByLayers("Controller layer", "Service layer")
		.whereLayer("Mapper layer").mayOnlyBeAccessedByLayers("Service layer")
		.whereLayer("Util layer").mayOnlyBeAccessedByLayers("Util layer", "Controller layer", "Service layer")
		.whereLayer("Controller layer").mayNotBeAccessedByAnyLayer()
		.whereLayer("Config layer").mayNotBeAccessedByAnyLayer();

}
