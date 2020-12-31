package com.acme.architecture.testing.example.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ExampleMessage implements Serializable {

	private static final long serialVersionUID = -7844616532638993948L;

	private Long id;
	
	private String message;

}
