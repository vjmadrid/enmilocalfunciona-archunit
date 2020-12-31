package com.acme.architecture.testing.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.acme.architecture.testing.example.spring.repository.ExampleSpringRepository;
import com.acme.architecture.testing.example.spring.service.ExampleSpringService;

@RestController
public class ExampleRestController {
	
	@Autowired
	private ExampleSpringService exampleValidService;
	
	@Autowired
	private ExampleSpringRepository exampleSpringRepository;

}
