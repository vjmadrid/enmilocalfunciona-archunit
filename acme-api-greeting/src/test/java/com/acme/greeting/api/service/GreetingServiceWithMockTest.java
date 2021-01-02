package com.acme.greeting.api.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import com.acme.greeting.api.dummy.DummyGreeting;
import com.acme.greeting.api.dummy.constant.GreetingDummyConstant;
import com.acme.greeting.api.entity.Greeting;
import com.acme.greeting.api.mapper.GreetingMapper;
import com.acme.greeting.api.mapper.impl.GreetingMapperImpl;
import com.acme.greeting.api.model.greeting.dummy.DummyGreetingRequest;
import com.acme.greeting.api.model.greeting.dummy.DummyGreetingResponse;
import com.acme.greeting.api.model.greeting.request.GreetingRequest;
import com.acme.greeting.api.model.greeting.response.GreetingResponse;
import com.acme.greeting.api.repository.GreetingRepository;
import com.acme.greeting.api.service.impl.GreetingServiceImpl;

public class GreetingServiceWithMockTest {
	
	private GreetingServiceImpl greetingService;
	
	private GreetingRepository greetingRepository;
	
	private GreetingMapper greetingMapper;
	
	private Greeting greetingTest;
	
	private List<Greeting> greetingTestList;
	
	private GreetingRequest greetingRequest;
	
	private GreetingResponse greetingResponse;
	
	private List<GreetingResponse> greetingResponseList;
	
	private ArgumentCaptor<Greeting> greetingCaptor = ArgumentCaptor.forClass(Greeting.class);

	
	@BeforeEach
	public void setup() {
		// Initialize test data set
		greetingTest = DummyGreeting.createDefault();
		greetingTestList = DummyGreeting.createDefaultList();
		
		greetingRequest = DummyGreetingRequest.createDefault();
		greetingResponse = DummyGreetingResponse.createDefault();
		
		greetingResponseList = DummyGreetingResponse.createDefaultList();
		
		// Initialize Service
		greetingRepository = mock(GreetingRepository.class);
		greetingMapper = mock(GreetingMapperImpl.class);
				
		greetingService = new GreetingServiceImpl();
		greetingService.setGreetingRepository(greetingRepository);
		greetingService.setGreetingMapper(greetingMapper);
		
		// Stubbing Repository mock
		when(greetingRepository.findAll()).thenReturn(greetingTestList);
		when(greetingRepository.findById(anyLong())).thenReturn(Optional.of(greetingTest));
		when(greetingRepository.save(greetingTest)).thenReturn(greetingTest);
		
		// Stubbing Mapper mock
		when(greetingMapper.toGreetingResponseList(greetingTestList)).thenReturn(greetingResponseList);
		when(greetingMapper.toGreetingResponse(greetingTest)).thenReturn(greetingResponse);
		when(greetingMapper.toGreeting(greetingRequest)).thenReturn(greetingTest);
		when(greetingMapper.toGreetingResponse(greetingTest)).thenReturn(greetingResponse);
	}
	
	@Test
	public void whenCallFindAllWithNull_thenInvokeTheDaoMethod() {
		when(greetingRepository.findAll()).thenReturn(null);
		List<GreetingResponse> responseList = greetingService.findAll();

		verify(greetingRepository).findAll();
		assertThat(responseList.size(), is(0));
	}
	
	@Test
	public void whenCallFindAllWithEmpty_thenInvokeTheDaoMethod() {
		when(greetingRepository.findAll()).thenReturn(Collections.emptyList());
		List<GreetingResponse> responseList = greetingService.findAll();

		verify(greetingRepository).findAll();
		assertThat(responseList.size(), is(0));
	}
	
	@Test
	public void whenCallFindAll_thenInvokeTheDaoMethod() {
		List<GreetingResponse> responseList = greetingService.findAll();

		verify(greetingRepository).findAll();
		assertThat(responseList.size(), is(1));
	}
	
	@Test
	public void whenCallFindByPKWithNull_thenInvokeTheDaoMethod() {
		when(greetingRepository.findById(anyLong())).thenReturn(Optional.empty());
		
		Optional<GreetingResponse> response = greetingService.findByPK(GreetingDummyConstant.TEST_GREETING_1_ID);
		
		assertFalse(response.isPresent());
		verify(greetingRepository).findById(GreetingDummyConstant.TEST_GREETING_1_ID);
	}
	
	@Test
	public void whenCallFindByPK_thenInvokeTheDaoMethod() {
		Optional<GreetingResponse> response =  greetingService.findByPK(GreetingDummyConstant.TEST_GREETING_1_ID);
		
		assertTrue(response.isPresent());
		verify(greetingRepository).findById(GreetingDummyConstant.TEST_GREETING_1_ID);
	}
	
	@Test
	public void whenCallCreate_thenInvokeTheDaoMethod() {
		greetingService.create(greetingRequest);
		
		verify(greetingRepository).save(greetingCaptor.capture());
		Greeting greetingCaptorResult = greetingCaptor.getValue();
		assertEquals(GreetingDummyConstant.TEST_GREETING_1_ID, greetingCaptorResult.getId());
	}
	

}
