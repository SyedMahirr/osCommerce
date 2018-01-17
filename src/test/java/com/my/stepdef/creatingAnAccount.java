package com.my.stepdef;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.my.POMFactory.creatingAccount;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class creatingAnAccount {

	static WebDriver driver;

	@Given("^OS Commerce Site$")
	public void os_Commerce_Site() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeWebdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demo.oscommerce.com/");
	}

	@When("^Click Account$")
	public void click_Account() throws Throwable {

		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);

		abc.clickOnMyAccount().click();

	}

	@When("^Under  New User Click on the Continue Button$")
	public void under_New_User_Click_on_the_Continue_Button() throws Throwable {

		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		abc.clickOnContinue().click();

	}

	@When("^Select Gender$")
	public void select_Gender() throws Throwable {

		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		abc.clickOnGender().click();

	}

	@When("^Type First Name$")
	public void type_First_Name() throws Throwable {

		Properties prop = new Properties();

		FileInputStream pointFile = new FileInputStream(
				"C:\\Users\\alams\\OS-Commerce\\src\\test\\java\\com\\my\\information\\credentials.properties");

		prop.load(pointFile);

		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);

		abc.enterFirstName().sendKeys(prop.getProperty("FirstName"));

	}

	@When("^Type Last Name$")
	public void type_Last_Name() throws Throwable {
		Properties prop = new Properties();

		FileInputStream pointFile = new FileInputStream(
				"C:\\Users\\alams\\OS-Commerce\\src\\test\\java\\com\\my\\information\\credentials.properties");

		prop.load(pointFile);

		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);

		abc.enterLastName().sendKeys(prop.getProperty("LastName"));
	}

	@When("^Provide Date of Birth$")
	public void provide_Date_of_Birth() throws Throwable {
		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		abc.ClickdateOfBirth().click();
		// Selecting Month March
		abc.SelectdateOfBirth("2");
		// Selenting Year
		abc.selectYear("1993");
		// selecting date
		abc.Date().click();

	}

	@When("^Enter Email Address$")
	public void enter_Email_Address() throws Throwable {
		creatingAccount abc = new creatingAccount(driver);
		abc.enteringEmail().sendKeys("abcdwwwwqqqqqq22345674588888889555@yahoo.com");
	}

	@When("^Enter Street Address$")
	public void enter_Street_Address() throws Throwable {
		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		abc.enteringStreet().sendKeys("Grand Street");

	}

	@When("^type Post Code$")
	public void type_Post_Code() throws Throwable {
		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		abc.enteringZipCode().sendKeys("11543");
	}

	@When("^Type City$")
	public void type_City() throws Throwable {
		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		abc.enteringCity().sendKeys("Hi Tech");
	}

	@When("^Type State$")
	public void type_State() throws Throwable {
		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		abc.enteringState().sendKeys("NY");
	}

	@When("^Drop and Select the Country$")
	public void drop_and_Select_the_Country() throws Throwable {
		creatingAccount abc = new creatingAccount(driver);
		abc.selectCOuntry("United States");
	}

	@When("^Enter Telephone Number$")
	public void enter_Telephone_Number() throws Throwable {
		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		abc.enteringTelephone().sendKeys("123-4567-8965");
	}

	@When("^Check Newsletter$")
	public void check_Newsletter() throws Throwable {
		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		abc.ClickingonNewsletter().click();
	}

	@When("^Create a password$")
	public void create_a_password() throws Throwable {
		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		abc.enteringPassword().sendKeys("abc123456");
	}

	@When("^Confirm Password$")
	public void confirm_Password() throws Throwable {
		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		abc.enteringPasswordConfirmation().sendKeys("abc123456");
	}

	@When("^Click on Continue to get to the next page$")
	public void click_on_Continue_to_get_to_the_next_page() throws Throwable {
		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		abc.clickOnContinue().click();
	}

	@Then("^I want to get the confirmation text$")
	public void i_want_to_get_the_confirmation_text() throws Throwable {
		// Object for geting the method from Creating Account CLass
		creatingAccount abc = new creatingAccount(driver);
		// Gething the COnfirmation Text
		System.out.println("This is the Confirmation Text: " + abc.confirmationPage().getText());
	}

}
