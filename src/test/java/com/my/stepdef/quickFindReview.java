package com.my.stepdef;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.my.POMFactory.QsearchReadReview;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class quickFindReview {

	static WebDriver driver;

	@Given("^OS-Commer site$")
	public void os_Commer_site() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demo.oscommerce.com/");

	}

	
	@When("^Type Keyboard$")
	public void type_Keyboard() throws Throwable {
		QsearchReadReview key = new QsearchReadReview(driver);
		key.searchKeyboard().sendKeys("keyboard");
	}

	@When("^Hit Enter$")
	public void hit_Enter() throws Throwable {
		Actions enter = new Actions (driver);
		QsearchReadReview key = new QsearchReadReview(driver);
		enter.sendKeys(Keys.ENTER).perform();
	}

	@When("^Select the Microsoft Internet Keyboard PS/(\\d+)$")
	public void select_the_Microsoft_Internet_Keyboard_PS(int arg1) throws Throwable {
		QsearchReadReview key = new QsearchReadReview(driver);
		key.clickinOnMSKeyBoard().click();
	}

	@When("^click on Reviews$")
	public void click_on_Reviews() throws Throwable {
		QsearchReadReview key = new QsearchReadReview(driver);
		key.viewReview().click();
	}

	@Then("^Read the review that is present$")
	public void read_the_review_that_is_present() throws Throwable {
		QsearchReadReview key = new QsearchReadReview(driver);
		System.out.println("The review is Present: " + key.readingReview().getText());
	}
}
