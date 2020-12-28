package com.acme.greeting.api.model.greeting.dummy;

import java.util.Arrays;
import java.util.List;

import com.acme.greeting.api.model.greeting.constant.ValueDummyGreetingConstant;
import com.acme.greeting.api.model.greeting.query.GreetingQueryRequest;

public class DummyGreetingQueryRequest {

	private DummyGreetingQueryRequest() {
		throw new IllegalStateException("DummyGreetingQueryRequest");
	}

	public static GreetingQueryRequest createDefault() {
		GreetingQueryRequest queryRequest = new GreetingQueryRequest();
		
		queryRequest.setContent(ValueDummyGreetingConstant.TEST_GREETING_1_CONTENT);

		return queryRequest;
	}

	public static List<GreetingQueryRequest> createDefaultList() {
		return Arrays.asList(createDefault());
	}

}
