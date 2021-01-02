package com.acme.architecture.testing.example.util;

public final class ExampleUtil {

	private ExampleUtil() {
		throw new IllegalStateException("ExampleUtil");
	}
	
	public static boolean getValue() {
		return Boolean.TRUE;
	}
}
