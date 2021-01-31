package com.acme.architecture.testing.spring.archunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.spring.archunit.rule.layered.architecture.CatalogSpringLayeredArchitectureRule;

public class CoverageSpringLayeredArchitectureRuleTest {
	
	@Test
    public void shouldBeValidLayeredArchitectureArchitectureRule() {
		assertNotNull(new CatalogSpringLayeredArchitectureRule());
    }

}
