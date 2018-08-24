@fclogin2
Feature: Free CRM Login

Scenario: Login Test

Given user is on Login page
When user enters "brbgouda" and "fc@123"
And user clicks on login button
Then user is on home page