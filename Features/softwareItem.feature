@software_Action
Feature: Adding Item in the Cart and Puchase it 

	In order to purchase a KeyBoard
	As an user 
	I want to Log into the account, click on Hardware, Click on KeyBoard, Click on Buy Now, Click on Check Out,
	Choose the Flat Rate shipping, Add Comments, Click Continue, Click on Cash On Delivery, Click Continue, click on PayNow, and get the confirmation.

Scenario: Positive 

	Given OS-Commerce Webpage. 
	When Click on Software
	And Click On Strategy  
	And Click on Buy Now. 
	And Click on Check Out. 	
	And Log into the account. 
	And Choose the Flat Rate shipping. 
	And Add Comments.
	And Click Continue.
	And Click on Cash On Delivery. 
	And Click Continue.
	And click on PayNow. 
	Then get the confirmation text. 
	
