package com.acme.architecture.testing.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleSpringRepository extends JpaRepository<Object, Long>{

}
