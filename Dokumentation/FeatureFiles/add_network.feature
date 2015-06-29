Feature: add network
  
  As a logged in user
  I want to add a network to my list

  Scenario: Add existing Network to list
    Given I am logged in
    And I go to "MeineNetzwerke"
    And I press the "NeuesNetzwerk" button
    And I enter "Facebook" in the field "Netzwerk"
    And I enter "dbetsche@gmail.com" in the field "Email"
    And I enter "password" in the field "Password"
    And I check "Aktiv"
    Then new Network will be saved