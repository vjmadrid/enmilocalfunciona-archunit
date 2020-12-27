package com.acme.greeting.api.service;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.acme.greeting.api.dummy.DummyGreeting;
import com.acme.greeting.api.entity.Greeting;
import com.acme.greeting.api.repository.GreetingRepository;
import com.acme.greeting.api.service.impl.GreetingServiceImpl;

public class GreetingServiceWithMockTest {
	
	private GreetingServiceImpl greetingService;
	
	private GreetingRepository greetingRepository;
	
	private Greeting greetingTest;

	@BeforeEach
	public void setup() {
		greetingTest = DummyGreeting.createDefault();
				
		greetingService = new GreetingServiceImpl();
		greetingRepository = mock(GreetingRepository.class);
		
		when(greetingRepository.findAll()).thenReturn(DummyGreeting.createList());
		when(greetingRepository.findById(anyLong())).thenReturn(Optional.of(greetingTest));
		
		greetingService.setGreetingRepository(greetingRepository);
	}
	
	@Test
	public void whenCallFindAll_thenInvokeTheDaoMethod() {
		greetingService.findAll();
		verify(greetingRepository).findAll();
	}
	
	@Test
	public void whenCallFindByPK_thenInvokeTheDaoMethod() {
		greetingService.findByPK(greetingTest.getId());
		verify(greetingRepository).findById(greetingTest.getId());
	}
	
	@Test
	public void whenCallCreate_thenInvokeTheDaoMethod() {
		greetingService.create(greetingTest.getContent());
		verify(greetingRepository).save(any());
	}

}
