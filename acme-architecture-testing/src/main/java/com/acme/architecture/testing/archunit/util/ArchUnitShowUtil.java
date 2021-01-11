package com.acme.architecture.testing.archunit.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaClasses;

public final class ArchUnitShowUtil {
	
	private ArchUnitShowUtil() {
		throw new IllegalStateException("ArchUnitShowUtil");
	}

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
	
}






 

