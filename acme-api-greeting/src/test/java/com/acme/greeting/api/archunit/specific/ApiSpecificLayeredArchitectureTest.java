package com.acme.greeting.api.archunit.specific;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.acme.architecture.testing.constant.ArchUnitLayeredArchitectureConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.spring.constant.SpringArchUnitPackageConstant;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

@AnalyzeClasses(packages = "com.acme.greeting.api", 
importOptions = { 
		ImportOption.DoNotIncludeTests.class
	}
)
public class ApiSpecificLayeredArchitectureTest {
		
	@ArchTest
	public static final ArchRule api_layered_architecture_should_have_a_custom_definition = 
	    layeredArchitecture()
	    
	    // **************
	    // *** Layers ***
		// **************
	    
	    // Constants
	    .layer("Constant layer").definedBy("..constant")
	    
	    // Entity
		.layer("Entity layer").definedBy("..entity")
		
		// DTO
		.layer("Request DTO layer").definedBy("..request")
		.layer("Response DTO layer").definedBy("..response")
		
		// Repository
		.layer("Repository layer").definedBy("..repository")
		
		// Service
		.layer("Service layer").definedBy("..service..")
		
		// Controller
		.layer("Controller layer").definedBy("..controller")
		
		// Configuration
		.layer("Config layer").definedBy("..config")
		
		// Others
		.layer("Factory layer").definedBy("..factory")
		.layer("Dummy layer").definedBy("..dummy")
		.layer("Util layer").definedBy("..util..")
		.layer("Mapper layer").definedBy("..mapper..")
		
		// ******************
		// *** Conditions ***
		// ******************
		
		// Constants
		// 	"Constant layer" should be accessible to all (no condition is established)
		
		// Entity
		.whereLayer("Entity layer").mayOnlyBeAccessedByLayers("Entity layer", "Service layer", "Repository layer", "Factory layer", "Dummy layer", "Util layer", "Mapper layer")
		
		// DTO (Use direct project or model)
		.whereLayer("Request DTO layer").mayOnlyBeAccessedByLayers("Controller layer", "Service layer", "Mapper layer", "Util layer", "Dummy layer")
		.whereLayer("Response DTO layer").mayOnlyBeAccessedByLayers("Controller layer", "Service layer", "Mapper layer", "Util layer", "Dummy layer")
		
		// Repository
		.whereLayer("Repository layer").mayOnlyBeAccessedByLayers("Service layer")
		
		// Service
		.whereLayer("Service layer").mayOnlyBeAccessedByLayers("Controller layer", "Service layer")
		
		// Controller
		.whereLayer("Controller layer").mayNotBeAccessedByAnyLayer()
		
		// Configuration
		.whereLayer("Config layer").mayNotBeAccessedByAnyLayer()
		
		// Others
		// 	"Dummy layer"
		// 		Option 1 : 	should be accessible to all (no condition is established)
		// 		Option 2 : 	should not be accessed by anyone in this context project (beware of scanning JARs)
		//					.whereLayer("Dummy layer").mayNotBeAccessedByAnyLayer()
		
		.whereLayer("Factory layer").mayOnlyBeAccessedByLayers("Service layer", "Dummy layer")
		.whereLayer("Util layer").mayOnlyBeAccessedByLayers("Util layer", "Controller layer", "Service layer")
		.whereLayer("Mapper layer").mayOnlyBeAccessedByLayers("Service layer");

	@ArchTest
	public static final ArchRule api_layered_architecture_should_have_a_custom_definition_with_constants = 
	layeredArchitecture()
	
    // **************
    // *** Layers ***
	// **************
	
	// Constants
    .layer(ArchUnitLayeredArchitectureConstant.CONSTANT_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS)
	
	// Entity
	.layer(ArchUnitLayeredArchitectureConstant.ENTITY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ENTITY_CLASS)
    
	// DTO
	.layer(ArchUnitLayeredArchitectureConstant.REQUEST_DTO_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REQUEST_DTO_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.RESPONSE_DTO_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_RESPONSE_DTO_CLASS)
	
    // Repository
	.layer(ArchUnitLayeredArchitectureConstant.REPOSITORY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_REPOSITORY_CLASS)
    
	// Service
	.layer(ArchUnitLayeredArchitectureConstant.SERVICE_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_SERVICE_CLASS)
	
	// Controller
	.layer(ArchUnitLayeredArchitectureConstant.CONTROLLER_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_CONTROLLER_CLASS)

	// Configuration
	.layer(ArchUnitLayeredArchitectureConstant.CONFIGURATION_LAYER).definedBy(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_CONFIG_CLASS)

	// Others
	.layer(ArchUnitLayeredArchitectureConstant.FACTORY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.DUMMY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.UTIL_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_UTIL_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.MAPPER_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_MAPPER_CLASS)
	
	// ******************
	// *** Conditions ***
	// ******************
	
	// Constants
	// 	"Constant layer" should be accessible to all (no condition is established)

	// Entity
	.whereLayer(ArchUnitLayeredArchitectureConstant.ENTITY_LAYER).mayOnlyBeAccessedByLayers(
			ArchUnitLayeredArchitectureConstant.FACTORY_LAYER, ArchUnitLayeredArchitectureConstant.DUMMY_LAYER, 
			ArchUnitLayeredArchitectureConstant.UTIL_LAYER, ArchUnitLayeredArchitectureConstant.MAPPER_LAYER,
			ArchUnitLayeredArchitectureConstant.REPOSITORY_LAYER, ArchUnitLayeredArchitectureConstant.SERVICE_LAYER,
			ArchUnitLayeredArchitectureConstant.ENTITY_LAYER
	)
	
	// DTO (Use direct project or model)
	.whereLayer(ArchUnitLayeredArchitectureConstant.REQUEST_DTO_LAYER).mayOnlyBeAccessedByLayers(
			ArchUnitLayeredArchitectureConstant.CONTROLLER_LAYER, ArchUnitLayeredArchitectureConstant.SERVICE_LAYER, 
			ArchUnitLayeredArchitectureConstant.UTIL_LAYER, ArchUnitLayeredArchitectureConstant.MAPPER_LAYER,
			ArchUnitLayeredArchitectureConstant.DUMMY_LAYER
	)
	.whereLayer(ArchUnitLayeredArchitectureConstant.RESPONSE_DTO_LAYER).mayOnlyBeAccessedByLayers(
			ArchUnitLayeredArchitectureConstant.CONTROLLER_LAYER, ArchUnitLayeredArchitectureConstant.SERVICE_LAYER, 
			ArchUnitLayeredArchitectureConstant.UTIL_LAYER, ArchUnitLayeredArchitectureConstant.MAPPER_LAYER, 
			ArchUnitLayeredArchitectureConstant.DUMMY_LAYER
	)
	
	// Repository
	.whereLayer(ArchUnitLayeredArchitectureConstant.REPOSITORY_LAYER).mayOnlyBeAccessedByLayers(ArchUnitLayeredArchitectureConstant.SERVICE_LAYER)
	
	// Service
	.whereLayer(ArchUnitLayeredArchitectureConstant.SERVICE_LAYER).mayOnlyBeAccessedByLayers(
			ArchUnitLayeredArchitectureConstant.SERVICE_LAYER, ArchUnitLayeredArchitectureConstant.CONTROLLER_LAYER
	)
	
	// Controller
	.whereLayer(ArchUnitLayeredArchitectureConstant.CONTROLLER_LAYER).mayNotBeAccessedByAnyLayer()
	
	// Configuration
	.whereLayer(ArchUnitLayeredArchitectureConstant.CONFIGURATION_LAYER).mayNotBeAccessedByAnyLayer()
	
	// Others
	// 	"Dummy layer"
	// 		Option 1 : 	should be accessible to all (no condition is established)
	// 		Option 2 : 	should not be accessed by anyone in this context project (beware of scanning JARs)
	//					.whereLayer("Dummy layer").mayNotBeAccessedByAnyLayer()
	
	.whereLayer(ArchUnitLayeredArchitectureConstant.FACTORY_LAYER).mayOnlyBeAccessedByLayers(
			ArchUnitLayeredArchitectureConstant.SERVICE_LAYER, ArchUnitLayeredArchitectureConstant.DUMMY_LAYER
	)
	
	.whereLayer(ArchUnitLayeredArchitectureConstant.UTIL_LAYER).mayOnlyBeAccessedByLayers(
			ArchUnitLayeredArchitectureConstant.UTIL_LAYER, ArchUnitLayeredArchitectureConstant.CONTROLLER_LAYER,
			ArchUnitLayeredArchitectureConstant.SERVICE_LAYER
	)
	
	.whereLayer(ArchUnitLayeredArchitectureConstant.MAPPER_LAYER).mayOnlyBeAccessedByLayers(ArchUnitLayeredArchitectureConstant.SERVICE_LAYER);

}
