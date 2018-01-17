package com.my.POMFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MiceHardWare {

	WebDriver driver;

	public MiceHardWare(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

}
