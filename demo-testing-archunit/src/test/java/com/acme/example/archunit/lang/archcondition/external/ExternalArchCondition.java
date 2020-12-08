package com.acme.example.archunit.lang.archcondition.external;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaMethod;
import com.tngtech.archunit.core.domain.JavaModifier;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;

public class ExternalArchCondition {

	public static final ArchCondition<? super JavaClass> classes_no_public_setter_condition = new ArchCondition<Object>("class has no public setters") {

		@Override
		public void check(Object item, ConditionEvents events) {
			
			for (JavaMethod javaMethod : ((JavaClass) item).getMethods()) {
				
				if (javaMethod.getName().startsWith("set") && javaMethod.getModifiers().contains(JavaModifier.PUBLIC)) {
					String message = String.format("Public method %s is not allowed begin with set (setter type)",
							javaMethod.getName());
					
					events.add(SimpleConditionEvent.violated(item, message));
				}
				
			}
			
		}
		
	};

}
