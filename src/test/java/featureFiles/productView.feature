Feature: Product View

  Background:
    Given the user on home page

  Scenario: get quick view pop up
    When the user click on quick view for a product
    Then the pop up should present details about that product

  Scenario: redirect to product page
    When the user clicks on a product
    Then redirect to the product page

  Scenario: redirect to quick view pop up
    When the user clicks on eye symbol for a product
    Then the pop up should present details about that product