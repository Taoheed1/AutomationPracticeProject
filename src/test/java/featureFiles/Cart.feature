Feature: Shopping Cart
  Description: User is able to view their shopping cart

  @SmokeTesting
  Scenario: User wants to view their shopping cart
    Given a user is on the home page
    When  a user clicks on the shopping cart
    Then the user should be taken to the shopping cart page
