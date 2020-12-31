package com.acme.architecture.testing.example.spring.service.impl;

import org.springframework.stereotype.Service;

import com.acme.architecture.testing.example.spring.service.ExampleSpringService;

@Service
public class ExampleSpringServiceImpl implements ExampleSpringService {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "Hello";
	}

}
