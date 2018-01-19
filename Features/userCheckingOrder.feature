@userCheckingOrder 
Feature: User Checking Order status 

	In order to view Order Status 
	As a Valid User 
	I want to Log in to my Account, Click On View the orders I have made, CLick on my order 46196, and view the status

	Scenario: Positive
	
	Given Log In page 
	When Log into the Account
	And  Click On View the orders I have made
	And CLick on my order 46196
 	Then view the status
 	
 	
	