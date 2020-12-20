package com.acme.greeting.api.restful.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.acme.greeting.api.restful.constant.GreetingRestApiConstant;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetingRestControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void noParamGreetingShouldReturnDefaultMessage() throws Exception {
		mockMvc.perform(get(GreetingRestApiConstant.MAPPING)).andDo(print()).andExpect(status().isOk())
				.andExpect(jsonPath("$.content").value("Hello, "+GreetingRestApiConstant.DEFAUL_VALUE_PK+"!"));
	}

	@Test
	public void paramGreetingShouldReturnTailoredMessage() throws Exception {
		mockMvc.perform(get(GreetingRestApiConstant.MAPPING).param("name", "Acme")).andDo(print())
				.andExpect(status().isOk()).andExpect(jsonPath("$.content").value("Hello, Acme!"));
	}
}
