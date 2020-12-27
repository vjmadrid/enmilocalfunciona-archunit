package com.acme.greeting.api.dummy;

import java.util.ArrayList;
import java.util.List;

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
	
	public static List<Greeting> createDefaultList() {
		final List<Greeting> list = new ArrayList<>();
		
		list.add(GreetingDataFactory.create(GreetingDummyConstant.TEST_GREETING_1_ID,GreetingDummyConstant.TEST_GREETING_1_CONTENT));
		
		return list;
	}
	
	public static List<Greeting> createList() {
		final List<Greeting> list = createDefaultList();
		
		list.add(GreetingDataFactory.create(GreetingDummyConstant.TEST_GREETING_2_ID,GreetingDummyConstant.TEST_GREETING_2_CONTENT));
		list.add(GreetingDataFactory.create(GreetingDummyConstant.TEST_GREETING_3_ID,GreetingDummyConstant.TEST_GREETING_3_CONTENT));
		
		return list;
	}

}
