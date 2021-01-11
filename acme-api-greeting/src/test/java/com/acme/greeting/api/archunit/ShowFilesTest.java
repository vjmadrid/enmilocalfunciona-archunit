package com.acme.greeting.api.archunit;


import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.archunit.util.ArchUnitShowUtil;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;

public class ShowFilesTest {
	
	private static final String GENERIC_PACKAGE_TEST_VALUE = "com.acme.greeting.api";
	
	@Test
    public void showFiles() {
		System.out.println("*** Show Files ***");
		
        JavaClasses importedClasses = new ClassFileImporter()
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
        		.importPackages(GENERIC_PACKAGE_TEST_VALUE);
        
        ArchUnitShowUtil.showInfo(importedClasses);
    }

}
