Feature: Payment
  Description: User is able to pay for products currently in their shopping basket and if desired specify payment methods
  and delivery or billing addresses

  Background:
    Given that I am a user

Scenario: User is able to confirm the purchase of items in their basket

  Given that I am a user
  When I have items in my basket
  And I click proceed to checkout
  Then I should see the deliveries page

#  Kind of Important
  Given that I am a user
  When I am on the shipping page
  And the terms of service radio button has not been clicked
  Then I should see an alert

#  Kind of Important
  Given that I am a user
  When I am on the shipping page
  And the terms of service button has been clicked
  Then I should

#  Meh
  Given that I am a user
  When I am on the shipping page
  And I click to read the terms of service
  Then the terms of service page should appear

#  Meh
  Given that I am a user
  When I am on the shipping page
  Then I should be able to see the price of the delivery

#  Important
  Given that I am a user
  When I am on the payment page
  Then I should see the item that I added to the basket

#  Important
  Given that I am a user
  When I am on the payment page
  Then the total products should be equal to the value of the items in the basket

  #  Kind of Important
  Given that I am a user
  When I am on the payment page
  And I click to pay by bank wire
  Then I should see an order summary

  #  Kind of Important
  Given that I am a user
  When I am on the payment page
  And I click to pay by cheque
  Then I should see an order summary

#  Important
  Given that I am a user
  When I confirm my order
  Then I should see a confirmation message