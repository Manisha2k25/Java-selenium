
Feature: Home Page Functionality

Scenario: Verify title of Homepage
Given User is on HomePage
Then page title should be "Your Store"

Scenario: Verify Shopping cart icon present
Given User is on HomePage
Then shopping cart icon should be displayed

Scenario: Verify brand name present
Given User is on HomePage
When User clicks on iphone

Then user should be able to see brand name "Apple"

Scenario Outline: Verify user able to login 
Given User is on HomePage
When user click My account dropdown
And user click on login option
And user enters "<Username>" and "<Password>"
And user click on Login button 
Then user should be redirected to the "My Account" page

Examples:
|Username|Password|
|virajvelocity@gmail.com|Velocity@1234|

