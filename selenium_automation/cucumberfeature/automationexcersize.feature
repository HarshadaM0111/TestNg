Feature: Automation exercise sign up
 

Scenario: verify new user can redirect to create account page after signup
		Given Launch automation exercise website
		When user enter the name and email address
		Then New user should redirect to create account page
		