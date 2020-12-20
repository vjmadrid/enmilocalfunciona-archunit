package com.acme.greeting.api.restful.config.swagger;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public static final Contact DEFAULT_CONTACT = new Contact("Victor Madrid", "http://www.acme.corp.com",
			"global@acme.corp.com");

	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Acme Message API Title",
			"Acme Message API Description", "1.0", "urn:tos", DEFAULT_CONTACT, "Apache 2.0",
			"http://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());

	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(
			Arrays.asList("application/json", "application/xml"));

	@Bean
	public Docket swagger() {
		return new Docket(DocumentationType.SWAGGER_2)  
					.select()
					.apis(RequestHandlerSelectors.any())
					.paths(PathSelectors.any())
					.build().apiInfo(DEFAULT_API_INFO).consumes(DEFAULT_PRODUCES_AND_CONSUMES);
	}

}
