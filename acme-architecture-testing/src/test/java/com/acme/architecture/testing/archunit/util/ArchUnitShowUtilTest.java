package com.acme.architecture.testing.archunit.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;

public class ArchUnitShowUtilTest {
	
	@BeforeEach
	public final void setUp() {

	}
	
	@Test
	public void whenCallAGenerarJavaClassListWithNull_thenReturnEmptyList() throws Exception {

		List<Object> result = ArchUnitShowUtil.generarJavaClassList(null);
		
		assertNotNull(result);
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void whenCallAGenerarJavaClassList_thenReturnEmptyList() throws Exception {

		JavaClasses importedClasses = new ClassFileImporter()
		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
		.importPackages(TestingArchUnitPackageConstant.PACKAGE_EXAMPLE);
		
		List<Object> result = ArchUnitShowUtil.generarJavaClassList(importedClasses);
		
		assertNotNull(result);
		assertFalse(result.isEmpty());
	}
	
	@Test
	public void whenCallAShowInfoWithNull_thenReturnConsoleValue() throws Exception {

		ArchUnitShowUtil.showInfo(null);
		
	}
	

	@Test
	public void whenCallAShowInfo_thenReturnConsoleValue() throws Exception {
		JavaClasses importedClasses = new ClassFileImporter()
				.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
				.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
				.importPackages(TestingArchUnitPackageConstant.PACKAGE_EXAMPLE);

		ArchUnitShowUtil.showInfo(importedClasses);
		
	}

	

}
