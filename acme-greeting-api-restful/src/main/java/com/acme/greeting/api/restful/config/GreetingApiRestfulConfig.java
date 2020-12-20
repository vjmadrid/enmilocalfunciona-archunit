package com.acme.greeting.api.restful.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.acme.greeting.api.restful.constant.GreetingApiRestfulConfigConstant;

@Configuration
@ComponentScan(basePackages = { GreetingApiRestfulConfigConstant.GENERIC_PACKAGE })
public class GreetingApiRestfulConfig {

}
