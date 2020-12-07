package com.acme.example.archunit.library.architecture.layered;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

//@RunWith(ArchUnitRunner.class) // Important: Only for JUnit 4 and not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example", importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class })
public class CheckLayeredArchitectureWithAnnotationTest {
	
	@ArchTest
	static ArchRule layeredArchitecture = 
	    layeredArchitecture()
	    .layer("Entity").definedBy("..entity..")
	    //.layer("Domain").definedBy("..domain..")
	    .layer("Repository").definedBy("..repository..")
	    .layer("Service").definedBy("..service..")
	    //.layer("DTO").definedBy("..dto..")
	    .layer("Factory").definedBy("..factory..")
	    .layer("Util").definedBy("..util..")
	    .layer("Controller").definedBy("..controller..")
	    
	    .whereLayer("Entity").mayOnlyBeAccessedByLayers("Repository", "Service", "Factory","Controller")
	    //.whereLayer("DTO").mayOnlyBeAccessedByLayers("Controller")
	    
	    //.whereLayer("Domain").mayOnlyBeAccessedByLayers("Controller", "Service")
	    .whereLayer("Repository").mayOnlyBeAccessedByLayers("Service")
	    .whereLayer("Service").mayOnlyBeAccessedByLayers("Controller");
	    
	
}