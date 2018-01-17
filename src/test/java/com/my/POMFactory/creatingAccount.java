package com.my.POMFactory;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/*In this Class there will be a CONSTRUCTOR, 
 * inside the CONSTRUCTOR, POM initializer will presented
 * All the Locating Elements for an Creating Account 
 * and Its Methods 
 */

public class creatingAccount {

	WebDriver driver;

	// Contructor
	public creatingAccount(WebDriver driver) {

		this.driver = driver;

		// POM Initializer
		PageFactory.initElements(driver, this);

	}// End of Constructor

	// BELOW, LOCATING ELEMENT FOR CLICKING ON THE MY ACCOUNT

	@FindBy(xpath = "//SPAN[@class='ui-button-text'][text()='My Account']")
	WebElement clickOnMyAccount;

	// Method for Clicking On Account
	public WebElement clickOnMyAccount() {
		return clickOnMyAccount;
	}// end of ClickOnMYAccount

	// BELOW, LOCATING ELEMENT FOR CLICKING ON Continue

	@FindBy(xpath = ".//*[text()=\"Continue\"]")
	WebElement clickOnContinue;

	// Method for Clicking On Account
	public WebElement clickOnContinue() {
		return clickOnContinue;
	}// end of ClickingOnCOntinue

	// BELOW, LOCATING ELEMENT FOR CLICKING ON Male Gender

	@FindBy(xpath = ".//*[@value=\"m\"]")
	WebElement clickOnMale;

	// Method for Select Male
	public WebElement clickOnGender() {
		return clickOnMale;
	}// end of clickOnMale

	// BELOW, LOCATING ELEMENT FOR Entering First Name

	@FindBy(name = "firstname")
	WebElement enterFirstName;

	// Method for enter First Name
	public WebElement enterFirstName() {
		return enterFirstName;
	}// end of enter firstName

	// BELOW, LOCATING ELEMENT FOR Entering Last Name

	@FindBy(name = "lastname")
	WebElement enterLastName;

	// Method for enter First Name
	public WebElement enterLastName() {
		return enterLastName;
	}// end of enter LastName

	// Below, LOCATING ELEMENT FOR Selecting DOB

	// under this it will first click on the textBox
	@FindBy(name = "dob")
	WebElement clickDOB;

	public WebElement ClickdateOfBirth() {
		return clickDOB;
	}// End of CLicking textBox

	// Below, this the locating Element for Droping down the Month Select
	@FindBy(how = How.XPATH, using = "//SELECT[@class='ui-datepicker-month']")
	WebElement dob;

	// Method for DOB- Droping down
	// Passing a String Value
	//
	public void SelectdateOfBirth(String Value) {
		// Select is a class and below there is object for all the methods in it,
		// passing the dob where locating element is contained
		Select dropDate = new Select(dob);
		// selectByValue is the method and Value- parameter is passed
		dropDate.selectByValue(Value);
	}// end of DOB

	// Below the locating element for year

	@FindBy(xpath = "//SELECT[@class='ui-datepicker-year']")
	WebElement year;

	public void selectYear(String text) {
		Select dropYear = new Select(year);
		dropYear.selectByVisibleText(text);
	}

	// Below, Clicking on the date 24 , element locate
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]/a")
	WebElement date;

	public WebElement Date() {
		return date;
	}

	// Below locating element for Email- entering

	@FindBy(name = "email_address")
	WebElement typeEmail;

	public WebElement enteringEmail() {
		return typeEmail;
	}// End of entering Email

	// Below locating element for Street- entering

	@FindBy(name = "street_address")
	WebElement typeStreet;

	public WebElement enteringStreet() {
		return typeStreet;
	}// End of entering Street

	// Below locating element for Post Code

	@FindBy(name = "postcode")
	WebElement typePostCode;

	public WebElement enteringZipCode() {
		return typePostCode;
	}// End of entering ZipCOde

	// Below locating element for City

	@FindBy(name = "city")
	WebElement typeCity;

	public WebElement enteringCity() {
		return typeCity;
	}// End of entering City

	// Below locating element for State

	@FindBy(name = "state")
	WebElement typeState;

	public WebElement enteringState() {
		return typeState;
	}// End of entering State

	// Below locating element for Country

	@FindBy(name = "country")
	WebElement selectCountry;

	public void selectCOuntry(String Text) {
		Select country = new Select(selectCountry);
		country.selectByVisibleText(Text);

	}// End of entering Country

	// Below locating element for Phone

	@FindBy(name = "telephone")
	WebElement enterPhoneNumber;

	public WebElement enteringTelephone() {
		return enterPhoneNumber;
	}// End of entering Phone

	// Below locating element for Phone

	@FindBy(name = "newsletter")
	WebElement clickNewsletter;

	public WebElement ClickingonNewsletter() {
		return clickNewsletter;
	}// End of entering Phone

	// Below, element for PAssword
	@FindBy(name = "password")
	WebElement enterPassword;

	public WebElement enteringPassword() {
		return enterPassword;
	}// End of entering Password

	// Below, element for PAssword - cONFIRM
	@FindBy(name = "confirmation")
	WebElement enterPasswordConfirmation;

	public WebElement enteringPasswordConfirmation() {
		return enterPasswordConfirmation;
	}// End of entering Password-Confirmation

	// Below Clicking on Continue

	@FindBy(xpath = ".//*[text()=\"Continue\"]")
	WebElement clickContinue;

	public WebElement enteringContinue() {
		return clickContinue;
	}// End of entering Continue

	// Below Clicking on ConfirmationPage

	@FindBy(how = How.CLASS_NAME, using = "contentContainer")
	WebElement confirmationPage;

	public WebElement confirmationPage() {
		return confirmationPage;
	}// End of entering ConfirmationPage
}
