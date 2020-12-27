package com.acme.greeting.api.repository;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.acme.greeting.api.dummy.DummyGreeting;
import com.acme.greeting.api.dummy.constant.GreetingDummyConstant;
import com.acme.greeting.api.entity.Greeting;
import com.acme.greeting.api.factory.GreetingDataFactory;
import com.acme.greeting.api.repository.GreetingRepository;


@ExtendWith(SpringExtension.class)
@DataJpaTest(showSql=false)
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class GreetingRepositoryTest {
	
	public int TEST_NUM_GREETINGS = GreetingDummyConstant.TEST_NUM_GREETINGS;
	
	@Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private GreetingRepository greetingRepository;
    
    private Greeting greetingTest;
    
    @BeforeEach
    public void setUp(){
    	greetingTest = DummyGreeting.createDefault();
    	greetingTest.setId(null);
    	
        testEntityManager.persist(greetingTest);

        TEST_NUM_GREETINGS++;
    }

    @Test
    public void whenCallFindAll_thenReturnElementList() {
        final List<Greeting> result = greetingRepository.findAll();
        
        assertNotNull(result);	
        assertThat(result.size(), is(equalTo(TEST_NUM_GREETINGS)));
    }
    
    @Test
    public void whenCallFindById_thenReturnOptionalElementWithId() {
        final Greeting result = greetingRepository.findById(1L).get();

        assertNotNull(result);
        assertThat(result.getContent(), is(equalTo(GreetingDummyConstant.TEST_GREETING_1_CONTENT)));
    }
    
    @Test
	public void whenCallDelete_thenDeleteElementPreviouslySearched() {
		final Greeting greetingFounded = greetingRepository.findById(GreetingDummyConstant.TEST_GREETING_1_ID).get();

		greetingRepository.delete(greetingFounded);
		
		final Greeting deleted = greetingRepository.findById(GreetingDummyConstant.TEST_GREETING_1_ID).orElse(null);
		assertNull(deleted);
	}
    
    @Test
	public void whenCallSave_thenSaveElement() {
    	TEST_NUM_GREETINGS++;
		final Long NEW_ID_EXPECTED = Long.valueOf((TEST_NUM_GREETINGS));
		
		Greeting addGreetingTest = GreetingDataFactory.create(GreetingDummyConstant.TEST_GREETING_2_CONTENT);

		Greeting addGreetingPersistedTest= greetingRepository.save(addGreetingTest);
		
		assertEquals(NEW_ID_EXPECTED, addGreetingPersistedTest.getId());	
		
		final Greeting addGreetingFounded = greetingRepository.findById(NEW_ID_EXPECTED).get();
		
		assertNotNull(addGreetingFounded);
		assertEquals(GreetingDummyConstant.TEST_GREETING_2_CONTENT, addGreetingFounded.getContent());
	}
    
    @Test
	public void whenCallUpdate_thenUpdateElement() {
		final Greeting origin = greetingRepository.findById(GreetingDummyConstant.TEST_GREETING_1_ID).get();
		
		origin.setContent("CHANGED");
		
		greetingRepository.save(origin);
		
		final Greeting result = greetingRepository.findById(GreetingDummyConstant.TEST_GREETING_1_ID).get();

		assertNotNull(result);
		assertEquals("CHANGED", origin.getContent());
	}

}
