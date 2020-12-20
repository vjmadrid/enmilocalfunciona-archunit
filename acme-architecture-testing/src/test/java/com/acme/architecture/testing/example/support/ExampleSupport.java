package com.acme.architecture.testing.example.support;

public class ExampleSupport {

	private static final String PRIVATE_VALUE = "private-value";

	public static final String PUBLIC_VALUE = "private-value";
	
	protected static final String PROTECTED_VALUE = "protected-value";

	private Exception exceptionExample;
	
	public String stringValue;

	public String shouldGetReturnPrivateValue() {
		return PRIVATE_VALUE;
	}
	
}
