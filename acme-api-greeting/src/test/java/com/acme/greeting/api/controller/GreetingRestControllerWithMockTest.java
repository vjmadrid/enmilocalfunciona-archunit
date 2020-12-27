package com.acme.greeting.api.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponentsBuilder;

import com.acme.greeting.api.constant.GreetingRestApiConstant;
import com.acme.greeting.api.dummy.DummyGreeting;
import com.acme.greeting.api.dummy.constant.GreetingDummyConstant;
import com.acme.greeting.api.entity.Greeting;
import com.acme.greeting.api.service.GreetingService;

public class GreetingRestControllerWithMockTest {

	private GreetingRestController greetingRestController;

	private GreetingService greetingService;
	
	private List<Greeting> greetingListTest;
	
	private Greeting greetingTest;
	
	private HttpServletRequest request;
	
	private UriComponentsBuilder uriComponentsBuilder;
	
	@BeforeEach
	public final void setUp() throws Exception {
		greetingTest = DummyGreeting.createDefault();
		greetingListTest = DummyGreeting.createList();

		greetingRestController = spy(new GreetingRestController());
		greetingService = mock(GreetingService.class);
		
		request = mock(HttpServletRequest.class);
		uriComponentsBuilder = UriComponentsBuilder.newInstance();
		
		when(greetingService.findByPK(anyLong())).thenReturn(Optional.of(greetingTest));
		when(greetingService.findAll()).thenReturn(greetingListTest);
		when(greetingService.create(anyString())).thenReturn(greetingTest);
		
		greetingRestController.setGreetingService(greetingService);
	}
	
	@Test
	public final void whenCallFindAllWithServiceNull_thenReturnHttpNotFoundAndEmptyBody() {
		when(greetingService.findAll()).thenReturn(null);
		
		final ResponseEntity<List<Greeting>> responseEntity = greetingRestController.findAll();
		
		assertEquals(HttpStatus.NOT_FOUND,responseEntity.getStatusCode());
		assertNull(responseEntity.getBody());
	}
	
	@Test
	public final void whenCallFindAllWithServiceEmpty_thenReturnHttpNotFoundAndEmptyBody() {
		when(greetingService.findAll()).thenReturn(Collections.emptyList());
		
		final ResponseEntity<List<Greeting>> responseEntity = greetingRestController.findAll();
		
		assertEquals(HttpStatus.NOT_FOUND,responseEntity.getStatusCode());
		assertNull(responseEntity.getBody());
	}
	
	@Test
	public final void whenCallFindAllAndServiceValid_thenReturnHttpOkAndBody() {
		final ResponseEntity<List<Greeting>> responseEntity = greetingRestController.findAll();
		
		assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
		assertNotNull(responseEntity.getBody());
		
		String bodyString = responseEntity.getBody().toString();
		
		assertThat(bodyString, containsString(GreetingDummyConstant.TEST_GREETING_1_CONTENT));
		assertThat(bodyString, containsString(GreetingDummyConstant.TEST_GREETING_2_CONTENT));
		assertThat(bodyString, containsString(GreetingDummyConstant.TEST_GREETING_3_CONTENT));
	}
	
	@Test
	public final void whenCallFindByIdWithServiceNull_thenReturnHttpNotFoundAndEmptyBody() {
		when(greetingService.findByPK(anyLong())).thenReturn(Optional.ofNullable(null));
		
		final ResponseEntity<Greeting> responseEntity = (ResponseEntity<Greeting>) greetingRestController.findById(GreetingDummyConstant.TEST_GREETING_1_ID, request);
		
		assertEquals(HttpStatus.NOT_FOUND,responseEntity.getStatusCode());
		assertNull(responseEntity.getBody());
	}
	
	@Test
	public final void whenCallFindByIdWithServiceInvalid_thenReturnHttpNotFoundAndBodyWithMessage() {
		greetingTest.setId(null);
		when(greetingService.findByPK(anyLong())).thenReturn(Optional.of(greetingTest));
		
		final ResponseEntity<Greeting> responseEntity = (ResponseEntity<Greeting>) greetingRestController.findById(GreetingDummyConstant.TEST_GREETING_1_ID,request);
		
		assertEquals(HttpStatus.NOT_FOUND,responseEntity.getStatusCode());
		assertNotNull(responseEntity.getBody());
	}
	
	@Test
	public final void whenCallFindByIdWithServiceValid_thenReturnHttpOkAndElementBody() {	
		final ResponseEntity<Greeting> responseEntity = (ResponseEntity<Greeting>) greetingRestController.findById(GreetingDummyConstant.TEST_GREETING_1_ID,request);
		
		assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
		assertEquals(greetingTest,responseEntity.getBody());
	}
	
	@Test
	public final void whenCallCreateWithServiceValid_thenReturnHttpCreatedAndHeaders() {
		final ResponseEntity<Greeting> responseEntity = (ResponseEntity<Greeting>) greetingRestController.create("test",uriComponentsBuilder,request);
		
		assertEquals(HttpStatus.CREATED,responseEntity.getStatusCode());
		assertNotNull(responseEntity.getHeaders());
	}
	
}
