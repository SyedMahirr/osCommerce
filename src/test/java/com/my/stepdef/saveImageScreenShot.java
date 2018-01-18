package com.my.stepdef;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.my.POMFactory.screenShotSave;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class saveImageScreenShot {

	WebDriver driver;

	@Given("^OS-Commerce Home Page$")
	public void os_Commerce_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demo.oscommerce.com/");
	}

	@When("^click on the Samsung Galaxy Tab$")
	public void click_on_the_Samsung_Galaxy_Tab() throws Throwable {
		screenShotSave save = new screenShotSave(driver);

		save.clickOnitem().click();

	}

	@When("^Click on the Image$")
	public void click_on_the_Image() throws Throwable {
		screenShotSave save = new screenShotSave(driver);

		save.clickOnImage().click();
	}

	@When("^take a screen shot$")
	public void take_a_screen_shot() throws Throwable {

	}

	@When("^Right Click$")
	public void right_Click() throws Throwable {
		screenShotSave save = new screenShotSave(driver);
		Actions click = new Actions(driver);
		click.contextClick(save.clickOnImage()).build().perform();
		click.sendKeys(Keys.CONTROL, "s").perform();
		Robot robot;
        robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000); 
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL); //paste the copied string into the dialog box
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER); //enter    
		

	}

	@Then("^Save Image as$")
	public void save_Image_as() throws Throwable {
		
	}
}
