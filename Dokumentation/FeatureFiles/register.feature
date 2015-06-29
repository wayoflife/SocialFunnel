Feature: register
  
  As an unregistered user
  I want to register an account
  so that I can use the website

  @Runme
  Scenario: enter correct details and register
    Given I am not registered
    And I am on the "Registrieren" page
    When I enter "test@gmail.com" in the field "Email"
    And I enter "daniel" in the field "FirstName"
    And I enter "betsche" in the field "SecondName"
    And I enter "password" in the field "Password"
    And I enter "password" in the field "Password2"
    And I enter "22.05.1989" in the field "Geburtstag"
    And I check "Nutzungsbedingungen"
    And I press the "Registrieren" button
    Then I am on the "Login" page
    And I receive a "confirmation" message

  Scenario: enter incorrect details and fail to register
    Given I am not registered
    And I am on the "Registrieren" page
    When I enter "test@gmail.com" in the field "Email"
    And I enter "daniel" in the field "FirstName"
    And I enter "betsche" in the field "SecondName"
    And I enter "password" in the field "Password"
    And I enter "falsch" in the field "Password2"
    And I enter "22.05.1989" in the field "Geburtstag"
    And I check "Nutzungsbedingungen"
    And I press the "Registrieren" button
    Then I receive a "error" message