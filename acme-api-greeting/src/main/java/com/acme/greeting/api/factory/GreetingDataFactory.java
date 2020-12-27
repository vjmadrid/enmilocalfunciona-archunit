package com.acme.greeting.api.factory;

import java.util.Date;

import com.acme.greeting.api.entity.Greeting;

public final class GreetingDataFactory {
	
	private GreetingDataFactory() {
		throw new IllegalStateException("DummyGreeting");
	}
	
	public static Greeting create(String content) {
		Greeting response = new Greeting();
		//response.setId(null);
		response.setContent(content);
		response.setResponseTime(new Date());
		return response;
	}
	
	public static Greeting create(long id, String content) {
		Greeting response = create(content);
		response.setId(id);
		return response;
	}

}
