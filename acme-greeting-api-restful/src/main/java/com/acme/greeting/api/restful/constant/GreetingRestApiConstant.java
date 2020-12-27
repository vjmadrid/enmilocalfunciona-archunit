package com.acme.greeting.api.restful.constant;

public final class GreetingRestApiConstant {

	private GreetingRestApiConstant() {
		
	}
	
	public static final String MAPPING = "/greeting";	
	public static final String MAPPING_PK = "/{id}";
	public static final String MAPPING_NAME_PARAMETER = "name";
	
	public static final String DEFAUL_VALUE_PK = "World";
	
	public static final String TEMPLATE_MESSAGE = "Hello, %s!";
		
}
