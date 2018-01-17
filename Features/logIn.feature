@log_In 
Feature: User Logging into the Acount and Logging out 
	In order to Enter to the Account 
	As an User
	I want to Click on the My Account, Enter Email Address, Enter Password, Clicking on Sign In, And Log-out Successfully 

Scenario: Positive 

	Given OS Commerce Web page 
	When  Clicking on the My Account 
	And Enter Valid Email Address 
	And Enter Password 
	Then Clicking On Sign-In Button
	
	
