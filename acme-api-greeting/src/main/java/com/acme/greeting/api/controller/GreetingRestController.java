package com.acme.greeting.api.controller;


import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.acme.greeting.api.constant.GreetingRestApiConstant;
import com.acme.greeting.api.entity.Greeting;
import com.acme.greeting.api.service.GreetingService;
import com.acme.greeting.api.util.validator.GreetingValidatorUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.Setter;

@Api(description = "Endpoints for CRUD of Greeting", tags = {"greeting"})
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(GreetingRestApiConstant.MAPPING)
@Setter
public class GreetingRestController {
	
	public static final Logger LOG = LoggerFactory.getLogger(GreetingRestController.class);

    private final AtomicLong counter = new AtomicLong();
    
    @Autowired
	private GreetingService greetingService;
    
    
    
    @ApiOperation(value = "Find All Greetings", notes = "Returns a list", tags = { "greeting" })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Successful operation", response=List.class )  }
    )	    
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Greeting>> findAll() {
		LOG.info("Find All Greetings");
		System.out.println("CONTROLLER - Gretting -> counter.incrementAndGet() : "+counter.incrementAndGet());
		
		final List<Greeting> userMessageList = greetingService.findAll();
			
		if (userMessageList == null || userMessageList.isEmpty()) {
			return new ResponseEntity<List<Greeting>>(HttpStatus.NOT_FOUND);
			// Option 1 : return new ResponseEntity<List<UserMessage>>(HttpStatus.NOT_FOUND);
			// Option 2 : return HttpStatus.NO_CONTENT -> return new ResponseEntity<List<UserMessage>>(HttpStatus.NO_CONTENT)
			// Option 3 : return ResponseEntity.notFound().build();
		}

		return new ResponseEntity<List<Greeting>>(userMessageList, HttpStatus.OK);
	}
    
    @ApiOperation(value = "Find Greeting by ID", notes = "Returns a single Greeting", tags = { "greeting" })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response=Greeting.class),
        @ApiResponse(code = 404, message = "Greeting not found") })
	@RequestMapping(value = GreetingRestApiConstant.MAPPING_PK, method = RequestMethod.GET)
	public ResponseEntity<?> findById(
			@ApiParam("Id of the UserMessage to be obtained. Cannot be empty.")
			@PathVariable("id") Long id, HttpServletRequest request) {
		LOG.info("Fetching Greeting with id {}", id);
		System.out.println("CONTROLLER - Gretting -> counter.incrementAndGet() : "+counter.incrementAndGet());
		
		final Optional<Greeting> userMessageFound = greetingService.findByPK(id);
		
		if (userMessageFound == null || !userMessageFound.isPresent())
			return ResponseEntity.notFound().build();
		
		Greeting value = userMessageFound.get();
		
		if (!GreetingValidatorUtil.isValid(value)) { 
			return new ResponseEntity<Object>(value , HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Greeting>(value, HttpStatus.OK);
	}
    
    
    @RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@Valid @RequestBody String content, UriComponentsBuilder ucBuilder,
			HttpServletRequest request) {
		LOG.info("Creating Greeting : {}", content);
		
		Greeting greetingCreated = greetingService.create(content);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path(GreetingRestApiConstant.MAPPING+GreetingRestApiConstant.MAPPING_PK).buildAndExpand(greetingCreated.getId()).toUri());
		
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}
    
    

    @RequestMapping(value = "/param", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
    public Greeting createByParam(@RequestParam(value=GreetingRestApiConstant.MAPPING_NAME_PARAMETER, defaultValue=GreetingRestApiConstant.DEFAUL_VALUE_PK) String content) {
    	LOG.info("Greeting ...");
    	LOG.info("[*] Name {}",content);
    	
    	
    	System.out.println("CONTROLLER - Gretting -> name : "+content);
    	
    	return greetingService.create(content);
    }
}
