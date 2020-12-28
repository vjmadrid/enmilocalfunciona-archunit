package com.acme.greeting.api.model.greeting.dummy;

import java.util.Arrays;
import java.util.List;

import com.acme.greeting.api.model.greeting.constant.ValueDummyGreetingConstant;
import com.acme.greeting.api.model.greeting.response.GreetingResponse;

public class DummyGreetingResponse {

	private DummyGreetingResponse() {
		throw new IllegalStateException("DummyGreetingResponse");
	}

	public static GreetingResponse createDefault() {
		GreetingResponse response = new GreetingResponse();
		
		response.setId(ValueDummyGreetingConstant.TEST_GREETING_1_ID);
		response.setContent(ValueDummyGreetingConstant.TEST_GREETING_1_CONTENT);
		
		return response;
	}

	public static List<GreetingResponse> createDefaultList() {
		return Arrays.asList(createDefault());
	}

	public static GreetingResponse[] createDefaultArray() {
		return createDefaultList().stream().toArray(GreetingResponse[]::new);
	}

}
