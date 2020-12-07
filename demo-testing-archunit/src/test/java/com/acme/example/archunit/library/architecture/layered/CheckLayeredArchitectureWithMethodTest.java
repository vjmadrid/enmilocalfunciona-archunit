package com.acme.example.archunit.library.architecture.layered;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import org.junit.jupiter.api.Test;

import com.acme.example.archunit.constant.ArchUnitArchitectureConstant;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;

public class CheckLayeredArchitectureWithMethodTest {

	private static final String GENERIC_PACKAGE_TEST_VALUE = "com.acme.example";

	private JavaClasses IMPORTED_CLASSES = new ClassFileImporter()
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS).importPackages(GENERIC_PACKAGE_TEST_VALUE);

	@Test
	public void layer_dependencies_are_respected() {
		layeredArchitecture()

			.layer(ArchUnitArchitectureConstant.ENTITY_LAYER).definedBy("..entity..")
			.layer(ArchUnitArchitectureConstant.REPOSITORY_LAYER).definedBy("..repository..")
			.layer(ArchUnitArchitectureConstant.SERVICE_LAYER).definedBy("..service..")
			.layer("Factory").definedBy("..factory..")
			.layer("Util").definedBy("..util..")
			.layer(ArchUnitArchitectureConstant.CONTROLLER_LAYER).definedBy("..controller..")
			//.layer(ArchUnitArchitectureConstant.DTO_LAYER).definedBy("..dto..")
				
				
	
				//.whereLayer(ArchUnitArchitectureConstant.DTO_LAYER).mayOnlyBeAccessedByLayers("Web")
				.whereLayer(ArchUnitArchitectureConstant.ENTITY_LAYER).mayOnlyBeAccessedByLayers(ArchUnitArchitectureConstant.REPOSITORY_LAYER, ArchUnitArchitectureConstant.SERVICE_LAYER, "Factory", ArchUnitArchitectureConstant.CONTROLLER_LAYER)
				.whereLayer(ArchUnitArchitectureConstant.REPOSITORY_LAYER).mayOnlyBeAccessedByLayers(ArchUnitArchitectureConstant.SERVICE_LAYER)
				.whereLayer(ArchUnitArchitectureConstant.SERVICE_LAYER).mayOnlyBeAccessedByLayers(ArchUnitArchitectureConstant.CONTROLLER_LAYER)
				
                .check(IMPORTED_CLASSES);
	}
	

}

