package com.my.POMFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class invalidInfo {

	WebDriver driver;

	public invalidInfo (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//*[@id=\"tdb3\"]/span[2]")
	WebElement MyACCOUNT;
	
	@FindBy (xpath = ".//*[@id=\"bodyContent\"]/table/tbody/tr/td")
	WebElement gettingError;
	
	
	
	public WebElement clickOnAccount() {
		return MyACCOUNT;
	}
	
	public WebElement ErrorLog() {
		return gettingError;
	}
	
}
