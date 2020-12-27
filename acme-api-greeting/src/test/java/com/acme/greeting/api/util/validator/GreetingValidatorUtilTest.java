package com.acme.greeting.api.util.validator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.acme.greeting.api.dummy.DummyGreeting;
import com.acme.greeting.api.entity.Greeting;

public class GreetingValidatorUtilTest {
	
	private Greeting greetingTest;

	@BeforeEach
	public void init() {
		greetingTest = DummyGreeting.createDefault();
	}

	@Test
	public void shouldIsNull() {
		assertTrue(GreetingValidatorUtil.isNull(null));
	}

	@Test
	public void shouldIsNullWithUserMessageNotNull() {
		assertFalse(GreetingValidatorUtil.isNull(greetingTest));
	}

	@Test
	public void shouldIsNotNull() {
		assertTrue(GreetingValidatorUtil.isNotNull(greetingTest));
	}

	@Test
	public void shouldIsNotNullWithUserMessageNull() {
		assertFalse(GreetingValidatorUtil.isNotNull(null));
	}

	@Test
	public void shouldIsValidWithUserMessageNull() {
		assertFalse(GreetingValidatorUtil.isValid(null));
	}

	@Test
	public void shouldIsValidWithIdUserMessageNull() {
		greetingTest.setId(null);
		assertFalse(GreetingValidatorUtil.isValid(greetingTest));
	}

	@Test
	public void shouldIsValid() {
		assertTrue(GreetingValidatorUtil.isValid(greetingTest));
	}

}
