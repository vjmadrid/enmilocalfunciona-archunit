package com.acme.architecture.testing.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.acme.architecture.testing.example.repository.ExampleValidRepository;
import com.acme.architecture.testing.example.service.ExampleValidService;

@RestController
public class ExampleValidRestController {
	
	@Autowired
	private ExampleValidService exampleValidService;
	
	@Autowired
	private ExampleValidRepository exampleValidRepository;

}
