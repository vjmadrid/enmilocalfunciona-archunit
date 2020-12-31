package com.acme.architecture.testing.spring.archunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.spring.archunit.rule.CatalogSpringConfigurationArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.CatalogSpringRepositoryArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.CatalogSpringRestControllerArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.CatalogSpringServiceArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.CatalogSpringServiceImplArchitectureRule;
import com.acme.architecture.testing.spring.archunit.rule.group.CatalogSpringGlobalArchitectureRule;

public class CoverageArchitectureRuleTest {
	
	@Test
	public void shouldBeValidSpringArchitectureRule() {
		assertNotNull(new CatalogSpringConfigurationArchitectureRule());
		assertNotNull(new CatalogSpringServiceArchitectureRule());
		assertNotNull(new CatalogSpringServiceImplArchitectureRule());
		assertNotNull(new CatalogSpringRepositoryArchitectureRule());
		assertNotNull(new CatalogSpringRestControllerArchitectureRule());
	}
	
	@Test
	public void shouldBeValidSpringGroupArchitectureRule() {
		assertNotNull(new CatalogSpringGlobalArchitectureRule());
	}

}
