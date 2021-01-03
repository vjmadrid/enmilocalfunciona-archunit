package com.acme.architecture.testing.archunit.rule.layered.architecture.catalog;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.acme.architecture.testing.constant.ArchUnitLayeredArchitectureConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

public class CatalogModelLayeredArchitectureRule {
	
	@ArchTest
	public static final ArchRule model_layered_architecture_should_have_a_default_definition = 
	layeredArchitecture()
	

    // **************
    // *** Layers ***
	// **************
    
    // Constants
    .layer(ArchUnitLayeredArchitectureConstant.CONSTANT_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_CONSTANT_CLASS)
    
    // DTOs
	.layer(ArchUnitLayeredArchitectureConstant.REQUEST_DTO_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REQUEST_DTO_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.RESPONSE_DTO_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_RESPONSE_DTO_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.QUERY_REQUEST_DTO_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_QUERY_REQUEST_DTO_CLASS)
	
	// Others
	.layer(ArchUnitLayeredArchitectureConstant.DUMMY_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_DUMMY_CLASS)
	.layer(ArchUnitLayeredArchitectureConstant.UTIL_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_UTIL_CLASS)
	

	// ******************
	// *** Conditions ***
	// ******************
	
	// Constants
	// 	"Constant layer" should be accessible to all (no condition is established)
	
	// DTOs
	.whereLayer(ArchUnitLayeredArchitectureConstant.REQUEST_DTO_LAYER).mayOnlyBeAccessedByLayers(
			ArchUnitLayeredArchitectureConstant.DUMMY_LAYER, ArchUnitLayeredArchitectureConstant.UTIL_LAYER
	)
	.whereLayer(ArchUnitLayeredArchitectureConstant.RESPONSE_DTO_LAYER).mayOnlyBeAccessedByLayers(
			ArchUnitLayeredArchitectureConstant.DUMMY_LAYER, ArchUnitLayeredArchitectureConstant.UTIL_LAYER
	)
	.whereLayer(ArchUnitLayeredArchitectureConstant.QUERY_REQUEST_DTO_LAYER).mayOnlyBeAccessedByLayers(
			ArchUnitLayeredArchitectureConstant.QUERY_REQUEST_DTO_LAYER, ArchUnitLayeredArchitectureConstant.DUMMY_LAYER, ArchUnitLayeredArchitectureConstant.UTIL_LAYER
	)
	
	// Others
	// 	"Dummy layer"
	// 		Option 1 : 	should be accessible to all (no condition is established)
	// 		Option 2 : 	should not be accessed by anyone in this context project (beware of scanning JARs)
	//					.whereLayer("Dummy layer").mayNotBeAccessedByAnyLayer()
	.whereLayer(ArchUnitLayeredArchitectureConstant.UTIL_LAYER).mayOnlyBeAccessedByLayers(
			ArchUnitLayeredArchitectureConstant.UTIL_LAYER
	);

}
