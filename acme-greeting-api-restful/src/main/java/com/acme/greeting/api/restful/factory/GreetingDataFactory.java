package com.acme.greeting.api.restful.factory;

import java.util.Date;

import com.acme.greeting.api.restful.entity.Greeting;

public final class GreetingDataFactory {
	
	private GreetingDataFactory() {
		throw new IllegalStateException("DummyGreeting");
	}
	
	public static Greeting create(long id, String content) {
		Greeting response = new Greeting();
		response.setId(id);
		response.setContent(content);
		response.setResponseTime(new Date());
		return response;
	}

}
