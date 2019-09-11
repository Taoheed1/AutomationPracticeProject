Feature: Shopping Cart
  Description: User is able to view their shopping cart

  @SmokeTesting @Old
  Scenario: User wants to view their shopping cart
    Given a user is on the home page
    When  a user clicks on the shopping cart
    Then the user should be taken to the shopping cart page

  @SmokeTesting @Old
  Scenario: Item(s) added to cart with correct price total
    Given user is on a product page
    When the user clicks "add to cart" button
    Then the user should see that product within their shopping cart

  @SmokeTesting @Old
  Scenario: User edits product quantity within cart
    Given user is viewing the shopping cart page
    When the user clicks the "+" button on a product to add another item to the basket
    Then the total number of products within the basket should increase

  @SmokeTesting @New
  Scenario: User wishes to remove item from cart via the dropdown
    Given a user has added items to their cart
    When the user clicks the "x" button on the dropdown next to the item
    Then the item should be cleared from the shopping cart

  @SmokeTesting @New
  Scenario: User wishes to add multiple items to shopping cart
    Given user has added one item to the cart and is at the cart page
    When the user decides to go and find another item to add to cart
    Then when the user returns to the cart the correct number and total price of items appear