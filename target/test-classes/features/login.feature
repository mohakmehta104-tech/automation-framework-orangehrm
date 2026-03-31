Feature: Login Functionality

Scenario: Successful Login
Given user is on login page
When user enters valid username and password
And clicks on login button
Then user should be navigated to dashboard
