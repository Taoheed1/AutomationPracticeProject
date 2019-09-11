Feature: Registration
  Description: User logs in to the travel website

# @SmokeTesting
  Scenario: User succesfully registers (Happy path)

    Given User is on the registration page
    When User enters a valid email
    And  User clicks on create account button
    Then redirect Them into detail page
    When user enters valid details in to fields
    Then confirm that an appropriate username message has appeared

#  @SmokeTesting
  Scenario: User registers with a registered email
   Given User is on the registration page-two
   When User enters the same email for registration-two
   And User clicks on create account button-two
   Then present an error message

#  @SmokeTesting
   Scenario: User registers with empty email field
     Given User is on the registration page-three
     When User leaves the email field blank
     And User clicks on create account button-three
     Then present an error message-three

#    @SmokeTesting
    Scenario:User registers with a valid zip/postal code, written in the right format
      Given User is on the registration page-four
      When User enters a valid email-four
      And User clicks on create account button-four
      And user fills in all the fields
      Then confirm that an error message has appeared for the postcode format

