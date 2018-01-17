package com.my.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hardwareItem {

	WebDriver driver;
	
	
	@Given("^OS-Commerce Webpage$")
	public void os_Commerce_Webpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demo.oscommerce.com/");
	}

	@When("^click on Hardware$")
	public void click_on_Hardware() throws Throwable {
	   
	}

	@When("^Click on Mice$")
	public void click_on_Mice() throws Throwable {
	
	}

	@When("^Selecting USB$")
	public void selecting_USB() throws Throwable {
	   
	}

	@When("^Click on Add to Cart$")
	public void click_on_Add_to_Cart() throws Throwable {
	    
	}

	@When("^Remove Item that was previously there$")
	public void remove_Item_that_was_previously_there() throws Throwable {
	    
	}

	@When("^Choose the Best Way shipping$")
	public void choose_the_Best_Way_shipping() throws Throwable {
	    
	}

	@When("^Add Comments$")
	public void add_Comments() throws Throwable {
	    
	}

	@When("^Click on Cash On Delivery$")
	public void click_on_Cash_On_Delivery() throws Throwable {
	   
	}

	@When("^Click Continue$")
	public void click_Continue() throws Throwable {
	   
	}

	@When("^click on PayNow$")
	public void click_on_PayNow() throws Throwable {
	   
	}

	@Then("^get the confirmation text$")
	public void get_the_confirmation_text() throws Throwable {
	  
	}
}
