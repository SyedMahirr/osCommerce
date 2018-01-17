@Quick_find_Item_Read_Review 
Feature: Visitor Quickly Finding Item 

	In order to find a product by searching on Quick Find Search Bar
	As a site Visitor
	I want to Navigate to the Site, click on Quick Find Search Bar, Type Keyboard, Hit Enter, Select the Microsoft Internet Keyboard PS/2, click on Reviews, Read the review that is present 

Scenario: Positive
 
	Given OS-Commer site 
	When Type Keyboard 
	And Hit Enter 
	And Select the Microsoft Internet Keyboard PS/2 
	And click on Reviews 
	Then Read the review that is present 
	
