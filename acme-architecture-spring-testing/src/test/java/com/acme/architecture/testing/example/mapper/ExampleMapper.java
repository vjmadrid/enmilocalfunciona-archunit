package com.acme.architecture.testing.example.mapper;

import java.util.List;

import com.acme.architecture.testing.example.entity.Domain;
import com.acme.architecture.testing.example.query.ExampleQueryRequest;
import com.acme.architecture.testing.example.request.ExampleRequest;
import com.acme.architecture.testing.example.response.ExampleResponse;

public interface ExampleMapper {
	
	Domain toDomain(ExampleRequest domainRequest);

	List<ExampleResponse> toExampleResponseList(List<Domain> exampleList);

	ExampleResponse toExampleResponse(Domain domain);

	Domain toDomain(ExampleQueryRequest exampleQueryRequest);

}
