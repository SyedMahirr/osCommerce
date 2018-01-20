@Negative_Login_Info 
Feature: Negative LogIn information 
	In order to check the log in functionality
	As an Admin
	I want to Click on the My Account, Enter inValid Email Id, 
	Enter Invalid Password, get the Warning

	Scenario: Nagative
	
	Given Click on the My Account
	When Enter inValid Email Id

	And Enter Invalid Password
	And Click on Sign In 
	And get the Warning
	Then take a screenshot