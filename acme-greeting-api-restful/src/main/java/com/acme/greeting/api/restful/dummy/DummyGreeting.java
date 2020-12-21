package com.acme.greeting.api.restful.dummy;

import com.acme.greeting.api.restful.entity.Greeting;
import com.acme.greeting.api.restful.factory.GreetingDataFactory;

public class DummyGreeting {
	
	private DummyGreeting() {
		throw new IllegalStateException("DummyGreeting");
	}
	
	public static Greeting createDefault() {
		return GreetingDataFactory.create(1,"Hola Dummy!!!");
	}

}
