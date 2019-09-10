Feature: Compare

  Scenario: compare to dresses
    Given the user on the dresses page
    When the user adds two dresses to compare
    And click on compare button
    Then redirect the user to compare products page