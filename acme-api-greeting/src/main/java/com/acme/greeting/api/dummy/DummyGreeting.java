package com.acme.greeting.api.dummy;

import com.acme.greeting.api.dummy.constant.GreetingDummyConstant;
import com.acme.greeting.api.entity.Greeting;
import com.acme.greeting.api.factory.GreetingDataFactory;

public class DummyGreeting {
	
	private DummyGreeting() {
		throw new IllegalStateException("DummyGreeting");
	}
	
	public static Greeting createDefault() {
		return GreetingDataFactory.create(GreetingDummyConstant.TEST_GREETING_1_ID,GreetingDummyConstant.TEST_GREETING_1_CONTENT);
	}

}
