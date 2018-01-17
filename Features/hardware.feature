@Hardware_Items 
Feature: Adding Hardware Item  

	In order to purchase a KeyBoard
	As an user 
	I want to Log into the account, click on Hardware, Click on Mice, Selecting USB, Click on Buy Now, Click on Check Out,
	Choose the Flat Rate shipping, Add Comments, Click Continue, Click on Cash On Delivery, Click Continue, click on PayNow, and get the confirmation.

Scenario: Positive 

	Given OS-Commerce Webpage 
	When click on Hardware
	And Click on Mice
	And CLick on BuyNow 
	And Selecting USB
	And Click on Add to Cart
	And Click on Checkout 
	And Loginto the Account
	And Remove Item that was previously there
	And Choose the Best Way shipping 
	And Add Comments 
	And Click on Cash On Delivery 
	And Click Continue 
	And click on PayNow 
	Then get the confirmation text 
	
