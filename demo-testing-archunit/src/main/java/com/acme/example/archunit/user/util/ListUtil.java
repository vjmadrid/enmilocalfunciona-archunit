package com.acme.example.archunit.user.util;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.acme.example.archunit.user.annotation.UtilDescription;

@UtilDescription(value = "Test Description ListUtil")
public final class ListUtil {

	protected ListUtil() {
		throw new IllegalStateException("ListUtil");
	}

	public static List<String> getNumericList(final List<String> strList) {

		if (strList == null || strList.isEmpty())
			return Collections.emptyList();

		return strList.stream().filter(ListUtil::isNumeric).collect(Collectors.toList());
	}
	
	
	public static boolean isNumeric(final String str) {

		if (str == null || str.length() == 0) {
			return false;
		}

		return str.chars().allMatch(Character::isDigit);

	}
	
}
