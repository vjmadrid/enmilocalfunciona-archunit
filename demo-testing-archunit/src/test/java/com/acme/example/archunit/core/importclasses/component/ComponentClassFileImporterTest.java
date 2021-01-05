package com.acme.example.archunit.core.importclasses.component;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.acme.example.archunit.core.importclasses.component.util.ArchUnitComponentUtil;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;

public class ComponentClassFileImporterTest {
	
	private static final String GENERIC_PACKAGE_TEST_VALUE = "com.acme.example";
	
	private static final int NUM_IMPORTED_CLASSES_DEFAULT = 74;
	private static final int NUM_IMPORTED_CLASSES_CLASSPATH = 178;

	@Test
    public void whenCallImportPackagesDefault_thenReturnJavaClassComponents() {
		System.out.println("\n*** ClassFileImporter Default ***");
		
        JavaClasses importedClasses = new ClassFileImporter().importPackages(GENERIC_PACKAGE_TEST_VALUE);
        
        //Show : Project Classes + Project Test Classes
        System.out.println("* Show : Project Classes + Project Test Classes");
        ArchUnitComponentUtil.showInfo(importedClasses);
        
        //Generate JavaClass List
        List<?> importedClassesList = ArchUnitComponentUtil.generarJavaClassList(importedClasses);
   
        assertNotNull(importedClassesList);
        assertEquals(NUM_IMPORTED_CLASSES_DEFAULT,importedClassesList.size());
    }
	
	@Test
    public void whenCallImportClasspath_thenReturnJavaClassComponents() {
		System.out.println("\n*** ClassFileImporter Classpath ***");
		
        JavaClasses importedClasses = new ClassFileImporter().importClasspath();
        
        //Show : Project Classes + Project Test Classes + Classpath/ Third Party
        System.out.println("* Show : Project Classes + Project Test Classes + Classpath/ Third Party");
        ArchUnitComponentUtil.showInfo(importedClasses);
        
        //Generate JavaClass List
        List<?> importedClassesList = ArchUnitComponentUtil.generarJavaClassList(importedClasses);
        
        assertNotNull(importedClassesList);
        assertEquals(NUM_IMPORTED_CLASSES_CLASSPATH,importedClassesList.size());
    }

}
