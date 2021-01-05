package com.acme.example.archunit.lang.archrule.exception;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.Serializable;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.acme.example.archunit.core.importclasses.component.util.ArchUnitComponentUtil;
import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;

public class CheckInvalidArchRuleWithMethodTest {
	
	private static final String PACKAGE_TEST_VALUE = "com.acme.example";
	
    private static JavaClasses IMPORTED_CLASSES = new ClassFileImporter().importPackages(PACKAGE_TEST_VALUE);
    
    private static ArchRule entity_classes_should_be_serializable = classes().that().resideInAPackage("..user.util").should().implement(Serializable.class);

  
    @BeforeAll
    public static void init() {
    	 System.out.println("* Show Description Rule :: "+entity_classes_should_be_serializable);
         
         ArchUnitComponentUtil.showInfo(IMPORTED_CLASSES);   
    }
    
	@Test
    public void whenCallCheckInvalidArchRuleForSerializableEntities_thenReturnAssertionErrorNoControl() {
		//CASE 1 : No control exception (Generate Test Error )
        entity_classes_should_be_serializable.check(IMPORTED_CLASSES);   
    }
	
	@Test
    public void whenCallCheckInvalidArchRuleForSerializableEntities_thenReturnAssertionError() {        
        //CASE 2 : Only control exception
        assertThrows(AssertionError.class, ()-> entity_classes_should_be_serializable.check(IMPORTED_CLASSES));
        
    }
	
	@Test
    public void whenCallCheckInvalidArchRuleForSerializableEntities_thenReturnAssertionErrorWithMessage() {
        //CASE 3 : : Control exception + Message Exception
        AssertionError exception = assertThrows(AssertionError.class, ()->{
        	entity_classes_should_be_serializable.check(IMPORTED_CLASSES);
		});
		
		assertEquals("Architecture Violation [Priority: MEDIUM] - Rule 'classes that reside in a package '..user.util' should implement java.io.Serializable' was violated (1 times):\n" + 
				"Class <com.acme.example.archunit.user.util.ListUtil> does not implement java.io.Serializable in (ListUtil.java:0)", exception.getMessage());
    }
	
}