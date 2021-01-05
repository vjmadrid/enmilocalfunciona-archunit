package com.acme.architecture.testing.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.acme.architecture.testing.example.spring.service.ExampleSpringService;

@RestController
public class ExampleRestController {
	
	@Autowired
	private ExampleSpringService exampleValidService;
	
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
    public String greeting() {
    	return exampleValidService.sayHello();
    }

}
