@smoke
Feature: F05_Hover | user could hover on a product and choose sub category
  Scenario: user select sub product from the main categories using hover actions
    When user hover over computers products icon
    And user click on the subcategory Notebooks
    Then user should be directed to Notebooks page
