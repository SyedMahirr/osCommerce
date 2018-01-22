package com.my.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class testNGtestRunner {
	
	@CucumberOptions(
	        features = "Features",
	        glue="com.my.stepdef",
	        tags= {"@Log-In, @addNewUser "}
	  
	        )

	public class TestRunner extends AbstractTestNGCucumberTests{}

}
