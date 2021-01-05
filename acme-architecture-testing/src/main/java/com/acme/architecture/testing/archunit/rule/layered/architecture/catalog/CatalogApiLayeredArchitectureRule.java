package com.acme.architecture.testing.archunit.rule.layered.architecture.catalog;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.acme.architecture.testing.constant.ArchUnitLayeredArchitectureConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogApiLayeredArchitectureRule {
	
	@ArchTest
	public static final ArchRule api_layered_architecture_should_have_a_default_definition = 
	layeredArchitecture()
	

    // **************
    // *** Layers ***
	// **************
	
	// Constants
    .layer(ArchUnitLayeredArchitectureConstant.CONSTANT_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS)
	
	// Entity
	.layer(ArchUnitLayeredArchitectureConstant.ENTITY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ENTITY_CLASS)
    
	// DTO
	//.layer("Request layer").definedBy("..request")
	//.layer("Response layer").definedBy("..response")
	
    // Repository
	.layer(ArchUnitLayeredArchitectureConstant.REPOSITORY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_CLASS)
    
	// Service
	.layer(ArchUnitLayeredArchitectureConstant.SERVICE_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_CLASS)
	
	// Controller
	.layer(ArchUnitLayeredArchitectureConstant.CONTROLLER_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONTROLLER_CLASS)

	// Others
	.layer(ArchUnitLayeredArchitectureConstant.FACTORY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.DUMMY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.UTIL_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_UTIL_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.MAPPER_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_MAPPER_CLASS)
	
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
			ArchUnitLayeredArchitectureConstant.CONTROLLER_LAYER)
	
	//.whereLayer("Request layer").mayOnlyBeAccessedByLayers("Controller layer", "Service layer", "Mapper layer", "Util layer", "Dummy layer")
	//.whereLayer("Response layer").mayOnlyBeAccessedByLayers("Controller layer", "Service layer", "Mapper layer", "Util layer", "Dummy layer")
	
	//.whereLayer("Repository layer").mayOnlyBeAccessedByLayers("Service layer")
	//.whereLayer("Service layer").mayOnlyBeAccessedByLayers("Controller layer", "Service layer")
	//.whereLayer("Mapper layer").mayOnlyBeAccessedByLayers("Service layer")
	//.whereLayer("Util layer").mayOnlyBeAccessedByLayers("Util layer", "Controller layer", "Service layer")
	//.whereLayer("Controller layer").mayNotBeAccessedByAnyLayer()
	//.whereLayer("Config layer").mayNotBeAccessedByAnyLayer()
	
	
	
	// Others
	// 	"Dummy layer"
	// 		Option 1 : 	should be accessible to all (no condition is established)
	// 		Option 2 : 	should not be accessed by anyone in this context project (beware of scanning JARs)
	//					.whereLayer("Dummy layer").mayNotBeAccessedByAnyLayer()
	.whereLayer(ArchUnitLayeredArchitectureConstant.UTIL_LAYER).mayOnlyBeAccessedByLayers(
			ArchUnitLayeredArchitectureConstant.UTIL_LAYER
	);

}
