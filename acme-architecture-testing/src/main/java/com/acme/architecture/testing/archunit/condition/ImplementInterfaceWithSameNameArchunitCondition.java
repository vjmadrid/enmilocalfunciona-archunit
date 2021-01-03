package com.acme.architecture.testing.archunit.condition;

import java.util.List;
import java.util.Set;

import com.acme.architecture.testing.archunit.util.ArchUnitNameUtil;
import com.acme.architecture.testing.archunit.util.converter.ArchUnitConverterUtil;
import com.tngtech.archunit.core.domain.JavaClass;
import com.tngtech.archunit.lang.ArchCondition;
import com.tngtech.archunit.lang.ConditionEvents;
import com.tngtech.archunit.lang.SimpleConditionEvent;

public class ImplementInterfaceWithSameNameArchunitCondition extends ArchCondition<JavaClass> {

	public final String MESSAGE_TEMPLATE_EMPTY_INTERFACES = "%s no implement '%s'";
	public final String MESSAGE_TEMPLATE_OTHER_REPOSITORY = "%s no implement '%s' -> Use other '*Repository'";

	public ImplementInterfaceWithSameNameArchunitCondition() {
		super("No Methods Condition");
	}
	
	@Override
	public void check(JavaClass item, ConditionEvents events) {
		String nameRepository = ArchUnitNameUtil.generateNameFromNameImplementation(item.getSimpleName());

		Set<JavaClass> interfacesSet = item.getInterfaces();

		if (interfacesSet.isEmpty()) {
			String message = String.format(MESSAGE_TEMPLATE_EMPTY_INTERFACES, item.getFullName(), nameRepository);
			events.add(new SimpleConditionEvent(item, !interfacesSet.isEmpty(), message));
		} else {
			List<String> nameSetList = ArchUnitConverterUtil.convertSetToList(interfacesSet);
			boolean containsNameRepository = nameSetList.contains(nameRepository);
			
			String message = String.format(MESSAGE_TEMPLATE_OTHER_REPOSITORY, item.getFullName(), nameRepository);
			events.add(new SimpleConditionEvent(item, containsNameRepository, message));
		}

	}

}
