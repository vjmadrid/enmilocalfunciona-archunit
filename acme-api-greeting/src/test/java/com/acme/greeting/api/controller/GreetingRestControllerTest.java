package com.acme.greeting.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.acme.greeting.api.constant.GreetingRestApiConstant;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(classMode = ClassMode.BEFORE_CLASS)
@AutoConfigureTestDatabase(replace = Replace.ANY)
public class GreetingRestControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void noParamGreetingShouldReturnDefaultMessage() throws Exception {
		mockMvc.perform(get(GreetingRestApiConstant.MAPPING+"/param")).andExpect(status().isOk())
				.andExpect(jsonPath("$.content").value("Hello, "+GreetingRestApiConstant.DEFAUL_VALUE_PK+"!"));
	}

	@Test
	public void paramGreetingShouldReturnTailoredMessage() throws Exception {
		mockMvc.perform(get(GreetingRestApiConstant.MAPPING+"/param").param("name", "Acme"))
				.andExpect(status().isOk()).andExpect(jsonPath("$.content").value("Hello, Acme!"));
	}
}
