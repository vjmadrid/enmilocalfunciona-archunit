package com.acme.architecture.testing.archunit.rule.technology.group;

import com.acme.architecture.testing.archunit.rule.technology.CatalogArchunitConditionArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.CatalogArchunitRuleArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.CatalogMapstructArchitectureRule;
import com.tngtech.archunit.junit.ArchRules;
import com.tngtech.archunit.junit.ArchTest;

public class CatalogTechnologyGlobalArchitectureRule {
	
	@ArchTest
	public static final ArchRules base_map_struct_architecture = ArchRules.in(CatalogMapstructArchitectureRule.class);
	
	@ArchTest
	public static final ArchRules base_archunit_rule_architecture = ArchRules.in(CatalogArchunitRuleArchitectureRule.class);

	@ArchTest
	public static final ArchRules base_archunit_condition_architecture = ArchRules.in(CatalogArchunitConditionArchitectureRule.class);

}
