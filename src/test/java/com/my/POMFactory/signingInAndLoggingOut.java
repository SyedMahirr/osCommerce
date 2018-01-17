package com.my.POMFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signingInAndLoggingOut {
	
	WebDriver driver;

	public signingInAndLoggingOut(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	// All the Loating Elements for logging into the account

	@FindBy(xpath = "//SPAN[@class='ui-button-text'][text()='My Account']")
	WebElement clickOnMyAccount;

	@FindBy(name = "email_address")
	WebElement emailAddress;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(className = "ui-button-text")
	WebElement signInButton;
	
	
	@FindBy(xpath = "//SPAN[@class='ui-button-text'][text()='Log Off']")
	WebElement logOut;


	// All the methods

	public WebElement clickOnMyAccount() {
		return clickOnMyAccount;

	}

	public WebElement enterEmailAddress() {
		return emailAddress;
	}

	public WebElement enterPassword() {
		return password;
	}

	public WebElement clickingOnSignInButton() {
		return signInButton;
	}

	// Error Report Bug
	public WebElement loggingOUT() {
		return logOut;
	}
}
