@smoke
Feature: F03_Currencies | user could select different currencies

  Scenario: user could switch to euro currency
    When user select euro option
    Then euro symbol is displayed
    When user select dollar option
    Then dollar option is displayed back