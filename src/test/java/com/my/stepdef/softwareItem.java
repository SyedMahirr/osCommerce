package com.my.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.my.POMFactory.softwareAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class softwareItem {

	static WebDriver driver;
	
	@Given("^OS-Commerce Webpage\\.$")
	public void os_Commerce_Webpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demo.oscommerce.com/");
	}

	@When("^Click on Software$")
	public void click_on_Software() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.software().click();
	}

	@When("^Click On Strategy$")
	public void click_On_Action() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.action().click();
	}

	@When("^Click on Buy Now\\.$")
	public void click_on_Buy_Now() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.BuyNow().click();
	}

	@When("^Click on Check Out\\.$")
	public void click_on_Check_Out() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.Cart().click();
		abcd.Checkout().click();
	}

	@When("^Log into the account\\.$")
	public void log_into_the_account() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.emailEnter().sendKeys("abcdwwwwqqqqqq22345674588888889555@yahoo.com");
		abcd.passwordEnter().sendKeys("abc123456");
		
		abcd.signIn().click();
	}

	@When("^Choose the Flat Rate shipping\\.$")
	public void choose_the_Flat_Rate_shipping() throws Throwable {
	   
	}

	@When("^Add Comments\\.$")
	public void add_Comments() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.commentGive().sendKeys("Please Give A Comment");
	}

	@When("^Click Continue\\.$")
	public void click_Continue() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.clickOnContinue().click();
	}

	// Error
	@When("^Click on Cash On Delivery\\.$")
	public void click_on_Cash_On_Delivery() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.cashOnDelivery().click();
	}

	@When("^click on PayNow\\.$")
	public void click_on_PayNow() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.payNow().click();
	}

	@Then("^get the confirmation text\\.$")
	public void get_the_confirmation_text() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		System.out.println(abcd.confirmation().getText());
		System.out.println(abcd.confirmationOforder().getText());
	}
}
