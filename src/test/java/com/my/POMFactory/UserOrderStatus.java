package com.my.POMFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserOrderStatus {

	
	WebDriver driver;

	public UserOrderStatus(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy (xpath = "//SPAN[@class='ui-button-text'][text()='My Account']")
	WebElement myAccount;
	
	@FindBy(linkText = "View the orders I have made.")
	WebElement viewOrder;
	
	@FindBy(xpath = ".//*[text()=\"View\"]")
	WebElement clickOnVIew;
	
	@FindBy (id = "bodyContent")
	WebElement confirmation;
	
	public WebElement myAccount() {
		return myAccount;
	}
	
	public WebElement clickOrder() {
		return viewOrder;
	}
	
	public WebElement clickOnView() {
		return clickOnVIew;
	}
	
	public WebElement Confirmation() {
		return confirmation;
	}
	
	
}
