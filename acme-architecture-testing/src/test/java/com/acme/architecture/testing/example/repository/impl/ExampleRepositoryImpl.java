package com.acme.architecture.testing.example.repository.impl;

import com.acme.architecture.testing.example.repository.ExampleRepository;

public class ExampleRepositoryImpl implements ExampleRepository  {

	@Override
	public String sayHello() {
		return "Hello";
	}

}
