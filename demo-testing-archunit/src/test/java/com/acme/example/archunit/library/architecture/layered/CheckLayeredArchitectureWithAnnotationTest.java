package com.acme.example.archunit.library.architecture.layered;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

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
public class CheckLayeredArchitectureWithAnnotationTest {
	
	@ArchTest
	public static final ArchRule layered_architecture_dependencies_are_respected = 
	    layeredArchitecture()
	    //Layers
		.layer("Entity layer").definedBy("..entity..")
		.layer("Repository layer").definedBy("..repository..")
		.layer("Service layer").definedBy("..service..")
		.layer("Controller layer").definedBy("..controller..")
		.layer("Factory layer").definedBy("..factory..")
		.layer("Util layer").definedBy("..util..")
		//.layer("Config layer").definedBy("..config..")
		//Conditions
		.whereLayer("Entity layer").mayOnlyBeAccessedByLayers("Repository layer", "Service layer", "Factory layer", "Controller layer")
		.whereLayer("Repository layer").mayOnlyBeAccessedByLayers("Service layer")
		.whereLayer("Service layer").mayOnlyBeAccessedByLayers("Controller layer")
		.whereLayer("Controller layer").mayNotBeAccessedByAnyLayer();
		//.whereLayer("Config layer").mayNotBeAccessedByAnyLayer();

}