package com.acme.architecture.testing.example.service.impl;

import com.acme.architecture.testing.example.repository.ExampleRepository;
import com.acme.architecture.testing.example.service.ExampleService;

public class ExampleServiceImpl implements ExampleService{
	
	private ExampleRepository exampleRepository;

	@Override
	public String sayHello() {
		return exampleRepository.sayHello();
	}

	public void setExampleRepository(ExampleRepository exampleRepository) {
		this.exampleRepository = exampleRepository;
	}
	
}
