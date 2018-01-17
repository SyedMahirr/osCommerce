package com.my.POMFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QsearchReadReview {

	WebDriver driver;

	public QsearchReadReview(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locating Elements
	@FindBy(xpath = ".//*[@name=\"keywords\"]")
	WebElement clickOnQuickFind;
	
	@FindBy(linkText = "Microsoft Internet Keyboard PS/2")
	WebElement clickMSKeyboard;
	
	@FindBy (id = "tdb5")
	WebElement clickReview;
	
	@FindBy (className = "contentText")
	WebElement readReview;
	
	
	//Methods
	
	public WebElement searchKeyboard() {
		return clickOnQuickFind;
	}
	
	public WebElement clickinOnMSKeyBoard() {
		return clickMSKeyboard;
	}
	
	public WebElement viewReview() {
		return clickReview;
	}
	
	public WebElement readingReview() {
		return readReview;
	}
}
