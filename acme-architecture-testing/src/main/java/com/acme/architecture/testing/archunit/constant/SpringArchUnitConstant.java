package com.acme.architecture.testing.archunit.constant;

public final class SpringArchUnitConstant {
	
	private SpringArchUnitConstant() {
	}
	
	public static final String SUFFIX_NAME_SPRING_REPOSITORY_CLASS = ArchUnitNameConstant.SUFFIX_NAME_REPOSITORY_CLASS;
	public static final String SUFFIX_NAME_SPRING_SERVICE_CLASS = ArchUnitNameConstant.SUFFIX_NAME_SERVICE_CLASS;
	public static final String SUFFIX_NAME_SPRING_IMPL_SERVICE_CLASS =  "ServiceImpl";
	public static final String SUFFIX_NAME_SPRING_REST_CONTROLLER_CLASS = "RestController";
//	public static final String SUFFIX_NAME_SPRING_COMPONENT_CLASS = "Component";
//	public static final String SUFFIX_NAME_SPRING_APPLICATION_CLASS = "Application";
	public static final String SUFFIX_NAME_SPRING_CONFIG_CLASS = "Config";

	
	public static final String RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS = ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_CLASS;
	public static final String RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS = ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_CLASS;
	public static final String RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS = "..service.impl";
	public static final String RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS = "..controller";
//	public static final String RESIDE_FINAL_PACKAGE_SPRING_COMPONENT_CLASS = "..component";
//	public static final String RESIDE_FINAL_PACKAGE_SPRING_APPLICATION_CLASS = "..app";
	public static final String RESIDE_FINAL_PACKAGE_SPRING_CONFIG_CLASS = "..config";

	public static final String RESIDE_PACKAGE_SPRING_REPOSITORY_CLASS = RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS+ArchUnitPackageConstant.PACKAGE_INCLUDE;
	public static final String RESIDE_PACKAGE_SPRING_SERVICE_CLASS = RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS+ArchUnitPackageConstant.PACKAGE_INCLUDE;
	public static final String RESIDE_PACKAGE_SPRING_IMPL_SERVICE_CLASS = RESIDE_FINAL_PACKAGE_SPRING_IMPL_SERVICE_CLASS+ArchUnitPackageConstant.PACKAGE_INCLUDE;
	public static final String RESIDE_PACKAGE_SPRING_REST_CONTROLLER_CLASS = RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS+ArchUnitPackageConstant.PACKAGE_INCLUDE;
//	public static final String RESIDE_PACKAGE_SPRING_COMPONENT_CLASS = RESIDE_FINAL_PACKAGE_SPRING_COMPONENT_CLASS+ArchUnitConstant.PACKAGE_INCLUDE;
//	public static final String RESIDE_PACKAGE_SPRING_APPLICATION_CLASS = RESIDE_FINAL_PACKAGE_SPRING_APPLICATION_CLASS+ArchUnitConstant.PACKAGE_INCLUDE;
	public static final String RESIDE_PACKAGE_SPRING_CONFIG_CLASS = RESIDE_FINAL_PACKAGE_SPRING_CONFIG_CLASS+ArchUnitPackageConstant.PACKAGE_INCLUDE;
//	
	
}
