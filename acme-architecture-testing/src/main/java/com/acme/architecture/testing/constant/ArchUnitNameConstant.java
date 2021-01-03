package com.acme.architecture.testing.constant;

public final class ArchUnitNameConstant {
	
	private ArchUnitNameConstant() {
		
	}
	
	public static final String PACKAGE_INCLUDE = "..";
	
	public static final String SUFFIX_IMPL = "Impl";

	//*** SUFFIX NAMES ***
	
	public static final String SUFFIX_NAME_ENTITY_CLASS = "Entity";
	
	public static final String SUFFIX_NAME_DTO_CLASS = "DTO";
	public static final String SUFFIX_NAME_REQUEST_DTO_CLASS = "Request";
	public static final String SUFFIX_NAME_RESPONSE_DTO_CLASS = "Response";
	public static final String SUFFIX_NAME_QUERY_REQUEST_DTO_CLASS = "QueryRequest";
	
	public static final String SUFFIX_NAME_REPOSITORY_CLASS = "Repository";
	public static final String SUFFIX_NAME_REPOSITORY_IMPL_CLASS = SUFFIX_NAME_REPOSITORY_CLASS + SUFFIX_IMPL;
	public static final String SUFFIX_NAME_SERVICE_CLASS = "Service";
	public static final String SUFFIX_NAME_SERVICE_IMPL_CLASS = SUFFIX_NAME_SERVICE_CLASS + SUFFIX_IMPL;
	public static final String SUFFIX_NAME_CONTROLLER_CLASS = "Controller";
	
	public static final String SUFFIX_NAME_UTIL_CLASS = "Util";
	public static final String SUFFIX_NAME_SUPPORT_CLASS = "Support";
	
	public static final String SUFFIX_NAME_MAPPER_CLASS = "Mapper";
	public static final String SUFFIX_NAME_MAPPER_IMPL_CLASS = SUFFIX_NAME_MAPPER_CLASS + SUFFIX_IMPL;
	
	public static final String SUFFIX_NAME_DATA_FACTORY_CLASS = "DataFactory";
	public static final String SUFFIX_NAME_DUMMY_DATA_FACTORY_CLASS = SUFFIX_NAME_DATA_FACTORY_CLASS;
	
	public static final String SUFFIX_NAME_CONSTANT_CLASS = "Constant";
	public static final String SUFFIX_NAME_EXCEPTION_CLASS = "Exception";
	public static final String SUFFIX_NAME_ENUMERATION_CLASS = "Enumeration";
	
	//*** PREFIX NAMES ***
	
	public static final String PREFIX_NAME_DUMMY_CLASS = "Dummy";
	public static final String PREFIX_NAME_DUMMY_DATA_FACTORY_CLASS = PREFIX_NAME_DUMMY_CLASS;

}
