package com.acme.greeting.api.restful.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.greeting.api.restful.entity.Greeting;
import com.acme.greeting.api.restful.factory.GreetingDataFactory;
import com.acme.greeting.api.restful.repository.GreetingRepository;
import com.acme.greeting.api.restful.service.GreetingService;

import lombok.Setter;

@Setter
@Service
public class GreetingServiceImpl implements GreetingService {
	
	public static final Logger LOG = LoggerFactory.getLogger(GreetingServiceImpl.class);
	
	@Autowired
	private GreetingRepository greetingRepository;

	@Override
	public Greeting create(long id, String content) {
    	LOG.info("Create Greeting {} {}",id, content);
    	
    	System.out.println("SERVICE - Greeting -> content : "+content);
		
		Greeting greeting = GreetingDataFactory.create(content);
		
		System.out.println("PRE REPOSITORY :: "+ greeting );
		
		return greetingRepository.save(greeting);
	}

}
