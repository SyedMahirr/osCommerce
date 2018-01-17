package com.my.POMFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactUsForm {

	WebDriver driver;

	// Contructor
	public contactUsForm(WebDriver driver) {

		this.driver = driver;

		// POM Initializer
		PageFactory.initElements(driver, this);

	}// End of Constructor

	// locator
	@FindBy(linkText = "Contact Us")
	WebElement contactUsClick;

	@FindBy(xpath = ".//*[@name=\"name\"]")
	WebElement enterFullName;

	@FindBy(xpath = ".//*[@name=\"email\"]")
	WebElement enterEmail;

	@FindBy(xpath = "//TEXTAREA[@name='enquiry']")
	WebElement enterEnquiry;
	
	@FindBy (xpath = ".//*[text()=\"Continue\"]")
	WebElement clickOnContinue;

	@FindBy(className = "contentText")
	WebElement confirmation;
	
	// Method
	public WebElement clickingOnContractUs() {
		return contactUsClick;
	}

	public WebElement enterFullName() {
		return enterFullName;
	}

	public WebElement enterEmail() {
		return enterEmail;
	}
	
	
	public WebElement enterEnquiry() {
		return enterEnquiry;
	}
	
	public WebElement clickOnContinue() {
		return clickOnContinue;
	}
	
	public WebElement confirmationText() {
		return confirmation;
	}
	
	
}
