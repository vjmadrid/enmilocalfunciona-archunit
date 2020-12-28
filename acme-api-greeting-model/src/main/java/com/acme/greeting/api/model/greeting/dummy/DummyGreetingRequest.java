package com.acme.greeting.api.model.greeting.dummy;

import java.util.Arrays;
import java.util.List;

import com.acme.greeting.api.model.greeting.constant.ValueDummyGreetingConstant;
import com.acme.greeting.api.model.greeting.request.GreetingRequest;

public class DummyGreetingRequest {

	private DummyGreetingRequest() {
		throw new IllegalStateException("DummyGreetingRequest");
	}

	public static GreetingRequest createDefault() {
		GreetingRequest request = new GreetingRequest();
		
		request.setContent(ValueDummyGreetingConstant.TEST_GREETING_1_CONTENT);

		return request;
	}

	public static List<GreetingRequest> createDefaultList() {
		return Arrays.asList(createDefault());
	}

}
