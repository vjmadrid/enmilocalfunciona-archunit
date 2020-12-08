package com.acme.architecture.testing.archunit;

import com.acme.architecture.testing.archunit.constant.ArchUnitPackageConstant;
import com.acme.architecture.testing.archunit.rule.CatalogAnnotationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogArchunitRuleArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogConstantArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogDummyArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogDummyDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogEnumerationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogExceptionArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogSupportArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogUtilArchitectureRule;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

@AnalyzeClasses(packages = ArchUnitPackageConstant.PACKAGE_EXAMPLE, 
//importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class, ImportOption.DoNotIncludeArchives.class })
importOptions = { ImportOption.DoNotIncludeJars.class, ImportOption.DoNotIncludeArchives.class })
public class GenericArchUnitArchitectureWithExampleTest {
	
	@ArchTest
	public static final ArchRules base_constant_architecture = ArchRules.in(CatalogConstantArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_enumeration_architecture = ArchRules.in(CatalogEnumerationArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_exception_architecture = ArchRules.in(CatalogExceptionArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_util_architecture = ArchRules.in(CatalogUtilArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_support_architecture = ArchRules.in(CatalogSupportArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_archunit_rule_architecture = ArchRules.in(CatalogArchunitRuleArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_annotation_architecture = ArchRules.in(CatalogAnnotationArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_dummy_architecture = ArchRules.in(CatalogDummyArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_data_factory_architecture = ArchRules.in(CatalogDataFactoryArchitectureRule.class);

	@ArchTest
	public static final ArchRules base_dummy_data_factory_architecture = ArchRules.in(CatalogDummyDataFactoryArchitectureRule.class);
	
}
