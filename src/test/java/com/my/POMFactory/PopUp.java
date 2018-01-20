package com.my.POMFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUp {

	WebDriver driver;

	public PopUp(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText = "DVD Movies->")
	WebElement LinktextClick;
	
	@FindBy (xpath = ".//*[text()=\"Drama\"]")
	WebElement clickDrama;
	
	@FindBy (id = "tdb7")
	WebElement clickBuyNow;
	
	@FindBy (xpath = ".//*[text()=\"Checkout\"]")
	WebElement clickCheckOut;
	
	@FindBy(id = "tdb6")
	WebElement clickOnConti;
	
	
	
	public WebElement clickOnDVD() {
		return LinktextClick;
	}
	
	public WebElement clickDrama() {
		return clickDrama;
	}
	
	public WebElement clickBuyNow() {
		return clickBuyNow;
	}
	
	public WebElement clickCheckOut() {
		return clickCheckOut;
	}
	
	public WebElement clickOnConti() {
		return clickOnConti;
	}
	
}
