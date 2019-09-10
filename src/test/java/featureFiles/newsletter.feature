Feature: Newsletter

  Background:
    Given the user on home page

  Scenario: enter a valid email
    When the user enters a valid email
    Then present a success alert

  Scenario: enter an invalid email
    When the user enters an invalid email
    Then present an error alert

  Scenario: enter a registered email
    When the user enters a registered email
    Then present a danger alert