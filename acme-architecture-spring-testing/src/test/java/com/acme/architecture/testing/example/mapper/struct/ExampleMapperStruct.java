package com.acme.architecture.testing.example.mapper.struct;

import org.mapstruct.Mapper;

import com.acme.architecture.testing.example.entity.Domain;
import com.acme.architecture.testing.example.query.ExampleQueryRequest;
import com.acme.architecture.testing.example.request.ExampleRequest;
import com.acme.architecture.testing.example.response.ExampleResponse;

@Mapper(componentModel = "spring")
public interface ExampleMapperStruct {
	
	Domain toDomain(ExampleRequest exampleRequest);

	ExampleResponse toExampleResponse(Domain domain);

	Domain toDomain(ExampleQueryRequest exampleQueryRequest);

}
