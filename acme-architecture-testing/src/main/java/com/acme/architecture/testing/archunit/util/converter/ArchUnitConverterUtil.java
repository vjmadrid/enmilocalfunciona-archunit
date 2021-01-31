package com.acme.architecture.testing.archunit.util.converter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.tngtech.archunit.core.domain.JavaClass;

public final class ArchUnitConverterUtil {

	private ArchUnitConverterUtil() {
		throw new IllegalStateException("ArchUnitConverterUtil");
	}
	
	public static List<String> convertSetToList(Set<JavaClass> paramSet){
		List<String> result = new ArrayList<String>();
		
		if ( (paramSet !=null) && (!paramSet.isEmpty())) {
			Iterator<JavaClass> it = (Iterator<JavaClass>) paramSet.iterator();
			while (it.hasNext()) {
				result.add(it.next().getSimpleName());
			}
		}
	
		return result;
	}
}
