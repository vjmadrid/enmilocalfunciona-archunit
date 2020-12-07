package com.acme.example.archunit.library.architecture;

import org.junit.jupiter.api.Test;

import com.acme.example.archunit.constant.ArchUnitArchitectureConstant;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.Architectures;

public class AssertPortsAndAdaptersArchitectureTest {

	private static final String GENERIC_PACKAGE_TEST_VALUE = "com.acme.example";

	private JavaClasses IMPORTED_CLASSES = new ClassFileImporter()
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
			.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS).importPackages(GENERIC_PACKAGE_TEST_VALUE);

	private static Architectures.LayeredArchitecture portsAndAdaptersArchitecture = Architectures.layeredArchitecture()
			.layer(ArchUnitArchitectureConstant.DOMAIN_LAYER)
			.definedBy(ArchUnitArchitectureConstant.DOMAIN_LAYER_PACKAGES)
			.layer(ArchUnitArchitectureConstant.APPLICATION_LAYER)
			.definedBy(ArchUnitArchitectureConstant.APPLICATION_LAYER_PACKAGES)
			.layer(ArchUnitArchitectureConstant.ADAPTERS_LAYER)
			.definedBy(ArchUnitArchitectureConstant.ADAPTERS_LAYER_PACKAGES);

	@Test
	public void domainLayerShouldOnlyBeAccessedByApplicationLayer() {
		ArchRule rule = portsAndAdaptersArchitecture.whereLayer(ArchUnitArchitectureConstant.DOMAIN_LAYER)
				.mayOnlyBeAccessedByLayers(ArchUnitArchitectureConstant.APPLICATION_LAYER);
		rule.check(IMPORTED_CLASSES);
	}
	
	 @Test
	  public void applicationLayerMayOnlyBeAccessedByAdaptersLayer() {
	    ArchRule rule = portsAndAdaptersArchitecture
	      .whereLayer(ArchUnitArchitectureConstant.APPLICATION_LAYER)
	      .mayOnlyBeAccessedByLayers(ArchUnitArchitectureConstant.ADAPTERS_LAYER);
	    rule.check(IMPORTED_CLASSES);
	  }

	  @Test
	  public void adaptersLayerShouldNotBeAccessedByAnyLayer() {
	    ArchRule rule = portsAndAdaptersArchitecture.whereLayer(ArchUnitArchitectureConstant.ADAPTERS_LAYER)
	      .mayNotBeAccessedByAnyLayer();
	    rule.check(IMPORTED_CLASSES);
	  }

}