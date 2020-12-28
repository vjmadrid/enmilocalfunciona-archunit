package com.acme.greeting.api.mapper.struct;

import org.mapstruct.Mapper;

import com.acme.greeting.api.entity.Greeting;
import com.acme.greeting.api.model.greeting.query.GreetingQueryRequest;
import com.acme.greeting.api.model.greeting.request.GreetingRequest;
import com.acme.greeting.api.model.greeting.response.GreetingResponse;

@Mapper(componentModel = "spring")
public interface GreetingMapperStruct {
	
	Greeting toGreeting(GreetingRequest greetingRequest);

	GreetingResponse toGreetingResponse(Greeting greeting);

	Greeting toGreeting(GreetingQueryRequest greetingQueryRequest);

}
