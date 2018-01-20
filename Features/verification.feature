@Verification
Feature: Verify Applications 

In order to Verify Application 
As an Admin
I want to check the title of the page, lenght of the tittle, URL of the Page, check Manufacture Options, check Cart Content Element present, Scroll Down

Scenario: Positive

Given OS-Commerce Site

When check the title of the page
And Check the Lenght of the title 
And Check the URL
And check Cart Content Element present
And Scroll Down
And click on Specials
And  Go back 
Then Refresh The page
