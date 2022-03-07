package com.tricents.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import managers.TestContext;

public class Hooks{
	
	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}
	
	@Before
	public void setup(Scenario cenario) {
		System.out.println("-------------INICIANDO AUTOMAÇÃO----------");	
		System.out.println("*****TAG: "+cenario.getSourceTagNames());	
		System.out.println("*****CENARIO: "+cenario.getName());		
		System.out.println("-------------------------------------------");
	}
	
	@After
	public void tearDown(Scenario cenario) {	
		System.out.println("--------------------------------------------");
		System.out.println("-------------FINALIZANDO AUTOMAÇÃO----------");
		System.out.println("*****STATUS: "+cenario.getStatus());
		//testContext.getWebDriverManager().closeDriver();
	}	
}
