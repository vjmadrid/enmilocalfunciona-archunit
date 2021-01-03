package com.acme.architecture.testing.example.archunit.predicate;

import com.tngtech.archunit.base.DescribedPredicate;
import com.tngtech.archunit.core.domain.JavaClass;

public class ExampleArchitecturePredicate extends DescribedPredicate<JavaClass> {

	public ExampleArchitecturePredicate(String description, Object[] params) {
		super("Example Architecture Predicate");
	}

	@Override
	public boolean apply(JavaClass input) {
		return false;
	}

}
