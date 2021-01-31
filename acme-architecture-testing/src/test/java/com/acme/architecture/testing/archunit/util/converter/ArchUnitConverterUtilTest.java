package com.acme.architecture.testing.archunit.util.converter;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.archunit.constant.TestingArchUnitPackageConstant;
import com.acme.architecture.testing.example.constant.ExampleConstant;
import com.acme.architecture.testing.example.repository.impl.ExampleRepositoryImpl;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;

public class ArchUnitConverterUtilTest {
	
	@BeforeEach
	public final void setUp() {

	}
	
	@Test
	public void whenCallAConvertSetToListWithNull_thenReturnAEmptyList() throws Exception {
		List<String> result = ArchUnitConverterUtil.convertSetToList(null);
				
		assertNotNull(result);
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void whenCallAConvertSetToListWithEmpty_thenReturnList() throws Exception {
		
		JavaClasses importedClasses = new ClassFileImporter()
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
        		.importPackages(TestingArchUnitPackageConstant.PACKAGE_EXAMPLE);
		
		JavaClass clazz = importedClasses.get(ExampleConstant.class);
						
		List<String> result = ArchUnitConverterUtil.convertSetToList(clazz.getInterfaces());
				
		assertNotNull(result);
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void whenCallAConvertSetToList_thenReturnList() throws Exception {
		
		JavaClasses importedClasses = new ClassFileImporter()
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
        		.importPackages(TestingArchUnitPackageConstant.PACKAGE_EXAMPLE);
		
		JavaClass clazz = importedClasses.get(ExampleRepositoryImpl.class);
				
				
		List<String> result = ArchUnitConverterUtil.convertSetToList(clazz.getInterfaces());
				
		assertNotNull(result);
		assertFalse(result.isEmpty());
	}

}
