package com.acme.example.archunit.lang.archrule.external;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import java.io.Serializable;

import com.tngtech.archunit.lang.ArchRule;

public class ExternalEntityArchitectureRule {
	
	public static final ArchRule entity_classes_should_be_serializable =
			classes()
			.that()
			.resideInAPackage("..archunit.entity")
			.should().implement(Serializable.class);

}
