Feature: Search
  Description: User logs in to the travel website

  @S
  Scenario: User searches items successfully (Happy Path)

    Given User is on the shopping website
    When User clicks on search field
    And User enters the name of product they are looking for
    And User click on search button
    Then confirm that an appropriate product name message has appeared

