package com.acme.greeting.api.model.greeting.archunit.sonar;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import com.acme.architecture.testing.constant.ArchUnitLayeredArchitectureConstant;
import com.acme.architecture.testing.constant.ArchUnitPackageConstant;
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
public class CheckArchitectureLayeredTest {
	
	@ArchTest
	public static final ArchRule layered_architecture = 
	layeredArchitecture()
	

    // **************
    // *** Layers ***
	// **************
    
	.layer(ArchUnitLayeredArchitectureConstant.UTIL_LAYER).definedBy(ArchUnitPackageConstant.RESIDE_PACKAGE_UTIL_CLASS)
	

	// ******************
	// *** Conditions ***
	// ******************
	
	.whereLayer(ArchUnitLayeredArchitectureConstant.UTIL_LAYER).mayOnlyBeAccessedByLayers(
			ArchUnitLayeredArchitectureConstant.UTIL_LAYER
	);

}
