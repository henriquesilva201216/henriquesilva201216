package com.keeggo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class Runs {

	
	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/resources/features",
			glue = {"com.keeggo.steps"},
			tags = "@Executa",
			monochrome = true,
			dryRun = false,
			plugin = {"pretty", "html:target/report.html", "json:target/report.json"}
			
			
			)
	public class RunnerTeste {


		
		
		
		

	}

	
	
	
	
}
