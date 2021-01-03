package com.acme.architecture.testing.constant;

public final class TechnologyArchUnitPackageConstant {
	
	private TechnologyArchUnitPackageConstant() {
	}
	
	public static final String PACKAGE_INCLUDE = "..";
	
	//*** FINAL PACKAGE ***
	
	public static final String RESIDE_FINAL_PACKAGE_MAPPER_STRUCT_CLASS = "..mapper.struct";
	
	public static final String RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS = "..archunit.rule";
	public static final String RESIDE_FINAL_PACKAGE_ARCHUNIT_CONDITION_CLASS = "..archunit.condition";
	public static final String RESIDE_FINAL_PACKAGE_ARCHUNIT_PREDICATE_CLASS = "..archunit.predicate";

	//*** PACKAGE ***
	
	public static final String RESIDE_PACKAGE_MAPPER_STRUCT_CLASS = RESIDE_FINAL_PACKAGE_MAPPER_STRUCT_CLASS + PACKAGE_INCLUDE;
	
	public static final String RESIDE_PACKAGE_ARCHUNIT_RULE_CLASS = RESIDE_FINAL_PACKAGE_ARCHUNIT_RULE_CLASS + PACKAGE_INCLUDE;
	public static final String RESIDE_PACKAGE_ARCHUNIT_CONDITION_CLASS = RESIDE_FINAL_PACKAGE_ARCHUNIT_CONDITION_CLASS + PACKAGE_INCLUDE;
	public static final String RESIDE_PACKAGE_ARCHUNIT_PREDICATE_CLASS = RESIDE_FINAL_PACKAGE_ARCHUNIT_PREDICATE_CLASS + PACKAGE_INCLUDE;

}
