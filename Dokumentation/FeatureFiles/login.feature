Feature: login
  
  As a registered user
  I want to log in to my account
  so that I can use the website

  Scenario: enter correct details and login
    Given I am on the "Login" page
    And I am not logged in
    When I enter "dbetsche@gmail.com" in the field "Email"
    And I enter "daniel" in the field "Password"
    And I press the "Login" button
    Then I am now on the "user" page

  Scenario: enter correct details and login
    Given I am on the "Login" page
    And I am not logged in
    When I enter "dbetsche@gmail.com" in the field "Email"
    And I enter "falsch" in the field "Password"
    And I press the "Login" button
    And I receive a "error" message
