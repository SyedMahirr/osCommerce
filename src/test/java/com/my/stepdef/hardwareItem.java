package com.my.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.my.POMFactory.MiceHardWare;
import com.my.POMFactory.softwareAction;

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
	   
		// Object that will invoke all the methods from  MiceHardWare class
		 MiceHardWare mice = new  MiceHardWare(driver);
		 mice.clickOnHardware().click();
	}

	@When("^Click on Mice$")
	public void click_on_Mice() throws Throwable {
		// Object that will invoke all the methods from  MiceHardWare class
				 MiceHardWare mice = new  MiceHardWare(driver);
				 mice.clickOnMice().click();
		
	}
	
	@When("^CLick on BuyNow$")
	public void click_on_BuyNow() throws Throwable {
		 MiceHardWare mice = new  MiceHardWare(driver);
		 mice.clickOnBuyNow().click();
	}

	@When("^Selecting USB$")
	public void selecting_USB() throws Throwable {
		// Object that will invoke all the methods from  MiceHardWare class
				 MiceHardWare mice = new  MiceHardWare(driver);
				 mice.clickDrop().click();
				 mice.SelectUSB("9");
	}

	@When("^Click on Add to Cart$")
	public void click_on_Add_to_Cart() throws Throwable {
		// Object that will invoke all the methods from  MiceHardWare class
				 MiceHardWare mice = new  MiceHardWare(driver);
				 mice.clickOnAddToCart().click();
	}
	
	@When("^Click on Checkout$")
	public void click_on_Checkout() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.Cart().click();
		abcd.Checkout().click();
	}

	@When("^Loginto the Account$")
	public void loginto_the_Account() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.emailEnter().sendKeys("abcdwwwwqqqqqq22345674588888889555@yahoo.com");
		abcd.passwordEnter().sendKeys("abc123456");
		
		abcd.signIn().click();
	}

	@When("^Remove Item that was previously there$")
	public void remove_Item_that_was_previously_there() throws Throwable {
		// Object that will invoke all the methods from  MiceHardWare class
				MiceHardWare mice = new  MiceHardWare(driver);
				mice.clickOnCheckOut().click();
	
	}

	@When("^Choose the Best Way shipping$")
	public void choose_the_Best_Way_shipping() throws Throwable {
		// Object that will invoke all the methods from  MiceHardWare class
				 MiceHardWare mice = new  MiceHardWare(driver);
				 mice.clickOnPerItem().click();
	
	}

	@When("^Add Comments$")
	public void add_Comments() throws Throwable {
		// Object that will invoke all the methods from  MiceHardWare class
				 MiceHardWare mice = new  MiceHardWare(driver);
				 mice.clickOnComment().sendKeys("GooD CHoice");
				 mice.clickOnContinueClick().click();
	}

//	
	@When("^Click on Cash On Delivery$")
	public void click_on_Cash_On_Delivery() throws Throwable {
		// Object that will invoke all the methods from  MiceHardWare class
				 MiceHardWare mice = new  MiceHardWare(driver);
				 mice.clickOnCashOnDelivery().click();
				 
	}

	@When("^Click Continue$")
	public void click_Continue() throws Throwable {
		MiceHardWare mice = new  MiceHardWare(driver);
		mice.clickOnContinueClick().click();
	}

	@When("^click on PayNow$")
	public void click_on_PayNow() throws Throwable {
		// Object that will invoke all the methods from  MiceHardWare class
				 MiceHardWare mice = new  MiceHardWare(driver);
				 mice.clickOnPayNow().click();
	}

	@Then("^get the confirmation text$")
	public void get_the_confirmation_text() throws Throwable {
		// Object that will invoke all the methods from  MiceHardWare class
		softwareAction abcd = new softwareAction(driver);
		System.out.println(abcd.confirmation().getText());
		System.out.println(abcd.confirmationOforder().getText());
	}
}
