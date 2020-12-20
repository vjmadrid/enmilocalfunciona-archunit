package com.acme.architecture.testing.example.spring.service.impl;

import org.springframework.stereotype.Service;

import com.acme.architecture.testing.example.spring.service.ExampleValidService;

@Service
public class ExampleValidServiceImpl implements ExampleValidService {

	public String findByPK(Long id) {
		return "";
	}

}
