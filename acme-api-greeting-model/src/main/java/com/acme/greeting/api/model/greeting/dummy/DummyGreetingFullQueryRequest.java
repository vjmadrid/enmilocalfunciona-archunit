package com.acme.greeting.api.model.greeting.dummy;

import com.acme.greeting.api.model.greeting.query.GreetingFullQueryRequest;

public class DummyGreetingFullQueryRequest {

	private DummyGreetingFullQueryRequest() {
		throw new IllegalStateException("DummyGreetingFullQueryRequest");
	}

	public static GreetingFullQueryRequest createDefault() {
		GreetingFullQueryRequest fullQueryRequest = new GreetingFullQueryRequest();
		
		fullQueryRequest.setGreetingQuery(DummyGreetingQueryRequest.createDefault());
		
		return fullQueryRequest;

	}

}
