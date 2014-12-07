Feature: login
  
  As a registered user
  I want to log in to my account
  so that I can use the website

  Scenario: enter correct details and login
    Given I am not logged in
    When I enter my "email" in the field "Emailadresse"
    And I enter my "password" in the field "Passwort"
    And I press the "Anmelden" button
    And both are stored in the ldap-system
    Then my "userdata" will be loaded
    And I am still on the Page

  Scenario: enter invalid details and login
    Given I am not logged in
    When I enter my "email" in the field "Emailadresse"
    And I enter my "password" in the field "Passwort"
    And I press the "Anmelden" button
    And one of them is wrong
    Then I will receive and error message to check my input
