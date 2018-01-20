package com.my.POMFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class applicationVerifications {
	
	WebDriver driver;

	public applicationVerifications(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Specials")
	WebElement clickSpecials;
	
	@FindBy(xpath = ".//*[text()=\"Cart Contents\"]")
	WebElement cartContent;
	
	public WebElement SpecialClick() {
		return clickSpecials;
	}
	
	public WebElement CartContents() {
		return cartContent;
	}


	
}
