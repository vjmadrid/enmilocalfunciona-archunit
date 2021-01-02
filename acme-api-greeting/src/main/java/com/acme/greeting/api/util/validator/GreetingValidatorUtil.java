package com.acme.greeting.api.util.validator;

import com.acme.greeting.api.entity.Greeting;

public final class GreetingValidatorUtil {
	
	private GreetingValidatorUtil() {
		throw new IllegalStateException("GreetingValidatorUtil");
	}
	
	public static boolean isNull(Greeting greeting) {
		return (greeting == null);
	}

	public static boolean isNotNull(Greeting greeting) {
		return (greeting != null);
	}

	public static boolean isValid(Greeting greeting) {
		return (isNotNull(greeting) && greeting.getId() != null);
	}

}
