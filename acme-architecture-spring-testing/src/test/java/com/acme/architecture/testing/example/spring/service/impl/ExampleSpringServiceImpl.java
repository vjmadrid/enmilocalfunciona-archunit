package com.acme.architecture.testing.example.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.architecture.testing.example.mapper.ExampleMapper;
import com.acme.architecture.testing.example.spring.repository.ExampleSpringRepository;
import com.acme.architecture.testing.example.spring.service.ExampleSpringService;

import lombok.Setter;

@Service
@Setter
public class ExampleSpringServiceImpl implements ExampleSpringService {
	
	@Autowired
	private ExampleSpringRepository exampleSpringRepository;
	
	@Autowired
	private ExampleMapper exampleMapper;

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello";
	}

}
