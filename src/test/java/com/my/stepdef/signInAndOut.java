package com.my.stepdef;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.my.POMFactory.signingInAndLoggingOut;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signInAndOut {

	static WebDriver driver;

	@Given("^OS Commerce Web page$")
	public void os_Commerce_Web_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demo.oscommerce.com/");
	}

	@When("^Clicking on the My Account$")
	public void clicking_on_the_My_Account() throws Throwable {
		// Object
		signingInAndLoggingOut signOutAndLogOut = new signingInAndLoggingOut(driver);
		signOutAndLogOut.clickOnMyAccount().click();
	}

	@And("^Enter Valid Email Address$")
	public void enter_Valid_Email_Address() throws Throwable {

		Properties prop = new Properties();

		FileInputStream pointFile = new FileInputStream(
				"C:\\Users\\alams\\OS-Commerce\\src\\test\\java\\com\\my\\information\\credentials.properties");

		prop.load(pointFile);

		// Object
		signingInAndLoggingOut signOutAndLogOut = new signingInAndLoggingOut(driver);

		signOutAndLogOut.enterEmailAddress().sendKeys(prop.getProperty("EmaiAddress"));
	}

	@And("^Enter Password$")
	public void enter_Password() throws Throwable {
		Properties prop = new Properties();

		FileInputStream pointFile = new FileInputStream(
				"C:\\Users\\alams\\OS-Commerce\\src\\test\\java\\com\\my\\information\\credentials.properties");

		prop.load(pointFile);

		// Object
		signingInAndLoggingOut signOutAndLogOut = new signingInAndLoggingOut(driver);

		signOutAndLogOut.enterPassword().sendKeys("Password");
	}

	@Then("^Clicking On Sign-In Button$")
	public void clicking_On_Sign_In_Button() throws Throwable {
		signingInAndLoggingOut signOutAndLogOut = new signingInAndLoggingOut(driver);

		signOutAndLogOut.clickingOnSignInButton().click();

	}
	
	

}
