package com.acme.architecture.testing.archunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.archunit.rule.core.CatalogConstantArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogCustomAnnotationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDummyArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogDummyDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogEntityArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogEnumerationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogExceptionArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogMapperArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogQueryRequestDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogRepositoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogRepositoryImplArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogRequestDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogResponseDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogServiceArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogServiceImplArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogSupportArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.CatalogUtilArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.group.CatalogCoreGlobalArchitectureRule;
import com.acme.architecture.testing.archunit.rule.layered.architecture.CatalogModelLayeredArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.CatalogArchunitRuleArchitectureRule;
import com.acme.architecture.testing.archunit.rule.technology.CatalogMapstructArchitectureRule;

public class CoverageArchitectureRuleTest {
	
	@Test
    public void shouldBeValidCoreArchitectureRule() {
		assertNotNull(new CatalogConstantArchitectureRule());
		assertNotNull(new CatalogCustomAnnotationArchitectureRule());
		assertNotNull(new CatalogDataFactoryArchitectureRule());
		assertNotNull(new CatalogDummyArchitectureRule());
		assertNotNull(new CatalogDummyDataFactoryArchitectureRule());
		assertNotNull(new CatalogEntityArchitectureRule());
		assertNotNull(new CatalogEnumerationArchitectureRule());
		assertNotNull(new CatalogExceptionArchitectureRule());
		assertNotNull(new CatalogMapperArchitectureRule());
		assertNotNull(new CatalogQueryRequestDtoArchitectureRule());
		assertNotNull(new CatalogRepositoryArchitectureRule());
		assertNotNull(new CatalogRepositoryImplArchitectureRule());
		assertNotNull(new CatalogRequestDtoArchitectureRule());
		assertNotNull(new CatalogResponseDtoArchitectureRule());
		assertNotNull(new CatalogServiceArchitectureRule());
		assertNotNull(new CatalogServiceImplArchitectureRule());
		assertNotNull(new CatalogSupportArchitectureRule());
		assertNotNull(new CatalogUtilArchitectureRule());
    }
	
	@Test
    public void shouldBeValidCoreGroupArchitectureRule() {
		assertNotNull(new CatalogCoreGlobalArchitectureRule());
    }
	
	@Test
    public void shouldBeValidLayeredArchitectureArchitectureRule() {
		assertNotNull(new CatalogModelLayeredArchitectureRule());
    }
	
	@Test
    public void shouldBeValidTechnologyArchitectureRule() {
		assertNotNull(new CatalogMapstructArchitectureRule());
		assertNotNull(new CatalogArchunitRuleArchitectureRule());
    }

}
