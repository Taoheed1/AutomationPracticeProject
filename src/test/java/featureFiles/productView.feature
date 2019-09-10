Feature: Product View

  Background:
    Given the user on home page

  Scenario: get quick view pop up
    When the user click on quick view for a product
    Then the pop up should present details about that

  Scenario: redirect to product page
    When the user clicks on a product
    Then redirect to the product page