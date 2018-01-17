package com.my.POMFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MiceHardWare {

	WebDriver driver;

	public MiceHardWare(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//Locating Elements
	@FindBy(linkText = "Hardware->")
	WebElement hardware;
	
	@FindBy(xpath = "(//A[@href='https://demo.oscommerce.com/index.php?cPath=1_9'])[1]")
	WebElement mice;
	
	@FindBy(xpath = "(//SPAN[@class='ui-button-text'][text()='Buy Now'][text()='Buy Now'])[1]")
	WebElement buyNow;
	
	@FindBy (name = "id[3]")
	WebElement clickDrop;
	
	@FindBy (xpath = "//SELECT[@name='id[3]']")
	WebElement selectUSB;
	
	@FindBy (xpath = "//SPAN[@class='ui-button-text'][text()='Add to Cart']")
	WebElement addCart;
	
	@FindBy (xpath = ".//*[text()=\"Checkout\"]")
	WebElement checkOut;
	
	@FindBy (xpath = ".//*[@value=\"item_item\"]")
	WebElement perItem;
	
	@FindBy (name = "comments")
	WebElement Comment;
	
	@FindBy (id = "tdb6")
	WebElement continueClick;
	
	@FindBy (xpath = ".//*[@value=\"cod\"]")
	WebElement CashOnDelivery;
	
	@FindBy (id = "tdb5")
	WebElement payNow;
	
	
	
	//Methods 
	
	public WebElement clickOnHardware() {
		return hardware;
	}
	
	public WebElement clickOnMice() {
		return mice;
	}
	
	public WebElement clickOnBuyNow() {
		return buyNow;
	}
	
	
	public WebElement clickDrop() {
		return clickDrop;
	}
	
	public void SelectUSB(String value) {
		Select dropUSB = new Select (selectUSB);
		dropUSB.selectByValue(value);
		
		
	}
	
	public WebElement clickOnAddToCart() {
		return addCart;
	}
	
	public WebElement clickOnCheckOut() {
		return checkOut;
	}
	
	public WebElement clickOnPerItem() {
		return perItem;
	}
	
	public WebElement clickOnComment() {
		return Comment;
	}
	
	public WebElement clickOnContinueClick() {
		return continueClick;
	}
	
	
	public WebElement clickOnCashOnDelivery() {
		return CashOnDelivery;
	}
	
	
	public WebElement clickOnPayNow() {
		return payNow;
	}
	
	
	
	
	
	
	
}
