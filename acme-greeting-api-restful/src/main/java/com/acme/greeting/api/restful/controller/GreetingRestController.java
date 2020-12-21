package com.acme.greeting.api.restful.controller;


import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.acme.greeting.api.restful.constant.GreetingRestApiConstant;
import com.acme.greeting.api.restful.entity.Greeting;
import com.acme.greeting.api.restful.factory.GreetingDataFactory;

@RestController
@RequestMapping(GreetingRestApiConstant.MAPPING)
public class GreetingRestController {
	
	public static final Logger LOG = LoggerFactory.getLogger(GreetingRestController.class);

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
    public Greeting greeting(@RequestParam(value=GreetingRestApiConstant.MAPPING_NAME_PARAMETER, defaultValue=GreetingRestApiConstant.DEFAUL_VALUE_PK) String name) {
    	LOG.info("Greeting ...");
    	LOG.info("[*] Name {}",name);
    	
    	return GreetingDataFactory.create(counter.incrementAndGet(),String.format(GreetingRestApiConstant.TEMPLATE_MESSAGE, name));
    }
}
