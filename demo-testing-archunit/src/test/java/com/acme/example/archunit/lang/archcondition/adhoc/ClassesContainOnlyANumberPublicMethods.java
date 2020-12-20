package com.acme.example.archunit.lang.archcondition.adhoc;

import java.util.Set;

import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.core.domain.JavaMethod;
import com.tngtech.archunit.core.domain.JavaModifier;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;

public class ClassesContainOnlyANumberPublicMethods extends ArchCondition<JavaClass> {
	
	private int numMethodsLimit;
	
	public ClassesContainOnlyANumberPublicMethods(final int numMethodsLimit) {
		super("Class contains only N public methods");
		this.numMethodsLimit=numMethodsLimit;
	}

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

        if (PublicMethodsCount > numMethodsLimit) {
            throw new AssertionError(String.format("Class %s contains %d public methods, when limit is %d",
                    name, PublicMethodsCount, numMethodsLimit));
        }
    }

}
