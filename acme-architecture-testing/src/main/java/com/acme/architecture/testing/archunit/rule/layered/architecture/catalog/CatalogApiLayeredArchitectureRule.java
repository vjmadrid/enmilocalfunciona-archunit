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
	.layer(ArchUnitLayeredArchitectureConstant.REQUEST_DTO_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REQUEST_DTO_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.RESPONSE_DTO_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_RESPONSE_DTO_CLASS)
	
    // Repository
	.layer(ArchUnitLayeredArchitectureConstant.REPOSITORY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_REPOSITORY_CLASS)
    
	// Service
	.layer(ArchUnitLayeredArchitectureConstant.SERVICE_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_SERVICE_CLASS)
	
	// Controller
	.layer(ArchUnitLayeredArchitectureConstant.CONTROLLER_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_CONTROLLER_CLASS)

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
			ArchUnitLayeredArchitectureConstant.ENTITY_LAYER)
	
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
