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
	public void whenCallIsNullWithNull_thenReturnTrue() {
		assertTrue(GreetingValidatorUtil.isNull(null));
	}

	@Test
	public void whenCallIsNullWithValid_thenReturnFalse() {
		assertFalse(GreetingValidatorUtil.isNull(greetingTest));
	}

	@Test
	public void whenCallIsNotNullWithValid_thenReturnTrue() {
		assertTrue(GreetingValidatorUtil.isNotNull(greetingTest));
	}

	@Test
	public void whenCallIsNotNullWithNull_thenReturnFalse() {
		assertFalse(GreetingValidatorUtil.isNotNull(null));
	}

	@Test
	public void whenCallIsValidWithNull_thenReturnFalse() {
		assertFalse(GreetingValidatorUtil.isValid(null));
	}

	@Test
	public void whenCallIsValidWithNullId_thenReturnFalse() {
		greetingTest.setId(null);
		assertFalse(GreetingValidatorUtil.isValid(greetingTest));
	}

	@Test
	public void whenCallIsValidWithVAlid_thenReturnTrue() {
		assertTrue(GreetingValidatorUtil.isValid(greetingTest));
	}

}
