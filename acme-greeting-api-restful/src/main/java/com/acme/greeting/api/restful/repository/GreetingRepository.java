package com.acme.greeting.api.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acme.greeting.api.restful.entity.Greeting;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long>{

}
