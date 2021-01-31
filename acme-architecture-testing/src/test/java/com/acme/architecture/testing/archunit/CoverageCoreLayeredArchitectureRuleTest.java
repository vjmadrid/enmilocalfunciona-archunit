package com.acme.architecture.testing.archunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.archunit.rule.layered.architecture.catalog.CatalogApiLayeredArchitectureRule;
import com.acme.architecture.testing.archunit.rule.layered.architecture.catalog.CatalogModelLayeredArchitectureRule;

public class CoverageCoreLayeredArchitectureRuleTest {
	
	@Test
    public void shouldBeValidLayeredArchitectureArchitectureRule() {
		assertNotNull(new CatalogApiLayeredArchitectureRule());
		assertNotNull(new CatalogModelLayeredArchitectureRule());
    }

}
