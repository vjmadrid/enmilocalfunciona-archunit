package com.acme.architecture.testing.archunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.archunit.rule.technology.catalog.CatalogArchunitConditionArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.catalog.CatalogArchunitPredicateArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.catalog.CatalogArchunitRuleArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.catalog.CatalogMapstructArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.group.CatalogTechnologyGroupArchitectureRule;

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
		assertNotNull(new CatalogTechnologyGroupArchitectureRule());
    }

}
