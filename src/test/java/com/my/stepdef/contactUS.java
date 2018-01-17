package com.my.stepdef;

import java.text.Normalizer.Form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.my.POMFactory.contactUsForm;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contactUS {

	
	static WebDriver driver;
	
	@Given("^OS-Commerce Site$")
	public void os_Commerce_Site() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demo.oscommerce.com/");
	}

	@When("^click on Contact US$")
	public void click_on_Contact_US() throws Throwable {
		contactUsForm form = new contactUsForm(driver);
		form.clickingOnContractUs().click();
	}

	@When("^enter my Full Name$")
	public void enter_my_Full_Name() throws Throwable {
		contactUsForm form = new contactUsForm(driver);
		form.enterFullName().sendKeys("Syed ALam");
	}

	@When("^Enter my Email Address$")
	public void enter_my_Email_Address() throws Throwable {
		contactUsForm form = new contactUsForm(driver);
		form.enterEmail().sendKeys("abcdwwwwqqqqqq22345674588888889555@yahoo.com");
	}

	@When("^Type  my Concern in Enquiry$")
	public void type_my_Concern_in_Enquiry() throws Throwable {
		contactUsForm form = new contactUsForm(driver);
		form.enterEnquiry().sendKeys("Hello:");
		form.clickOnContinue().click();
	}

	@Then("^Recieve the confirmation text$")
	public void recieve_the_confirmation_text() throws Throwable {
		contactUsForm form = new contactUsForm(driver);
		System.out.println(form.confirmationText().getText());
	}
}
