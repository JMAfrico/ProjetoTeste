package com.tricents.steps;

import org.junit.runner.Description;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
	
	Scenario cenario;
	Description description;
	
	@Before
	public void setup(Scenario cenario) {
		this.cenario= cenario;
		System.out.println("-------------INICIANDO AUTOMAÇÃO----------");	
		System.out.println("*****TAG: "+cenario.getSourceTagNames());	
		System.out.println("*****CENARIO: "+cenario.getName());		
		System.out.println("-------------------------------------------");
	}
	
	@After
	public void tearDown(Scenario cenario) {
		this.cenario= cenario;
		System.out.println("--------------------------------------------");
		System.out.println("-------------FINALIZANDO AUTOMAÇÃO----------");
		System.out.println("*****STATUS: "+cenario.getStatus());
	}	
}
