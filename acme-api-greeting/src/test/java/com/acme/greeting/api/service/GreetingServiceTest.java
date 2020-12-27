package com.acme.greeting.api.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.acme.greeting.api.dummy.DummyGreeting;
import com.acme.greeting.api.dummy.constant.GreetingDummyConstant;
import com.acme.greeting.api.entity.Greeting;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@ActiveProfiles(profiles = { "dev"})
@DirtiesContext(classMode = ClassMode.BEFORE_CLASS)
@AutoConfigureTestDatabase(replace = Replace.ANY)
public class GreetingServiceTest {
	
	public int TEST_NUM_MESSAGES_LIQUIBASE = GreetingDummyConstant.TEST_NUM_GREETINGS;

	@Autowired
	private GreetingService greetingService;

	private Greeting greetingTest;

	@BeforeEach
	public void init() {
		greetingTest = DummyGreeting.createDefault();
		greetingTest.setId(null);
	
	}

	@Test
	public void whenCallFindAll_thenReturnElementList() {
		List<Greeting> result = greetingService.findAll();
		
		assertThat(result.size(), is(equalTo(TEST_NUM_MESSAGES_LIQUIBASE)));
		assertThat(result.get(0).getId(), is(equalTo(GreetingDummyConstant.TEST_GREETING_1_ID)));
	}

	@Test
	public void whenCallFindByPK_thenReturnElementWithId() {
		final Optional<Greeting> result = greetingService.findByPK(GreetingDummyConstant.TEST_GREETING_1_ID);

		Greeting value = result.get();

		assertNotNull(value);
		assertEquals(GreetingDummyConstant.TEST_GREETING_1_ID, value.getId());
	}

	@Test
	public void whenCallInsert_thenReturnElement() {
		List<Greeting> originList = greetingService.findAll();

		int TEST_NUM_MESSAGES_LIQUIBASE_LOCAL = originList.size();
			

		Greeting result = greetingService.create(GreetingDummyConstant.TEST_GREETING_1_CONTENT);
		
		assertNotNull(result);
		assertEquals(Long.valueOf(String.valueOf(TEST_NUM_MESSAGES_LIQUIBASE+1)), result.getId());
		
		List<Greeting> updatedList = greetingService.findAll();

		assertThat(updatedList.size(), is(equalTo(TEST_NUM_MESSAGES_LIQUIBASE_LOCAL+1)));

	}

}
