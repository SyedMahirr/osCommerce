package com.my.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class testNGtestRunner {
	
	@CucumberOptions(
	        features = "Features",
	        glue="com.my.stepdef",
	        tags= //{"@creating_An_Account"}
	        //{"@log_In"}
	    //{"@Hardware_Items"}
	    //{"@software_Action"}
	    {"@Quick_find_Item_Read_Review"}
	        )

	public class TestRunner extends AbstractTestNGCucumberTests{}

}
