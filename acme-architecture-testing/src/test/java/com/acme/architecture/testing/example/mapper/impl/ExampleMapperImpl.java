package com.acme.architecture.testing.example.mapper.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.acme.architecture.testing.example.entity.Domain;
import com.acme.architecture.testing.example.mapper.ExampleMapper;
import com.acme.architecture.testing.example.query.ExampleQueryRequest;
import com.acme.architecture.testing.example.request.ExampleRequest;
import com.acme.architecture.testing.example.response.ExampleResponse;

@Component
public class ExampleMapperImpl implements ExampleMapper{

	@Override
	public Domain toDomain(ExampleRequest domainRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExampleResponse> toGreetingResponseList(List<Domain> greetingList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExampleResponse toExampleResponse(Domain domnain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Domain toDomain(ExampleQueryRequest exampleQueryRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
