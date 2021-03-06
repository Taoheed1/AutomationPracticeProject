Feature: Payment
  Description: User is able to pay for products currently in their shopping basket and if desired specify payment methods
  and delivery or billing addresses

  Background: User is logged in and has items in their basket
    Given that I navigate to the register page
    And I register an account
    When I add an item to the basket
    And I click to proceed to payment
    Then I should be taken to the address page

  @TestUnacceptedTCs
  Scenario: Terms and condition have not been accepted
    Given that I am on the address page
    When I go to the shipping page
    And the terms of service radio button has not been clicked
    Then I should see an alert when I try to continue

  @TestAcceptedTCs
  Scenario: Terms and conditions have been accepted
    Given that I am on the address page
    When I go to the shipping page
    And the terms of service button has been clicked
    Then I should be directed to the next page

  @Test3
  Scenario: User is able to check price of delivery item
    Given that I am on the shipping page
    When I go to the payment page
    Then I should be able to see the price of the delivery

  @TestBankWire
  Scenario: User pays using bank wire
    Given that I am on the payment page
    When I click to pay by bank wire
    Then I should see an order summary saying that I chose to pay by bank wire

  @TestCheque
  Scenario: User pays using cheque
    Given that I am on the payment page
    When I click to pay by cheque
    Then I should see an order summary saying that I chose to pay by cheque

  @TestConfirmation
  Scenario: User gets confirmation message after confirming order
    Given that I am on the payment page
    And I have chosen a payment method
    When I confirm my order
    Then I should see a confirmation message