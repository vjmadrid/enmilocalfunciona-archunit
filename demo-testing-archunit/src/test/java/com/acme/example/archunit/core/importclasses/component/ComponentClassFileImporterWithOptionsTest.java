package com.acme.example.archunit.core.importclasses.component;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.acme.example.archunit.core.importclasses.component.util.ArchUnitComponentUtil;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;


public class ComponentClassFileImporterWithOptionsTest {
	
	private static final String GENERIC_PACKAGE_TEST_VALUE = "com.acme.example";
	private static final String USER_PACKAGE_TEST_VALUE = "com.acme.example.archunit.user";
	
	private static final int NUM_IMPORTED_CLASSES_DEFAULT_GENERIC_WITH_OPTIONS = 18;
	private static final int NUM_IMPORTED_CLASSES_DEFAULT_USER_PACKAGE_WITH_OPTIONS = 12;
	
	@Test
    public void whenCallImportPackagesDefaultGenericWithOptions_thenReturnJavaClassComponents() {
		System.out.println("\n*** ClassFileImporter Default Generic with Options ***");
		
        JavaClasses importedClasses = new ClassFileImporter()
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
        		.importPackages(GENERIC_PACKAGE_TEST_VALUE);
        
        //Show : Project Classes (NO test, NO Archives and NO JARs)
        System.out.println("* Show : Project Classes (NO test, NO Archives and NO JARs)");
        ArchUnitComponentUtil.showInfo(importedClasses);
   
        //Generate JavaClass List
        List<?> importedClassesList = ArchUnitComponentUtil.generarJavaClassList(importedClasses);
   
        assertNotNull(importedClassesList);
        assertEquals(NUM_IMPORTED_CLASSES_DEFAULT_GENERIC_WITH_OPTIONS,importedClassesList.size());
    }
	
	@Test
    public void whenCallImportPackagesDefaultUserPackageWithOptions_thenReturnJavaClassComponents() {
		System.out.println("\\n*** ClassFileImporter Default User Package with Options ***");
		
		JavaClasses importedClasses = new ClassFileImporter()
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
        		.importPackages(USER_PACKAGE_TEST_VALUE);

		//Show : Project Classes (NO test and NO Archives)
        System.out.println("* Show : Project Classes (NO test and NO Archives)");
        ArchUnitComponentUtil.showInfo(importedClasses);
        
        //Generate JavaClass List
        List<?> importedClassesList = ArchUnitComponentUtil.generarJavaClassList(importedClasses);
   
        assertNotNull(importedClassesList);
        assertEquals(NUM_IMPORTED_CLASSES_DEFAULT_USER_PACKAGE_WITH_OPTIONS,importedClassesList.size());
    }

}
