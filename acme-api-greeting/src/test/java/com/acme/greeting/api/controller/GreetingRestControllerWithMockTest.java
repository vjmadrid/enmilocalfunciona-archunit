package com.acme.greeting.api.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import com.acme.greeting.api.dummy.DummyGreeting;
import com.acme.greeting.api.dummy.constant.GreetingDummyConstant;
import com.acme.greeting.api.entity.Greeting;
import com.acme.greeting.api.model.greeting.dummy.DummyGreetingRequest;
import com.acme.greeting.api.model.greeting.dummy.DummyGreetingResponse;
import com.acme.greeting.api.model.greeting.request.GreetingRequest;
import com.acme.greeting.api.model.greeting.response.GreetingResponse;
import com.acme.greeting.api.service.GreetingService;

public class GreetingRestControllerWithMockTest {

	private GreetingRestController greetingRestController;

	private GreetingService greetingService;
	
	private List<Greeting> greetingListTest;
	
	private Greeting greetingTest;
	
	private GreetingRequest greetingRequestTest;
	
	private GreetingResponse greetingResponseTest;
	
	private List<GreetingResponse> greetingResponseTestList;
	
	private HttpServletRequest request;
	
	private UriComponentsBuilder uriComponentsBuilder;
	
	@BeforeEach
	public final void setUp() throws Exception {
		// Initialize test data set
		greetingTest = DummyGreeting.createDefault();
		greetingListTest = DummyGreeting.createList();
		
		greetingRequestTest = DummyGreetingRequest.createDefault();
		greetingResponseTest = DummyGreetingResponse.createDefault();
		
		greetingResponseTestList = DummyGreetingResponse.createDefaultList();
		
		// Initialize Controller
		greetingService = mock(GreetingService.class);
		greetingRestController = spy(new GreetingRestController());
		greetingRestController.setGreetingService(greetingService);
		
		// Stubbing Service mock
		when(greetingService.findByPK(anyLong())).thenReturn(Optional.of(greetingResponseTest));
		when(greetingService.findAll()).thenReturn(greetingResponseTestList);
		when(greetingService.create(any())).thenReturn(greetingResponseTest);
		
		// Initialize Others
		request = mock(HttpServletRequest.class);
		uriComponentsBuilder = UriComponentsBuilder.newInstance();
	}
	
	@Test
	public final void whenCallFindAllWithServiceNull_thenReturnHttpNotFoundAndEmptyBody() {
		when(greetingService.findAll()).thenReturn(Collections.emptyList());
		
		final ResponseEntity<List<GreetingResponse>> responseEntity = greetingRestController.findAll();
		
		assertEquals(HttpStatus.NOT_FOUND,responseEntity.getStatusCode());
		assertNull(responseEntity.getBody());
	}
	
	@Test
	public final void whenCallFindAllWithServiceEmpty_thenReturnHttpNotFoundAndEmptyBody() {
		when(greetingService.findAll()).thenReturn(Collections.emptyList());
		
		final ResponseEntity<List<GreetingResponse>> responseEntity = greetingRestController.findAll();
		
		assertEquals(HttpStatus.NOT_FOUND,responseEntity.getStatusCode());
		assertNull(responseEntity.getBody());
	}
	
	@Test
	public final void whenCallFindAllAndServiceValid_thenReturnHttpOkAndBody() {
		final ResponseEntity<List<GreetingResponse>> responseEntity = greetingRestController.findAll();
		
		assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
		assertNotNull(responseEntity.getBody());
		
		String bodyString = responseEntity.getBody().toString();
		
		assertThat(bodyString, containsString(GreetingDummyConstant.TEST_GREETING_1_CONTENT));
	}
	
	@Test
	public final void whenCallFindByIdWithServiceNull_thenReturnHttpNotFoundAndEmptyBody() {
		when(greetingService.findByPK(anyLong())).thenReturn(Optional.ofNullable(null));
		
		final ResponseEntity<GreetingResponse> responseEntity = (ResponseEntity<GreetingResponse>) greetingRestController.findById(GreetingDummyConstant.TEST_GREETING_1_ID, request);
		
		assertEquals(HttpStatus.NOT_FOUND,responseEntity.getStatusCode());
		assertNull(responseEntity.getBody());
	}
	
	@Test
	public final void whenCallFindByIdWithServiceInvalid_thenReturnHttpNotFoundAndBodyWithMessage() {
		greetingResponseTest.setId(null);
		when(greetingService.findByPK(anyLong())).thenReturn(Optional.of(greetingResponseTest));
		
		final ResponseEntity<GreetingResponse> responseEntity = (ResponseEntity<GreetingResponse>) greetingRestController.findById(GreetingDummyConstant.TEST_GREETING_1_ID,request);
		
		assertEquals(HttpStatus.NOT_FOUND,responseEntity.getStatusCode());
		assertNotNull(responseEntity.getBody());
	}
	
	@Test
	public final void whenCallFindByIdWithServiceValid_thenReturnHttpOkAndElementBody() {	
		final ResponseEntity<GreetingResponse> responseEntity = (ResponseEntity<GreetingResponse>) greetingRestController.findById(GreetingDummyConstant.TEST_GREETING_1_ID,request);
		
		assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
		assertEquals(greetingResponseTest,responseEntity.getBody());
	}
	
	@Test
	public final void whenCallCreateWithServiceValid_thenReturnHttpCreatedAndHeaders() {
		final ResponseEntity<GreetingResponse> responseEntity = (ResponseEntity<GreetingResponse>) greetingRestController.create(greetingRequestTest,uriComponentsBuilder,request);
		
		assertEquals(HttpStatus.CREATED,responseEntity.getStatusCode());
		assertNotNull(responseEntity.getHeaders());
	}
	
}
