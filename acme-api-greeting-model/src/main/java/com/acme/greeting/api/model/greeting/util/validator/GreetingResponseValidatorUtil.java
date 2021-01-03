package com.acme.greeting.api.model.greeting.util.validator;

import com.acme.greeting.api.model.greeting.response.GreetingResponse;

public final class GreetingResponseValidatorUtil {
	
	private GreetingResponseValidatorUtil() {
		throw new IllegalStateException("GreetingValidatorUtil");
	}
	
	public static boolean isNull(GreetingResponse greetingResponse) {
		return (greetingResponse == null);
	}

	public static boolean isNotNull(GreetingResponse greetingResponse) {
		return (greetingResponse != null);
	}

	public static boolean isValid(GreetingResponse greetingResponse) {
		return (isNotNull(greetingResponse) && greetingResponse.getId() != null);
	}

}
