package com.my.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.my.POMFactory.UserOrderStatus;
import com.my.POMFactory.softwareAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class userCheckingStatus {

	WebDriver driver;
	
	
	@Given("^Log In page$")
	public void log_In_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demo.oscommerce.com/login.php");
	}

	@When("^Log into the Account$")
	public void log_into_the_Account() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.emailEnter().sendKeys("abcdwwwwqqqqqq22345674588888889555@yahoo.com");
		abcd.passwordEnter().sendKeys("abc123456");
		
		abcd.signIn().click();
	}

	@When("^Click On View the orders I have made$")
	public void click_On_View_the_orders_I_have_made() throws Throwable {
		UserOrderStatus view = new UserOrderStatus(driver);
		
		view.myAccount().click();
		view.clickOrder().click();
		
	}

	@When("^CLick on my order (\\d+)$")
	public void click_on_my_order(int arg1) throws Throwable {
		UserOrderStatus view = new UserOrderStatus(driver);
		
		view.clickOnView().click();
	}

	@Then("^view the status$")
	public void view_the_status() throws Throwable {
		UserOrderStatus view = new UserOrderStatus(driver);
		System.out.println(view.Confirmation().getText());
		
		
	}
}
