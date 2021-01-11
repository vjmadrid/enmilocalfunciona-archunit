package com.acme.architecture.testing.spring.constant;

import com.acme.architecture.testing.constant.ArchUnitPackageConstant;

public final class SpringArchUnitPackageConstant {
	
	private SpringArchUnitPackageConstant() {
	}
	
	public static final String RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS = ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_REPOSITORY_CLASS;
	public static final String RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS = ArchUnitPackageConstant.RESIDE_FINAL_PACKAGE_SERVICE_CLASS;
	public static final String RESIDE_FINAL_PACKAGE_SPRING_SERVICE_IMPL_CLASS = "..service.impl";
	public static final String RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS = "..controller";
	public static final String RESIDE_FINAL_PACKAGE_SPRING_COMPONENT_CLASS = "..component";
	public static final String RESIDE_FINAL_PACKAGE_SPRING_CONFIG_CLASS = "..config";

	public static final String RESIDE_PACKAGE_SPRING_REPOSITORY_CLASS = RESIDE_FINAL_PACKAGE_SPRING_REPOSITORY_CLASS + ArchUnitPackageConstant.PACKAGE_INCLUDE;
	public static final String RESIDE_PACKAGE_SPRING_SERVICE_CLASS = RESIDE_FINAL_PACKAGE_SPRING_SERVICE_CLASS + ArchUnitPackageConstant.PACKAGE_INCLUDE;
	public static final String RESIDE_PACKAGE_SPRING_SERVICE_IMPL_CLASS = RESIDE_FINAL_PACKAGE_SPRING_SERVICE_IMPL_CLASS + ArchUnitPackageConstant.PACKAGE_INCLUDE;
	public static final String RESIDE_PACKAGE_SPRING_REST_CONTROLLER_CLASS = RESIDE_FINAL_PACKAGE_SPRING_REST_CONTROLLER_CLASS+ArchUnitPackageConstant.PACKAGE_INCLUDE;
	public static final String RESIDE_PACKAGE_SPRING_COMPONENT_CLASS = RESIDE_FINAL_PACKAGE_SPRING_COMPONENT_CLASS + ArchUnitPackageConstant.PACKAGE_INCLUDE;
	public static final String RESIDE_PACKAGE_SPRING_CONFIG_CLASS = RESIDE_FINAL_PACKAGE_SPRING_CONFIG_CLASS+ArchUnitPackageConstant.PACKAGE_INCLUDE;	
	
}
