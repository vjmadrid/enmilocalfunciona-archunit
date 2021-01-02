package com.acme.architecture.testing.example.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfig {
	
	@Bean(name="message")
	public String getMessageHello() {
		return "Hello Config";
	}

}
