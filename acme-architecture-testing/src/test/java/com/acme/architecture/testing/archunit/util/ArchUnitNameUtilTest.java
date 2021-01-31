package com.acme.architecture.testing.archunit.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArchUnitNameUtilTest {
	
	private static final String INVALID_NAME = "Value";
	
	private static final String VALID_NAME = "ExampleImpl";
	private static final String NAME = "Example";
	
	@BeforeEach
	public final void setUp() {

	}
	
	@Test
	public void whenCallAGenerateNameFromNameImplementationWithNull_thenReturnEmptyString() throws Exception {
		String result = ArchUnitNameUtil.generateNameFromNameImplementation(null);
		
		assertNotNull(result);
		assertEquals("",result);
	}
	
	@Test
	public void whenCallAGenerateNameFromNameImplementationWithInvalid_thenReturnEmptyString() throws Exception {
		String result = ArchUnitNameUtil.generateNameFromNameImplementation(INVALID_NAME);
		
		assertNotNull(result);
		assertEquals("",result);
	}
	
	@Test
	public void whenCallAGenerateNameFromNameImplementation_thenReturnString() throws Exception {
		String result = ArchUnitNameUtil.generateNameFromNameImplementation(VALID_NAME);
		
		assertNotNull(result);
		assertEquals(NAME,result);
	}

}