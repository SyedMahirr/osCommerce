package com.my.stepdef;



import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.my.POMFactory.applicationVerifications;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class verifications {

	WebDriver driver;

	@When("^check the title of the page$")
	public void check_the_title_of_the_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demo.oscommerce.com/");

		// Storing Title name in the String variable
		String title = driver.getTitle();

		System.out.println("URL is : " + driver.getCurrentUrl());

	}

	@When("^Check the Lenght of the title$")
	public void check_the_Lenght_of_the_title() throws Throwable {

		// Storing Title length in the Int variable
		int titleLength = driver.getTitle().length();
		System.out.println("Length of the title is : " + titleLength);

	}

	@When("^Check the URL$")
	public void check_the_URL() throws Throwable {
		System.out.println("URL is : " + driver.getCurrentUrl());

	}

	

	@When("^check Cart Content Element present$")
	public void check_Cart_Content_Element_present() throws Throwable {
		applicationVerifications veri = new applicationVerifications(driver);
		System.out.println("The element is present: " +  veri.CartContents().isDisplayed());
		System.out.println("The Dimention is" + veri.CartContents().getSize());
		
	}

	@When("^Scroll Down$")
	public void scroll_Down() throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
	}

	@When("^click on Specials$")
	public void click_on_Specials() throws Throwable {
		applicationVerifications veri = new applicationVerifications(driver);
		veri.SpecialClick().click();
		
	}

	@When("^Go back$")
	public void go_back() throws Throwable {
		driver.navigate().back();
	}

	@Then("^Refresh The page$")
	public void refresh_The_page() throws Throwable {
		driver.navigate().refresh();
	}

}
