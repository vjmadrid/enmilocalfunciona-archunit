package com.acme.architecture.testing.archunit.condition;

import java.util.List;
import java.util.Set;

import com.acme.architecture.testing.archunit.util.ArchUnitNameUtil;
import com.acme.architecture.testing.archunit.util.converter.ArchUnitConverterUtil;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;

public class ImplementInterfaceWithSameNameArchitectureCondition extends ArchCondition<JavaClass> {

	public final String MESSAGE_TEMPLATE_EMPTY_INTERFACES = "%s no implement '%s'";
	public final String MESSAGE_TEMPLATE_OTHER = "%s no implement '%s' -> Use other '*Repository' or '*Service'";

	public ImplementInterfaceWithSameNameArchitectureCondition() {
		super("Implement Interface With Same Name Architecture Condition");
	}
	
	@Override
	public void check(JavaClass item, ConditionEvents events) {
		String namePreparedClass = ArchUnitNameUtil.generateNameFromNameImplementation(item.getSimpleName());

		Set<JavaClass> interfacesSet = item.getInterfaces();

		if (interfacesSet.isEmpty()) {
			String message = String.format(MESSAGE_TEMPLATE_EMPTY_INTERFACES, item.getFullName(), namePreparedClass);
			events.add(new SimpleConditionEvent(item, !interfacesSet.isEmpty(), message));
		} else {
			List<String> nameSetList = ArchUnitConverterUtil.convertSetToList(interfacesSet);
			boolean containsNamePrepared= nameSetList.contains(namePreparedClass);
			
			String message = String.format(MESSAGE_TEMPLATE_OTHER, item.getFullName(), namePreparedClass);
			events.add(new SimpleConditionEvent(item, containsNamePrepared, message));
		}

	}

}
