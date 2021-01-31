package com.acme.architecture.testing.archunit.rule.technology.group;

import com.acme.architecture.testing.archunit.rule.technology.catalog.CatalogArchunitConditionArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.catalog.CatalogArchunitRuleArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.catalog.CatalogMapstructArchitectureRule;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

public class CatalogTechnologyGroupArchitectureRule {
	
	@ArchTest
	public static final ArchRules base_map_struct_architecture = ArchRules.in(CatalogMapstructArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_archunit_rule_architecture = ArchRules.in(CatalogArchunitRuleArchitectureRule.class);

	@ArchTest
	public static final ArchRules base_archunit_condition_architecture = ArchRules.in(CatalogArchunitConditionArchitectureRule.class);

}
