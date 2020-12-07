package com.acme.example.archunit.library.generalcodingrules;

import org.junit.jupiter.api.Test;

import com.acme.example.archunit.core.importclasses.abstracttest.AbstractArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import com.tngtech.archunit.library.GeneralCodingRules;

public class CheckGeneralCodingRulesWithMethodTest extends AbstractArchTest {

	@Test
	public void whenCallCheckNoClassesWith_THROW_GENERIC_EXCEPTIONS_thenReturnSuccess() {
		ArchRule no_classes_should_throw_generic_exceptions = ArchRuleDefinition.noClasses().should(GeneralCodingRules.THROW_GENERIC_EXCEPTIONS);
		no_classes_should_throw_generic_exceptions.check(IMPORTED_CLASSES);
	}

	@Test
	public void whenCallCheckNoClassesWith_USE_JAVA_UTIL_LOGGING_thenReturnSuccess() {
		ArchRule no_classes_should_use_standard_logging = ArchRuleDefinition.noClasses().should(GeneralCodingRules.USE_JAVA_UTIL_LOGGING);
		no_classes_should_use_standard_logging.check(IMPORTED_CLASSES);
	}

}
