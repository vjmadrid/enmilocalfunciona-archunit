package com.acme.example.archunit.lang.archrule.feature;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import java.io.Serializable;

import com.acme.example.archunit.entity.AbstractEntity;
import com.acme.example.archunit.user.annotation.UserDescription;
import com.acme.example.archunit.user.util.ListUtil;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;


//@RunWith(ArchUnitRunner.class) // Important: Only for JUnit 4 and not needed JUnit5
@AnalyzeClasses(packages = "com.acme.example", 
importOptions = { 
		ImportOption.DoNotIncludeTests.class, 
		ImportOption.DoNotIncludeJars.class, 
		ImportOption.DoNotIncludeArchives.class 
})
public class ExamplesCheckConventionsArchRuleTest {
	
	/*
	 * Regla que verifica que cualquier clase con sufijo "Entity" se encuentre ubicada
	 * en un paquete que contiene "..entity"
	 * 
	 * Nota : Esta regla no descarta que se usen Clases de Entidad sin el sufijo "Entity"
	 * Permitiendo clases como "User", "Product", etc
	 */
	@ArchTest
	public static final ArchRule entity_classes_should_be_in_entity_package = 
		    classes()
		    .that().haveSimpleNameEndingWith("Entity")
		    .should().resideInAPackage("..entity..");
	
	@ArchTest
	public static final ArchRule entity_should_reside_inside_entity_package =
			ArchRuleDefinition.classes()
	        .that()
	        .haveSimpleNameEndingWith("Entity")
	        .should()
	        .resideInAPackage("..entity..")
	        .because("Entity Classes should stay inside entity package");
	
	/*
	 * Regla que verifica que dentro de un paquete "..entity.." todas las clases utilizan
	 * el sufijo "Entity"
	 * 
	 * Esta regla se consideraría más de nomenclatura
	 * 
	 * Fuerza a que todas las clases contenidas en un directorio tengan el sufijo
	 * 
	 * IMPORTANTE : ESTE TEST FALLA AL EXISTIR CLASES DE ENTIDAD QUE NO TIENEN SUFIJO "Entity"
	 */
	
	@ArchTest
	public static final ArchRule entity_classes_should_have_names_ending_with_the_word_entity = 
		    classes()
		    .that().resideInAPackage("..entity..")
		    .should().haveSimpleNameEndingWith("Entity");

	/*
	 * Regla que verifica que toas las clases que residen en un paquete "..archunit.entity" deberían
	 * de implementar Serializable
	 * 
	 * Se puede combinar con más filtros
	 */
	@ArchTest
	public static final ArchRule package_entity_classes_should_be_serializable =
			classes()
			.that()
			.resideInAPackage("..archunit.entity")
			.should().implement(Serializable.class);
	
	/*
	 * Regla que verifica que todas las clases deberían de ser accedidas por clases que implementan Serializable
	 * 
	 * IMPORTANT : ESTE TEST FALLA AL NO CUMPLIRSE AL APLICARSE SOBRE TODOS LAS CLASES POR EJEMPLO LOS CONTROLLERS NO SON SERIALIZABLES
	 */
	@ArchTest
	public static final ArchRule entity_classes_should_accessed_by_other_classes_that_impl_serializable = 
			classes()
			.should().onlyBeAccessed().byClassesThat().implement(Serializable.class);

	
	/*
	 * Regla que verifica que todas las clases anotadas con UserDescription deberían de ser accedidas por clases que implementan Serializable
	 * 
	 * IMPORTANT : ESTE TEST FALLA AL NO CUMPLIRSE AL APLICARSE SOBRE TODOS LAS CLASES ANOTADAS POR @UserDescription POR EJEMPLO LOS CONTROLLERS NO SON SERIALIZABLES
	 * NI TIENEN ESA ANOTACIÓN
	 */
	@ArchTest
	public static final ArchRule classes_with_annotation_UserDescription_should_accessed_by_other_classes_that_impl_serializable = 
		classes()
		.that().areAnnotatedWith(UserDescription.class)
		.should().onlyBeAccessed().byClassesThat().implement(Serializable.class);
	
	
	/*
	 * Regla que verifica que todas las clases que implementan Serializable NO son una clase concreta
	 */
	@ArchTest
	public static final ArchRule classes_implements_serializable_no_should_be_ListUtils = 
			classes()
            .that().implement(Serializable.class)
            .should().notBe(ListUtil.class);
	
	/*
	 * Regla que verifica que esta anotada por UserDescription o tiene un nombre que coincide con la mascara ".*User*"
	 * debería de residir un un paquete
	 */
	@ArchTest
	public static final ArchRule classes_with_annotation_UserDescription_or_name_user_should_be_in_user_package = 
			classes()
            .that().areAnnotatedWith(UserDescription.class).or().haveNameMatching(".*User*")
            .should().resideInAPackage("..user..");
	
	/*
	 * Regla que verifica que NO hay clases anotadas por UserDescription que residen fuera del paquete "..user.."
	 */
	@ArchTest
	public static final ArchRule no_classes_with_UserDescription_annotation_should_reside_outside_user_package = 
			 noClasses()
		      .that().areAnnotatedWith(UserDescription.class)
		      .should().resideOutsideOfPackage("..user..");
	
	/*
	 * Regla que verifica que las clases de una entidad extiende AbstracEntity.class
	 * IMPORTANT : ESTE TEST FALLA AL NO CUMPLIRSE AL APLICARSE SOBRE TODOS LAS CLASES ENTIDAD DE UN PAQUETE Y NO CUMPLIR QUE EXTIENDAN DE "AbstractEntity"
	 */
	@ArchTest
	public static final ArchRule entity_classes_should_implements_abstract_entity_class = 
			classes()
			    .that().resideInAPackage("..archunit.entity")
			    .should().beAssignableTo(AbstractEntity.class);

}