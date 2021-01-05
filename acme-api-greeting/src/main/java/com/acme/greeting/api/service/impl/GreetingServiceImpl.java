package com.acme.greeting.api.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.acme.greeting.api.constant.GreetingRestApiConstant;
import com.acme.greeting.api.entity.Greeting;
import com.acme.greeting.api.mapper.GreetingMapper;
import com.acme.greeting.api.model.greeting.request.GreetingRequest;
import com.acme.greeting.api.model.greeting.response.GreetingResponse;
import com.acme.greeting.api.repository.GreetingRepository;
import com.acme.greeting.api.service.GreetingService;

import lombok.Setter;

@Service
@Setter
public class GreetingServiceImpl implements GreetingService {
	
	public static final Logger LOG = LoggerFactory.getLogger(GreetingServiceImpl.class);
	
	@Autowired
	private GreetingRepository greetingRepository;
	
	@Autowired
	private GreetingMapper greetingMapper;

	@Override
	public List<GreetingResponse> findAll() {
		List<Greeting> greetingList = greetingRepository.findAll();
		
		return (CollectionUtils.isEmpty(greetingList)) ?Collections.emptyList():greetingMapper.toGreetingResponseList(greetingList);
	}

	@Override
	public Optional<GreetingResponse> findByPK(Long id) {
		Optional<Greeting> greeting = greetingRepository.findById(id);
		
		return (greeting.isPresent()) ? Optional.of(greetingMapper.toGreetingResponse(greeting.get())) : Optional.empty();
	}
	
	@Override
	public GreetingResponse create(GreetingRequest greetingRequest) {
		
		Greeting greeting = greetingMapper.toGreeting(greetingRequest);
		
		greeting.setContent(String.format(GreetingRestApiConstant.TEMPLATE_MESSAGE, greeting.getContent()));
		greeting.setCreatedAt(new Date());
		
		greeting = greetingRepository.save(greeting);
		
		return greetingMapper.toGreetingResponse(greeting);
	}
	
}
