package com.acme.greeting.api.service;

import java.util.List;
import java.util.Optional;

import com.acme.greeting.api.model.greeting.request.GreetingRequest;
import com.acme.greeting.api.model.greeting.response.GreetingResponse;

public interface GreetingService {
	
	List<GreetingResponse> findAll();

	Optional<GreetingResponse> findByPK(Long id);
	
	GreetingResponse create(GreetingRequest greetingRequest);

}
