@Signin_Out
Feature: checking Sign In and Out 

In order to check the sign in and sign out function
As a valid user
I want to hover my mouse curser to the sign in section, 
click on sign in now,  sign in with gmail account. 

Scenario Outline: Positive

When hover my mouse curser to the sign in section
And click on sign in now
Then sign in with Gmail account<Account>. 

Examples: 
|Account| 
|alamsyed1207@gmail.com|

Scenario Outline: Negative 
When hover my mouse curser to the sign in section
And click on sign in now
Then sign in with Facebook account<Account>. 

Examples: 
|Account| 
|alamsyed@gmail.com|

