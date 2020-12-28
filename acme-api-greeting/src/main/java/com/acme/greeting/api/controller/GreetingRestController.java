package com.acme.greeting.api.controller;


import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.acme.greeting.api.model.greeting.request.GreetingRequest;
import com.acme.greeting.api.model.greeting.response.GreetingResponse;
import com.acme.greeting.api.model.greeting.util.validator.GreetingResponseValidatorUtil;
import com.acme.greeting.api.service.GreetingService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.Setter;

@Api(value = "Endpoints for CRUD of Greeting", tags = {"greeting"})
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
	public ResponseEntity<List<GreetingResponse>> findAll() {
    	LOG.info("Find All Greetings -> counter {}",counter.incrementAndGet());
  
		List<GreetingResponse> responseList = greetingService.findAll();

		if (responseList.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(responseList);
	}
    
    @ApiOperation(value = "Find Greeting by ID", notes = "Returns a single Greeting", tags = { "greeting" })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response=GreetingResponse.class),
        @ApiResponse(code = 404, message = "Greeting not found") })
	@RequestMapping(value = GreetingRestApiConstant.MAPPING_PK, method = RequestMethod.GET)
	public ResponseEntity<GreetingResponse> findById(
			@ApiParam("Id of the Greeting to be obtained. Cannot be empty.")
			@PathVariable("id") Long id, HttpServletRequest request) {
		LOG.info("Fetching Greeting with -> id {} counter {}", id, counter.incrementAndGet());

		final Optional<GreetingResponse> responseFound = greetingService.findByPK(id);
		
		if (!responseFound.isPresent())
			return ResponseEntity.notFound().build();
		
		GreetingResponse value = responseFound.get();
		
		if (!GreetingResponseValidatorUtil.isValid(value)) { 
			return new ResponseEntity<GreetingResponse>(value , HttpStatus.NOT_FOUND);
		}

		return ResponseEntity.ok(value);
	}
    
    
    @RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<GreetingResponse> create(@Valid @RequestBody GreetingRequest greetingRequest, UriComponentsBuilder ucBuilder,
			HttpServletRequest request) {
		LOG.info("Creating Greeting : {}", greetingRequest);
		
		GreetingResponse greetingResponseCreated = greetingService.create(greetingRequest);
		
		//HttpHeaders headers = new HttpHeaders();
		//headers.setLocation(ucBuilder.path(GreetingRestApiConstant.MAPPING+GreetingRestApiConstant.MAPPING_PK).buildAndExpand(greetingCreated.getId()).toUri());
		
		return new ResponseEntity<GreetingResponse>(greetingResponseCreated, HttpStatus.CREATED);
	}
    
    

    @RequestMapping(value = "/param", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
    public ResponseEntity<GreetingResponse> createByParam(@RequestParam(value=GreetingRestApiConstant.MAPPING_NAME_PARAMETER, defaultValue=GreetingRestApiConstant.DEFAUL_VALUE_PK)  String content) {
    	LOG.info("Creating Greeting with name {}", content);
    	
    	GreetingRequest request = new GreetingRequest();
    	request.setContent(content);
    	
    	GreetingResponse greetingResponseCreated = greetingService.create(request);

    	return new ResponseEntity<GreetingResponse>(greetingResponseCreated, HttpStatus.CREATED);
    }
}
