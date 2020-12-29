package com.acme.greeting.api.model.greeting.util.validator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.acme.greeting.api.model.greeting.dummy.DummyGreetingResponse;
import com.acme.greeting.api.model.greeting.response.GreetingResponse;

public class GreetingResponseValidatorUtilTest {
	
	private GreetingResponse greetingResponseTest;

	@BeforeEach
	public void init() {
		greetingResponseTest = DummyGreetingResponse.createDefault();
	}

	@Test
	public void whenCallIsNullWithNull_thenReturnTrue() {
		assertTrue(GreetingResponseValidatorUtil.isNull(null));
	}

	@Test
	public void whenCallIsNullWithValid_thenReturnFalse() {
		assertFalse(GreetingResponseValidatorUtil.isNull(greetingResponseTest));
	}

	@Test
	public void whenCallIsNotNullWithValid_thenReturnTrue() {
		assertTrue(GreetingResponseValidatorUtil.isNotNull(greetingResponseTest));
	}

	@Test
	public void whenCallIsNotNullWithNull_thenReturnFalse() {
		assertFalse(GreetingResponseValidatorUtil.isNotNull(null));
	}

	@Test
	public void whenCallIsValidWithNull_thenReturnFalse() {
		assertFalse(GreetingResponseValidatorUtil.isValid(null));
	}

	@Test
	public void whenCallIsValidWithNullId_thenReturnFalse() {
		greetingResponseTest.setId(null);
		assertFalse(GreetingResponseValidatorUtil.isValid(greetingResponseTest));
	}

	@Test
	public void whenCallIsValidWithVAlid_thenReturnTrue() {
		assertTrue(GreetingResponseValidatorUtil.isValid(greetingResponseTest));
	}

}
