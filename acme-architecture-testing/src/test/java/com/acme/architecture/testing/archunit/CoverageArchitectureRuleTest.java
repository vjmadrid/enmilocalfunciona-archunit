package com.acme.architecture.testing.archunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.archunit.rule.CatalogAnnotationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogArchunitRuleArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogConstantArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogDummyArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogDummyDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogEntityArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogEnumerationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogExceptionArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogGenericArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogSupportArchitectureRule;
import com.acme.architecture.testing.archunit.rule.CatalogUtilArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringConfigurationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringGlobalArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringRepositoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringRestControllerArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringServiceArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringServiceImplArchitectureRule;

public class CoverageArchitectureRuleTest {
	
	@Test
    public void shouldBeValidArchitectureRule() {
		assertNotNull(new CatalogGenericArchitectureRule());
		assertNotNull(new CatalogEntityArchitectureRule());
		assertNotNull(new CatalogConstantArchitectureRule());
		assertNotNull(new CatalogEnumerationArchitectureRule());
		assertNotNull(new CatalogExceptionArchitectureRule());
		assertNotNull(new CatalogUtilArchitectureRule());
		assertNotNull(new CatalogSupportArchitectureRule());
		assertNotNull(new CatalogArchunitRuleArchitectureRule());
		assertNotNull(new CatalogAnnotationArchitectureRule());
		assertNotNull(new CatalogDummyArchitectureRule());
		assertNotNull(new CatalogDataFactoryArchitectureRule());
		assertNotNull(new CatalogDummyDataFactoryArchitectureRule());
    }
	
	@Test
	public void shouldBeValidSpringArchitectureRule() {
		assertNotNull(new CatalogSpringGlobalArchitectureRule());
		assertNotNull(new CatalogSpringConfigurationArchitectureRule());
		assertNotNull(new CatalogSpringServiceArchitectureRule());
		assertNotNull(new CatalogSpringServiceImplArchitectureRule());
		assertNotNull(new CatalogSpringRepositoryArchitectureRule());
		assertNotNull(new CatalogSpringRestControllerArchitectureRule());
	}

}
