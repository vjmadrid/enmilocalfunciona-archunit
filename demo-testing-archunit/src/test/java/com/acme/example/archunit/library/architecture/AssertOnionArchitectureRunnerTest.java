package com.acme.example.archunit.library.architecture;

import static com.tngtech.archunit.library.Architectures.onionArchitecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

//@RunWith(ArchUnitRunner.class) //Only for JUnit 4 , not needed JUnit5∂
@AnalyzeClasses(packages = "com.acme.example", importOptions = { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class })
public class AssertOnionArchitectureRunnerTest {
	
	@ArchTest
	static ArchRule layeredArchitecture = 
		onionArchitecture()
	    
	    .domainModels("..domain..")
	    .domainServices("..service..")
	    .applicationServices("..application..")
	    .adapter("Client", "..client..")
	    .adapter("Web", "..web..");
	
}