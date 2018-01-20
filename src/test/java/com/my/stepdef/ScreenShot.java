package com.my.stepdef;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.Utils;

import com.my.POMFactory.creatingAccount;
import com.my.POMFactory.invalidInfo;
import com.my.POMFactory.softwareAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScreenShot {

	static WebDriver driver;

	@Given("^Click on the My Account$")
	public void click_on_the_My_Account() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.oscommerce.com/");

		invalidInfo inV = new invalidInfo(driver);
		inV.clickOnAccount().click();
	}

	@When("^Enter inValid Email Id$")
	public void enter_inValid_Email_Id() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.emailEnter().sendKeys("abcidwwwwqqqqqq22345674588888889555@yahoo.com");
		abcd.passwordEnter().sendKeys("abc123456");

		abcd.signIn().click();

	}

	@When("^Enter Invalid Password$")
	public void enter_Invalid_Password() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.passwordEnter().sendKeys("abc123456");

	}

	@When("^Click on Sign In$")
	public void click_on_Sign_In() throws Throwable {
		softwareAction abcd = new softwareAction(driver);
		abcd.signIn().click();

	}

	@When("^get the Warning$")
	public void get_the_Warning() throws Throwable {
		invalidInfo inV = new invalidInfo(driver);
		System.out.println("Wrong Email Error Message: " + inV.ErrorLog().getText());
				
				
	}

	@Then("^take a screenshot$")
	public void take_a_screenshot() throws Throwable {
		
		//TakesScreenshot - interFace and type cast it so that you can create an object, You cant create object of an interface
		
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		
		//give the Output as in FIle or any other extension
		
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		
		//this step will do 2 things one getting the screenShot and saving the file in the specified folder
		
		
		Utils.copyFile(source, new File("./ScreenShot/Os.png"));
		
		
		
		
	}
}
