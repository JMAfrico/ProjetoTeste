package com.tricents.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:tricentsFeatures",
				glue = "com.tricents.steps",
				tags = "@cotacao_com_sucesso"			
				)
public class TricentsRunner {

}
