Feature: Registration
  Description: User logs in to the travel website


  Scenario: User succesfully registers (Happy path)

    Given   User is on the registration page
    When  User enters a valid details into fields
    And   User clicks on submit button
    Then  confirm that an appropriate username message has appeared, after account is created



