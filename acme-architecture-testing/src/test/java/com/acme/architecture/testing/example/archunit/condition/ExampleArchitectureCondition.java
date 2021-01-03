package com.acme.architecture.testing.example.archunit.condition;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;

public class ExampleArchitectureCondition extends ArchCondition<JavaClass> {

	public ExampleArchitectureCondition() {
		super("Example Architecture Condition");
	}

	@Override
	public void check(JavaClass item, ConditionEvents events) {

	}

}
