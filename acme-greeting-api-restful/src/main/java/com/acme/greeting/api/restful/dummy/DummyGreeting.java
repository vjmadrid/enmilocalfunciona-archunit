package com.acme.greeting.api.restful.dummy;

import com.acme.greeting.api.restful.dummy.constant.GreetingDummyConstant;
import com.acme.greeting.api.restful.entity.Greeting;
import com.acme.greeting.api.restful.factory.GreetingDataFactory;

public class DummyGreeting {
	
	private DummyGreeting() {
		throw new IllegalStateException("DummyGreeting");
	}
	
	public static Greeting createDefault() {
		return GreetingDataFactory.create(GreetingDummyConstant.TEST_GREETING_1_ID,GreetingDummyConstant.TEST_GREETING_1_CONTENT);
	}

}
