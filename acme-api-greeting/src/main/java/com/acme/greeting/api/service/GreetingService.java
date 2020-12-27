package com.acme.greeting.api.service;

import java.util.List;
import java.util.Optional;

import com.acme.greeting.api.entity.Greeting;

public interface GreetingService {
	
	List<Greeting> findAll();

	Optional<Greeting> findByPK(Long id);
	
	Greeting create(String content);

}
