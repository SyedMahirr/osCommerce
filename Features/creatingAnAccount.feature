@creating_An_Account
Feature: User Creating an Account 
In order to Create an Account 
As a visiting User
I want to Click Account, Under  New User Click on the Continue Button, Select Gender, Type First Name, Last Name, Date of Birth, Email Address, Street Address, Post Code, City, State, Drop and Select the Country, Enter Telephone Number, Check Newsletter, Create a password, and Confirm Password, then I want to get the confirmation text

Scenario: Positive

Given OS Commerce Site
When Click Account
And Under  New User Click on the Continue Button 
And Select Gender 
And Type First Name 
And Type Last Name 
And Provide Date of Birth 
And Enter Email Address 
And Enter Street Address
And type Post Code 
And Type City
And Type State
And Drop and Select the Country
And  Enter Telephone Number
And Check Newsletter
And Create a password
 And Confirm Password
And Click on Continue to get to the next page
 Then I want to get the confirmation text


