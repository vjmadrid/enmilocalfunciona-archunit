package com.acme.architecture.testing.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acme.architecture.testing.example.spring.entity.ExampleMessage;

@Repository
public interface ExampleSpringRepository extends JpaRepository<ExampleMessage, Long>{

}
