package com.acme.architecture.testing.example.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.acme.architecture.testing.example.entity.Domain;
import com.acme.architecture.testing.example.mapper.ExampleMapper;
import com.acme.architecture.testing.example.mapper.struct.ExampleMapperStruct;
import com.acme.architecture.testing.example.query.ExampleQueryRequest;
import com.acme.architecture.testing.example.request.ExampleRequest;
import com.acme.architecture.testing.example.response.ExampleResponse;

@Component
public class ExampleMapperImpl implements ExampleMapper{
	
	private ExampleMapperStruct exampleMapperStruct;

	@Override
	public Domain toDomain(ExampleRequest domainRequest) {
		return exampleMapperStruct.toDomain(domainRequest);
	}

	@Override
	public List<ExampleResponse> toExampleResponseList(List<Domain> exampleList) {
		List<ExampleResponse> responseList = new ArrayList<>();
		exampleList.forEach(example -> responseList.add(toExampleResponse(example)));
		return responseList;
	}

	@Override
	public ExampleResponse toExampleResponse(Domain domain) {
		return exampleMapperStruct.toExampleResponse(domain);
	}

	@Override
	public Domain toDomain(ExampleQueryRequest exampleQueryRequest) {
		return exampleMapperStruct.toDomain(exampleQueryRequest);
	}

}
