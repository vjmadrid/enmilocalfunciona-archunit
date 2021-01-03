package com.acme.architecture.testing.archunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.archunit.rule.technology.CatalogArchunitConditionArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.CatalogArchunitPredicateArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.CatalogArchunitRuleArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.CatalogMapstructArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.group.CatalogTechnologyGlobalArchitectureRule;

public class CoverageTechnologyArchitectureRuleTest {
	
	@Test
    public void shouldBeValidTechnologyArchitectureRule() {
		assertNotNull(new CatalogMapstructArchitectureRule());
		assertNotNull(new CatalogArchunitRuleArchitectureRule());
		assertNotNull(new CatalogArchunitConditionArchitectureRule());
		assertNotNull(new CatalogArchunitPredicateArchitectureRule());
    }
	
	@Test
    public void shouldBeValidTechnologyGroupArchitectureRule() {
		assertNotNull(new CatalogTechnologyGlobalArchitectureRule());
    }

}
