@contact_us_form
Feature: Contacting Customer Representative for an order placed

In order to contact the customer representative
As a valid account holder
I want to click on Contact US, enter my Full Name, Enter Email Address, and Type in my Concern in Enquiry

Scenario: Positive

Given OS-Commerce Site
When click on Contact US
And  enter my Full Name
And Enter my Email Address
And Type  my Concern in Enquiry
Then Recieve the confirmation text
 