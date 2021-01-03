package com.acme.architecture.testing.archunit.condition;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;

public class NoMethodsArchitectureCondition extends ArchCondition<JavaClass> {

	public final String MESSAGE_TEMPLATE = "%s has methods";

	public NoMethodsArchitectureCondition() {
		super("No Methods Architecture Condition");
	}

	@Override
	public void check(JavaClass item, ConditionEvents events) {
		boolean hasNoMethods = (item.getMethods().size()==0);
				
		String message = String.format(MESSAGE_TEMPLATE,  item.getFullName());
		events.add(new SimpleConditionEvent(item, hasNoMethods, message));
		
	}

}
