@AlertHandle 
Feature: Handling Pop-Ups 

	In order to handle Pop-ups
	As an Site Admin 
	I want to log in to my acount, click on DVD_Movies, Click on Drama, Click On Red-Corner Movie, Click BUY now, Click on check-out, Click on Continue, Click On Continue, And Handle Pop-up. 

Scenario: Positive 

	Given OS--Commerce Site 
	When User Clicks On the My Account 
	And log in to my acount, click on DVD_Movies, Click on Drama 
	And Click On Red-Corner Movie 
	And Click BUY now, Click on check-out 
	And Click on Continue 
	And Click On Continue 
	Then Handle Pop-up. 
