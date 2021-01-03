package com.acme.architecture.testing.archunit.condition;

import com.tngtech.archunit.core.domain.JavaConstructor;
import com.tngtech.archunit.core.domain.JavaModifier;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;

public class PrivateConstructorsArchitectureCondition extends ArchCondition<JavaConstructor> {
	
	public final String MESSAGE_TEMPLATE = "%s is not private constructor";

	public PrivateConstructorsArchitectureCondition() {
		super("Private Constructors Architecture Condition");
	}

	@Override
	public void check(JavaConstructor item, ConditionEvents events) {
		boolean isPrivateAccess = item.getModifiers().contains(JavaModifier.PRIVATE);
		
        String message = String.format(MESSAGE_TEMPLATE,  item.getFullName());
        events.add(new SimpleConditionEvent(item, isPrivateAccess, message));
	}

}
