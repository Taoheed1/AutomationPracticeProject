Feature: Registration
  Description: User logs in to the travel website

  @SmokeTesting
  Scenario: User succesfully registers (Happy path)

    Given User is on the registration page
    When User enters a valid email
    And  User clicks on create account button
    Then redirect Them into detail page
    When user enters valid details in to fields
    Then confirm that an appropriate username message has appeared

  @SmokeTesting
  Scenario: User registers with a registered email
    Given User is on the registration page-two
    When User enters the same email for registration-two
    And User clicks on create account button-two
    Then present an error message





