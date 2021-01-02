package com.acme.architecture.testing.example.factory;

public final class ExampleDataFactory {
	
	private ExampleDataFactory() {
		throw new IllegalStateException("ExampleDataFactory");
	}
	
	public static String generateEntity() {
		return "";
	}

}
