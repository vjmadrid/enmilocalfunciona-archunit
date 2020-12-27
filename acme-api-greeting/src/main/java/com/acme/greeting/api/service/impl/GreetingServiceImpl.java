package com.acme.greeting.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.greeting.api.entity.Greeting;
import com.acme.greeting.api.factory.GreetingDataFactory;
import com.acme.greeting.api.repository.GreetingRepository;
import com.acme.greeting.api.service.GreetingService;

import lombok.Setter;

@Setter
@Service
public class GreetingServiceImpl implements GreetingService {
	
	public static final Logger LOG = LoggerFactory.getLogger(GreetingServiceImpl.class);
	
	@Autowired
	private GreetingRepository greetingRepository;

	@Override
	public List<Greeting> findAll() {
		return greetingRepository.findAll();
	}

	@Override
	public Optional<Greeting> findByPK(Long id) {
		Optional<Greeting> greeting = greetingRepository.findById(id);
		
		return (greeting.isPresent()) ? Optional.of(greeting.get()) : Optional.empty();
	}
	
	@Override
	public Greeting create(String content) {
		Greeting greeting = GreetingDataFactory.create(content);
		
		return greetingRepository.save(greeting);
	}

}
