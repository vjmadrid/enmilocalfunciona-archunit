package com.acme.architecture.testing.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.acme.architecture.testing.example.spring.repository.ExampleValidRepository;
import com.acme.architecture.testing.example.spring.service.ExampleValidService;

@RestController
public class ExampleRestController {
	
	@Autowired
	private ExampleValidService exampleValidService;
	
	@Autowired
	private ExampleValidRepository exampleValidRepository;

}
