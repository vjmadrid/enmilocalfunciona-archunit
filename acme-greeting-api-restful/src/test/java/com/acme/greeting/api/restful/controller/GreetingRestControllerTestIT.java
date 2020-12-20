package com.acme.greeting.api.restful.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.acme.greeting.api.restful.constant.GreetingRestApiConstant;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingRestControllerTestIT {

	@LocalServerPort
    private int port;

    private URL base;
    
    private String templateMessageTest;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
    	templateMessageTest = String.format(GreetingRestApiConstant.TEMPLATE_MESSAGE, GreetingRestApiConstant.DEFAUL_VALUE_PK);
    	
        base = new URL("http://localhost:" + port + GreetingRestApiConstant.MAPPING);
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(),String.class);
        
        assertThat(response.getBody(), containsString(templateMessageTest));
    }
	
}
