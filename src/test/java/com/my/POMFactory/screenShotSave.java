package com.my.POMFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class screenShotSave {

	WebDriver driver;

	// Contructor
	public screenShotSave(WebDriver driver) {

		this.driver = driver;

		// POM Initializer
		PageFactory.initElements(driver, this);

		
	}// End of Constructor

	@FindBy(linkText = "Samsung Galaxy Tab")
	WebElement clickOnSamsungGalaxy;

	@FindBy(id = "piGalImg_1")
	WebElement clickonImage;
	
	
	public WebElement clickOnitem() {
		return clickOnSamsungGalaxy;
	}
	
	public WebElement clickOnImage() {
		return  clickonImage;
	}

}
