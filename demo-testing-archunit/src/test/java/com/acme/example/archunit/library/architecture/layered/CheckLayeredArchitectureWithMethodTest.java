package com.acme.example.archunit.library.architecture.layered;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import org.junit.jupiter.api.Test;

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
	public void whenCallLayeredArchitectureWithLayers_thenReturnLayerDependenciesRespected() {
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
			.whereLayer("Controller layer").mayNotBeAccessedByAnyLayer()
			//.whereLayer("Config layer").mayNotBeAccessedByAnyLayer()
			//Check
            .check(IMPORTED_CLASSES);
	}
	

}

