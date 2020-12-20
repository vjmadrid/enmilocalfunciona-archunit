package com.acme.architecture.testing.archunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.archunit.rule.core.CatalogArchunitRuleArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogConstantArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogCustomAnnotationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDummyArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDummyDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogEntityArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogEnumerationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogExceptionArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogSupportArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogUtilArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.group.CatalogCoreGlobalArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringConfigurationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringRepositoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringRestControllerArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringServiceArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.CatalogSpringServiceImplArchitectureRule;
import com.acme.architecture.testing.archunit.rule.spring.group.CatalogSpringGlobalArchitectureRule;

public class CoverageArchitectureRuleTest {
	
	@Test
    public void shouldBeValidArchitectureRule() {
		assertNotNull(new CatalogCoreGlobalArchitectureRule());
		assertNotNull(new CatalogEntityArchitectureRule());
		assertNotNull(new CatalogConstantArchitectureRule());
		assertNotNull(new CatalogEnumerationArchitectureRule());
		assertNotNull(new CatalogExceptionArchitectureRule());
		assertNotNull(new CatalogUtilArchitectureRule());
		assertNotNull(new CatalogSupportArchitectureRule());
		assertNotNull(new CatalogArchunitRuleArchitectureRule());
		assertNotNull(new CatalogCustomAnnotationArchitectureRule());
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
