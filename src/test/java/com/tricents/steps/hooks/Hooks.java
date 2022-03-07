package com.tricents.steps.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import managers.TestContext;

/**
 * Classe responsavel pela execucao de metodos que serao executados antes de cada cenario
 * @author joao.africo
 *
 */
public class Hooks{
	
	TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}
	
	/**
	 * Metodo responsavel por ser executado antes de cada cenario
	 * @param cenario. Utilizado para chamar as propriedades do cenario
	 */
	@Before
	public void setup(Scenario cenario) {
		System.out.println("-------------INICIANDO AUTOMAÇÃO----------");	
		System.out.println("*****TAG: "+cenario.getSourceTagNames());	
		System.out.println("*****CENARIO: "+cenario.getName());		
		System.out.println("-------------------------------------------");
	}
	
	/**
	 * Metodo responsavel por ser executado depois de cada cenario
	 * @param cenario. Utilizado para chamar as propriedades do cenario
	 */
	@After
	public void tearDown(Scenario cenario) {	
		System.out.println("--------------------------------------------");
		System.out.println("-------------FINALIZANDO AUTOMAÇÃO----------");
		System.out.println("*****STATUS: "+cenario.getStatus());
		testContext.getWebDriverManager().closeDriver();
	}	
}
