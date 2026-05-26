
Feature: Gmail Login

Scenario: verify gmail login successfull by providing  valid credential
		Given user should be registerd withvalid creadential
		When user enter email and password
		Then gmail login successfull
