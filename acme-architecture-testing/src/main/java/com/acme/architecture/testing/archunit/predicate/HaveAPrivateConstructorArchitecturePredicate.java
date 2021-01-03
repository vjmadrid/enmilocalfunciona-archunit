package com.acme.architecture.testing.archunit.predicate;

import com.tngtech.archunit.base.DescribedPredicate;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaConstructor;
import com.tngtech.archunit.core.domain.JavaModifier;

public class HaveAPrivateConstructorArchitecturePredicate extends DescribedPredicate<JavaClass> {

	public HaveAPrivateConstructorArchitecturePredicate(String description, Object[] params) {
		super("Have A Private Constructor Architecture Predicate");
	}

	@Override
	public boolean apply(JavaClass input) {
		
		for (JavaConstructor constructor : input.getConstructors()) {
            if (constructor.getModifiers().contains(JavaModifier.PUBLIC)) {
                return true;
            }
        }
		
        return input.getConstructors().isEmpty() &&
                input.getSuperClass().isPresent() &&
                new HaveAPrivateConstructorArchitecturePredicate("Have A Private Constructor Architecture Predicate", null).apply(input.getSuperClass().get());
	}

}
