package com.acme.greeting.api.restful.service;

import com.acme.greeting.api.restful.entity.Greeting;

public interface GreetingService {
	
	Greeting create(long id, String content);

}
