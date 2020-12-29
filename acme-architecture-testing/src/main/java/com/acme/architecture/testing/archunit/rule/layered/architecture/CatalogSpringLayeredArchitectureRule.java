package com.acme.architecture.testing.archunit.rule.layered.architecture;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.acme.architecture.testing.archunit.constant.ArchUnitLayeredArchitectureConstant;
import com.acme.architecture.testing.archunit.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.constant.SpringArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogSpringLayeredArchitectureRule {
	
	@ArchTest
	public static final ArchRule api_layered_architecture_should_have_a_definition = 
	layeredArchitecture()
	
	// **************
    // *** Layers ***
	// **************
	
	// Entity
	.layer(ArchUnitLayeredArchitectureConstant.ENTITY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_ENTITY_CLASS)
	
	// DTOs
	.layer(ArchUnitLayeredArchitectureConstant.REQUEST_DTO_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REQUEST_DTO_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.RESPONSE_DTO_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_RESPONSE_DTO_CLASS)
	
	// Basic : Repository, Service and Controller
	.layer(ArchUnitLayeredArchitectureConstant.REPOSITORY_LAYER).definedBy(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.SERVICE_LAYER).definedBy(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.CONTROLLER_LAYER).definedBy(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS)
	
	// Configuration
	.layer(ArchUnitLayeredArchitectureConstant.CONFIGURATION_LAYER).definedBy(SpringArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SPRING_CONFIG_CLASS)
	
	// Others
	.layer(ArchUnitLayeredArchitectureConstant.UTIL_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_UTIL_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.MAPPER_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_MAPPER_CLASS)
	
	.layer(ArchUnitLayeredArchitectureConstant.FACTORY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DATA_FACTORY_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.DUMMY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_CLASS)
	
	
	
	// ******************
	// *** Conditions ***
	// ******************
	
	// Entity
	.whereLayer(ArchUnitLayeredArchitectureConstant.ENTITY_LAYER).mayOnlyBeAccessedByLayers(
			"Service layer", "Repository layer", "Factory layer", 
			"Dummy layer", "Util layer", "Mapper layer")
	
	// DTOs
	.whereLayer(ArchUnitLayeredArchitectureConstant.REQUEST_DTO_LAYER).mayOnlyBeAccessedByLayers("Controller layer", "Service layer", "Mapper layer", "Util layer", "Dummy layer")
	.whereLayer(ArchUnitLayeredArchitectureConstant.RESPONSE_DTO_LAYER).mayOnlyBeAccessedByLayers("Controller layer", "Service layer", "Mapper layer", "Util layer", "Dummy layer")
	
	// Basic : Repository, Service and Controller
	.whereLayer(ArchUnitLayeredArchitectureConstant.REPOSITORY_LAYER).mayOnlyBeAccessedByLayers("Service layer")
	.whereLayer(ArchUnitLayeredArchitectureConstant.SERVICE_LAYER).mayOnlyBeAccessedByLayers("Controller layer", "Service layer")
	.whereLayer(ArchUnitLayeredArchitectureConstant.CONTROLLER_LAYER).mayNotBeAccessedByAnyLayer()
	
	// Configuration
	.whereLayer(ArchUnitLayeredArchitectureConstant.CONFIGURATION_LAYER).mayNotBeAccessedByAnyLayer()
	
	// Others
	.whereLayer(ArchUnitLayeredArchitectureConstant.UTIL_LAYER).mayOnlyBeAccessedByLayers("Util layer", "Controller layer", "Service layer")
	.whereLayer(ArchUnitLayeredArchitectureConstant.MAPPER_LAYER).mayOnlyBeAccessedByLayers("Service layer");

}
