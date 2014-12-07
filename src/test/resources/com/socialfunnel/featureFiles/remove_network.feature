Feature: remove network

As a logged in user
I want to remove a network to my list

Scenario: remove Network from my list
	Given I am logged in
	And I am on the "Netzwerke" Page
	And I press the "Netzwerk entfernen" button
	Then I will receive a dialog
	And I can choose to "abbrechen" oder "entfernen" 
	And The network will be removed from my list