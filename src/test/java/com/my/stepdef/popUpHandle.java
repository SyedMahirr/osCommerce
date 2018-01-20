package com.my.stepdef;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.my.POMFactory.PopUp;
import com.my.POMFactory.signingInAndLoggingOut;
import com.my.POMFactory.softwareAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class popUpHandle {

	WebDriver driver;
	

@Given("^OS--Commerce Site$")
public void os_Commerce_Site() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://demo.oscommerce.com/");
}

@When("^User Clicks On the My Account$")
public void user_Clicks_On_the_My_Account() throws Throwable {
	// Object
			signingInAndLoggingOut signOutAndLogOut = new signingInAndLoggingOut(driver);
			signOutAndLogOut.clickOnMyAccount().click();
}

@When("^log in to my acount, click on DVD_Movies, Click on Drama$")
public void log_in_to_my_acount_click_on_DVD_Movies_Click_on_Drama() throws Throwable {
	softwareAction abcd = new softwareAction(driver);
	abcd.emailEnter().sendKeys("abcdwwwwqqqqqq22345674588888889555@yahoo.com");
	abcd.passwordEnter().sendKeys("abc123456");
	
	abcd.signIn().click();
	
	PopUp dvd = new PopUp(driver);
	dvd.clickOnDVD().click();
}

@When("^Click On Red-Corner Movie$")
public void click_On_Red_Corner_Movie() throws Throwable {
 
	
	PopUp dvd = new PopUp(driver);
	dvd.clickDrama().click();
}

@When("^Click BUY now, Click on check-out$")
public void click_BUY_now_Click_on_check_out() throws Throwable {
	PopUp dvd = new PopUp(driver);
	dvd.clickBuyNow().click();
	dvd.clickCheckOut().click();
}

@When("^Click on Continue$")
public void click_on_Continue() throws Throwable {
	PopUp dvd = new PopUp(driver);
	dvd.clickOnConti().click();
	
}

@When("^Click On Continue$")
public void click_On_Continue() throws Throwable {
	
}

@Then("^Handle Pop-up\\.$")
public void handle_Pop_up() throws Throwable {
	
	PopUp dvd = new PopUp(driver);
	dvd.clickOnConti().click();
	
	Alert alt= 	driver.switchTo().alert();
	
	
	Thread.sleep(2000);
	// getting the warning text
	System.out.println(alt.getText());
	
	// this will click on okay 
		alt.accept();
}

}
