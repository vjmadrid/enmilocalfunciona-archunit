package com.acme.architecture.testing.example.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ExampleValidSpringEntity")
public class ExampleSpringEntity implements Serializable {

	private static final long serialVersionUID = 1872753366307155250L;

}
