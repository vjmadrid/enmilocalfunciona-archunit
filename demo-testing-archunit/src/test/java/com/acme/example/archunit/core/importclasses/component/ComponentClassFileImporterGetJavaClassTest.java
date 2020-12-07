package com.acme.example.archunit.core.importclasses.component;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.acme.example.archunit.user.entity.User;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;

public class ComponentClassFileImporterGetJavaClassTest {
	
	private static final String GENERIC_PACKAGE_TEST_VALUE = "com.acme.example";
	
	private static final int NUM_USER_CLASS_FIELDS = 5;
	private static final int NUM_USER_CLASS_METHODS = 23;

	
	@Test
    public void whenCallImportPackagesDefaultWithGetUserClass_thenReturnClassUserPackage() {
		System.out.println("\n *** ClassFileImporter Default show User Class ***");
		
		JavaClasses importedClasses = new ClassFileImporter().importPackages(GENERIC_PACKAGE_TEST_VALUE);

        JavaClass clazz = importedClasses.get(User.class);
        System.out.print("User Class :: "+ clazz.getFullName());
   
        assertNotNull(clazz);
        assertEquals("com.acme.example.archunit.user.entity.User",clazz.getFullName());

        System.out.println("User Class Fields : ");
        System.out.println(Arrays.toString(clazz.getAllFields().toArray()));
        assertEquals(NUM_USER_CLASS_FIELDS,clazz.getAllFields().size());
        
        System.out.println("User Class Methods: ");
        System.out.println(Arrays.toString(clazz.getAllMethods().toArray()));
        assertEquals(NUM_USER_CLASS_METHODS,clazz.getAllMethods().size());
    }

}
