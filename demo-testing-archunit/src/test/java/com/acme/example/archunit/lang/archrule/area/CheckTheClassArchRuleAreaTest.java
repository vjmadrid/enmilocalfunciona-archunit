package com.acme.example.archunit.lang.archrule.area;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.theClass;

import java.io.Serializable;

import com.acme.example.archunit.user.annotation.UserDescription;
import com.acme.example.archunit.user.entity.User;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

//@RunWith(ArchUnitRunner.class) // Important: Only for JUnit 4 and not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example", 
importOptions = { 
		ImportOption.DoNotIncludeTests.class, 
		ImportOption.DoNotIncludeJars.class, 
		ImportOption.DoNotIncludeArchives.class 
})
public class CheckTheClassArchRuleAreaTest {

	@ArchTest
	public static final ArchRule entity_classes_should_be_in_entity_package = theClass(User.class).should().resideInAPackage("..entity");
	
	@ArchTest
	public static final ArchRule entity_classes_should_be_serializable = theClass(User.class).should().implement(Serializable.class);
	
	@ArchTest
	public static final ArchRule entity_classes_should_use_annotation_UserDescription = theClass(User.class).should().beAnnotatedWith(UserDescription.class);

	@ArchTest
	public static final ArchRule entity_classes_should_access_others_packages = theClass(User.class).should().accessClassesThat().resideOutsideOfPackages("..archunit..", "com..");
	
}