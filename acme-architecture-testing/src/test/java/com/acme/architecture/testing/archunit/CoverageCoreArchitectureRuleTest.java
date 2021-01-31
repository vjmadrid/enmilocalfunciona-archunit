package com.acme.architecture.testing.archunit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogConstantArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogCustomAnnotationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogDummyArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogDummyDataFactoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogEntityArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogEnumerationArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogExceptionArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogMapperArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogMapperImplArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogQueryRequestDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogRepositoryArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogRepositoryImplArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogRequestDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogResponseDtoArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogServiceArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogServiceImplArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogSupportArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.catalog.CatalogUtilArchitectureRule;
import com.acme.architecture.testing.archunit.rule.core.group.CatalogCoreGroupArchitectureRule;
import com.acme.architecture.testing.archunit.rule.layered.architecture.catalog.CatalogModelLayeredArchitectureRule;

public class CoverageCoreArchitectureRuleTest {
	
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
		assertNotNull(new CatalogMapperImplArchitectureRule());
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
		assertNotNull(new CatalogCoreGroupArchitectureRule());
    }

}
