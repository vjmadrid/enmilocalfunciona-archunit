package com.acme.greeting.api.archunit;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;

public class ClassFileImporterWithSpecificMethodTest {
	
	private static final String GENERIC_PACKAGE_TEST_VALUE = "com.acme.greeting.api";
	
	public static List<Object> generarJavaClassList(final JavaClasses classes) {

		if (classes == null)
			return Collections.emptyList();
		
		return Arrays.asList(classes.toArray());
	}
	
	public static void showInfo(final JavaClasses classes) {

		if (classes == null)
			System.out.println("Invalid JavaClasses Value");
		else {
			
			List<Object> classesList =  generarJavaClassList(classes);

			System.out.println("* Num JavaClass : "+ classesList.size());
			System.out.println("* JavaClass List : ");
			
			for (Object value : classesList) {
				JavaClass javaClass = (JavaClass) value;
				System.out.println("\t* "+javaClass.getFullName());
			}
			
		}
	}	
	
	@Test
    public void whenCallImportPackagesMethodWithOptions_thenReturnJavaClassComponents() {
		System.out.println("\n*** ClassFileImporter Default ***");
		
        JavaClasses importedClasses = new ClassFileImporter()
        		.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
        		//.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_ARCHIVES)
        		//.withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_JARS)
        		.importPackages(GENERIC_PACKAGE_TEST_VALUE);
        
        //Show : Project Classes (NO test, NO Archives and NO JARs)
        System.out.println("* Show : Project Classes (NO tests, NO Archives and NO JARs)");
        showInfo(importedClasses);
    }

}
