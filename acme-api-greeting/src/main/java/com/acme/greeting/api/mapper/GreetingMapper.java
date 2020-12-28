package com.acme.greeting.api.mapper;

import java.util.List;

import com.acme.greeting.api.entity.Greeting;
import com.acme.greeting.api.model.greeting.query.GreetingQueryRequest;
import com.acme.greeting.api.model.greeting.request.GreetingRequest;
import com.acme.greeting.api.model.greeting.response.GreetingResponse;

public interface GreetingMapper {
	
	Greeting toGreeting(GreetingRequest greetingRequest);

	List<GreetingResponse> toGreetingResponseList(List<Greeting> greetingList);

	GreetingResponse toGreetingResponse(Greeting greeting);

	Greeting toGreeting(GreetingQueryRequest greetingQueryRequest);

}
