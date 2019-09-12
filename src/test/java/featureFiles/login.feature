Feature: login into account
  Description: User able to log into the account

  Background:
    Given user opens the chrome and on the login page

  Scenario: User types wrong username
    When login with an invalid username
    Then authentication errorOne will display
  @JubinTest
  Scenario: User types wrong password
    When login with an invalid password
    Then authentication errorTwo will display

  Scenario: User forgets username
    When user clicks on forget password
    And user provides username and retrive password
    Then sends the confirmation email

  Scenario: User wants to login to account (successfully)
    When  login with valid username and password
    Then the user should see username in the account page

  Scenario: User logout
    When user clicks logout
    Then user account should logout





