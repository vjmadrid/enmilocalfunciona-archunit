package com.acme.example.archunit.core.importclasses.abstracttest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.acme.example.archunit.core.importclasses.component.util.ArchUnitComponentUtil;

public class ClassFileImporterWithAbstractTest extends AbstractArchTest {
	
	private static final int NUM_IMPORTED_CLASSES_DEFAULT_GENERIC_WITH_OPTIONS = 18;
	
	@Test
    public void whenCallImportPackagesDefaultGenericWithOptions_thenReturnJavaClassComponents() {
		System.out.println("\n*** ClassFileImporter Default Generic with Options ***");
		

        //Show : Project Classes (NO test, NO Archives and NO JARs)
        System.out.println("* Show : Project Classes (NO test, NO Archives and NO JARs)");
        ArchUnitComponentUtil.showInfo(IMPORTED_CLASSES);
   
        //Generate JavaClass List
        List<?> importedClassesList = ArchUnitComponentUtil.generarJavaClassList(IMPORTED_CLASSES);
   
        assertNotNull(importedClassesList);
        assertEquals(NUM_IMPORTED_CLASSES_DEFAULT_GENERIC_WITH_OPTIONS,importedClassesList.size());
    }

}

