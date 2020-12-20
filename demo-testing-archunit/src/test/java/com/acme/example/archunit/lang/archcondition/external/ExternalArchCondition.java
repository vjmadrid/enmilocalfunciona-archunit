package com.acme.example.archunit.lang.archcondition.external;

import java.util.Set;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaMethod;
import com.tngtech.archunit.core.domain.JavaModifier;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;

public class ExternalArchCondition {
	
	public static final int DEFAULT_METHODS_LIMIT = 1;
	

	public static final ArchCondition<? super JavaClass> classes_no_public_setter_condition = new ArchCondition<Object>("Class has no public setters") {

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
	
	public static ArchCondition<JavaClass> classes_contain_only_one_public_method = new ArchCondition<JavaClass>("Class contains only one public method") {

            @Override
            public void check(final JavaClass clazz, final ConditionEvents events) {

                final String name = clazz.getName();
                final Set<JavaMethod> methodsSet = clazz.getMethods();
                int PublicMethodsCount = 0;

                for (final JavaMethod javaMethod : methodsSet) {
                    if (javaMethod.getModifiers()
                            .contains(JavaModifier.PUBLIC)) {
                        PublicMethodsCount = PublicMethodsCount + 1;
                    }
                }

                if (PublicMethodsCount > DEFAULT_METHODS_LIMIT) {
                    throw new AssertionError(String.format("Class %s contains %d public methods, when limit is %d",
                            name, PublicMethodsCount, DEFAULT_METHODS_LIMIT));
                }
            }
     };

}
