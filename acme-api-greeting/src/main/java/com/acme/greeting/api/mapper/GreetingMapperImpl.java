package com.acme.greeting.api.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.acme.greeting.api.entity.Greeting;
import com.acme.greeting.api.mapper.struct.GreetingMapperStruct;
import com.acme.greeting.api.model.greeting.query.GreetingQueryRequest;
import com.acme.greeting.api.model.greeting.request.GreetingRequest;
import com.acme.greeting.api.model.greeting.response.GreetingResponse;

@Component
public class GreetingMapperImpl implements GreetingMapper{
	
	@Autowired
	private GreetingMapperStruct greetingMapperStruct;

	@Override
	public Greeting toGreeting(GreetingRequest greetingRequest) {
		return greetingMapperStruct.toGreeting(greetingRequest);
	}

	@Override
	public List<GreetingResponse> toGreetingResponseList(List<Greeting> greetingList) {
		List<GreetingResponse> responseList = new ArrayList<>();
		greetingList.forEach(greeting -> responseList.add(toGreetingResponse(greeting)));
		return responseList;
	}

	@Override
	public GreetingResponse toGreetingResponse(Greeting greeting) {
		return greetingMapperStruct.toGreetingResponse(greeting);
	}

	@Override
	public Greeting toGreeting(GreetingQueryRequest greetingQueryRequest) {
		return greetingMapperStruct.toGreeting(greetingQueryRequest);
	}

}

