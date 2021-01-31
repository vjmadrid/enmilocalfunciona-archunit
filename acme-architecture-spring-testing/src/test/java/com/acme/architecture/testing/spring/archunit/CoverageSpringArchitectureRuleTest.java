package com.acme.architecture.testing.spring.archunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringConfigurationArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringRepositoryArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringRestControllerArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringServiceArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.catalog.CatalogSpringServiceImplArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.group.CatalogSpringGroupArchitectureRule;

public class CoverageSpringArchitectureRuleTest {
	
	@Test
	public void shouldBeValidSpringArchitectureRule() {
		assertNotNull(new CatalogSpringConfigurationArchitectureRule());
		assertNotNull(new CatalogSpringRepositoryArchitectureRule());
		assertNotNull(new CatalogSpringRestControllerArchitectureRule());
		assertNotNull(new CatalogSpringServiceArchitectureRule());
		assertNotNull(new CatalogSpringServiceImplArchitectureRule());
	}
	
	@Test
	public void shouldBeValidSpringGroupArchitectureRule() {
		assertNotNull(new CatalogSpringGroupArchitectureRule());
	}

}
