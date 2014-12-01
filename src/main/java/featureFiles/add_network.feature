Feature: add network

As a logged in user
I want to add a network to my list

Scenario: Add existing Network to list
	Given: I am on the "Netzwerke" Page
	And I have an existing and active network account
	And I press the "neues Netzwerk" button
	And I choose the "Netzwerk Typ"
	And I enter my "mail" in the field "Email"
	And I enter my "password" in the field "Passwort"
	And I check the "Aktiv" checkbox
	Then the Network will be tested for validity
	And added to my networks list

	Scenario: Add nonexisting Network to list
	Given: I am on the "Netzwerke" Page
	And I have an existing and active network account
	And I press the "neues Netzwerk" button
	And I choose the "Netzwerk Typ"
	And I enter my "mail" in the field "Email"
	And I enter my "password" in the field "Passwort"
	And I check the "Aktiv" checkbox
	Then the Network will be tested for validity
	And I receive an error message that the network could not be connected