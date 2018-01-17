package com.my.POMFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class softwareAction {

	WebDriver driver;

	public softwareAction(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = ".//*[text()=\"Software->\"]")
	WebElement clickOnSoftware;
	
	@FindBy (xpath = ".//*[text()=\"Strategy\"]")
	WebElement clickOnActions;
	
	@FindBy (xpath = "(//SPAN[@class='ui-button-text'][text()='Buy Now'][text()='Buy Now'])[2]")
	WebElement clickOnBuyNow;
	
	@FindBy (id = "tdb4")
	WebElement addToCart;
	
	
	@FindBy (id = "tdb5")
	WebElement checkOUt;
	
	@FindBy (xpath = "//*[@id=\"loginModules\"]/div[1]/div/form/table/tbody/tr[1]/td[2]/input")
	WebElement email;
	
	@FindBy (xpath = "//*[@id=\"loginModules\"]/div[1]/div/form/table/tbody/tr[2]/td[2]/input")
	WebElement password;
	
	
	@FindBy (xpath = "//*[@id=\"tdb1\"]")
	WebElement signIn;
	
	
	@FindBy (xpath = "//TEXTAREA[@name='comments']")
	WebElement comment;

	
	@FindBy(xpath = ".//*[text()=\"Continue\"]")
	WebElement continueClick;
	
	// Error 
	@FindBy (xpath = "(//INPUT[@type='radio'])[6]")
	WebElement PaymentCash;
	
	@FindBy (xpath = ".//*[text()=\"Pay Now ($104.99)\"]")
	WebElement PayingNow;
	
	@FindBy (xpath = ".//*[@class=\"contentText\"]")
	WebElement Confirmation;
	
	
	@FindBy (xpath = ".//*[@name=\"order\"]/div[1]/div[2]")
	WebElement ConfirmationOrder;
	
	public WebElement software() {
		return clickOnSoftware;
	}
	
	public WebElement action() {
		return clickOnActions;
	}
	
	public WebElement BuyNow() {
		return clickOnBuyNow;
	}
	
	public WebElement Cart() {
		return addToCart;
	}
	
	public WebElement Checkout() {
		return checkOUt;
	}
	
	public WebElement emailEnter() {
		return email;
	}
	
	public WebElement passwordEnter() {
		return password;
	}
	
	public WebElement signIn() {
		return signIn;
	}
	
	public WebElement commentGive() {
		return comment;
	}
	
	public WebElement clickOnContinue() {
		return continueClick;
	}
	
	public WebElement cashOnDelivery() {
		return PaymentCash;
	}
		
	public WebElement payNow() {
		return  PayingNow;
	}
	
	public WebElement confirmation() {
		return  Confirmation;
		
	}
	public WebElement confirmationOforder() {
		return  ConfirmationOrder;
		
	}
	
}
