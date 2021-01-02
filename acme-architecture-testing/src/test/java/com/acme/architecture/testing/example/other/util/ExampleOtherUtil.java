package com.acme.architecture.testing.example.other.util;

public final class ExampleOtherUtil {

	private ExampleOtherUtil() {
		throw new IllegalStateException("ExampleValidOtherUtil");
	}
	
	public static boolean getValue() {
		return Boolean.TRUE;
	}
}
