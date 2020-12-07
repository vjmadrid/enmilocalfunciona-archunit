package com.acme.example.archunit.constant;

public final class ArchUnitArchitectureConstant {

	private ArchUnitArchitectureConstant() {
	}

	// Basic
	public static final String DTO_LAYER = "DTO layer";
	public static final String ENTITY_LAYER = "Entity layer";
	public static final String REPOSITORY_LAYER = "Repository layer";
	public static final String SERVICE_LAYER = "Service layer";
	public static final String CONTROLLER_LAYER = "Controller layer";
	
	public static final String DTO_LAYER_PACKAGES = "com.company.projectx.dto..";
	public static final String ENTITY_LAYER_PACKAGES = "com.company.projectx.entity..";
	public static final String REPOSITORY_LAYER_PACKAGES = "com.company.projectx.repository..";
	public static final String SERVICE_LAYER_PACKAGES = "com.company.projectx.service..";
	public static final String CONTROLLER_LAYER_PACKAGES = "com.company.projectx.controller..";
	
	// Port & Adapters
	public static final String DOMAIN_LAYER = "Domain layer";
	public static final String APPLICATION_LAYER = "Application layer";
	public static final String ADAPTERS_LAYER = "Adapters layer";

	
	public static final String DOMAIN_LAYER_PACKAGES = "com.company.projectx.domain..";
	public static final String APPLICATION_LAYER_PACKAGES = "com.company.projectx.application..";
	public static final String ADAPTERS_LAYER_PACKAGES = "com.company.projectx.adapters..";
	
	public static final String PRIMARY_ADAPTERS_PACKAGES = "com.company.projectx.adapters.primary..";
	public static final String SECONDARY_ADAPTERS_PACKAGES = "com.company.projectx.adapters.secondary..";

}

