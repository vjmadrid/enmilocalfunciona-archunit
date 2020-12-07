package com.acme.example.archunit.lang.archrule.feature;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import java.io.Serializable;

import com.acme.example.archunit.user.annotation.UserDescription;
import com.acme.example.archunit.user.util.ListUtil;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;


//@RunWith(ArchUnitRunner.class) // Important: Only for JUnit 4 and not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example.archunit.user.entity", importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class })
public class ExamplesCheckConventionsArchRuleTest {

	@ArchTest
	public static final ArchRule all_entity_class_impl_serializable = classes().should().onlyBeAccessed().byClassesThat()
			.implement(Serializable.class);
	
	@ArchTest
	public static final ArchRule all_entity_class_with_annotation_filter_impl_serializable = classes().that().areAnnotatedWith(UserDescription.class).should().onlyBeAccessed().byClassesThat()
			.implement(Serializable.class);
	
	@ArchTest
	public static final ArchRule all_entity_class_with_implement_filter = 
			classes()
            .that().implement(Serializable.class)
            .should().notBe(ListUtil.class);
	

	@ArchTest
	public static final ArchRule all_entity_class_with_composition_filter = 
			classes()
            .that().areAnnotatedWith(UserDescription.class).or().haveNameMatching(".*User*")
            .should().resideInAPackage("..user..");

}