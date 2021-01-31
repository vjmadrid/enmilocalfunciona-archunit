package com.acme.architecture.testing.archunit.util;

import com.acme.architecture.testing.constant.ArchUnitNameConstant;

public final class ArchUnitNameUtil {

	private ArchUnitNameUtil() {
		throw new IllegalStateException("ArchUnitNameUtil");
	}
	
	public static String generateNameFromNameImplementation(String param) {
		if ( (param!=null) && (!param.isEmpty())) {
			int indexImplString = param.indexOf(ArchUnitNameConstant.SUFFIX_IMPL);
			
			if (indexImplString > -1) {
				return param.substring(0, indexImplString);
			}
			
		}
		return "";
	}
}
