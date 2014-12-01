Feature: register

As a unregistered user
I want to register an account
so that I can use the website

Scenario: enter correct details and register
	Given I am not registered
	And I am on the "Registrieren" page
	When I enter my "email" in the field "Emailadresse"
	And I enter my "password" in the field "Passwort"
	And I repeat my "password" in the field "Passwort wiederholen"
	And I enter my "birthday" in the field "Geburtstag"
	And I accept the "Nutzungsbedingungen" by checking the checkbox
	And I press the "Registrieren" button
	Then my "userdata" will be created
	And I will receive and email 
	And I will be logged into the website
	
Scenario: enter correct details and register
	Given I am not registered
	And I am on the "Registrieren" page
	When I enter my "email" in the field "Emailadresse"
	And I enter my "password" in the field "Passwort"
	And I repeat my "password" in the field "Passwort wiederholen"
	And I enter my "birthday" in the field "Geburtstag"
	And I accept the "Nutzungsbedingungen" by checking the checkbox
	And I press the "Registrieren" button
	And one of them is wrong
	Then I will receive and error message to check my input