Feature: Category

  Scenario: Navigate to Women section
    Given the user on home page
    When the user clicks on Women tab
    Then redirect them to women category

  Scenario: Navigate to Dresses section
    Given the user on home page
    When the user clicks on Dresses tab
    Then redirect them to Dresses category