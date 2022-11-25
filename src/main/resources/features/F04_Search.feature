@smoke
  Feature: F04_Search | User could search for products using keywords or SKU
    Scenario: user search for product using keyword
        When user search for item with keyword "Nokia Lumia 1020"
        And user click on search button
        Then user should see the search result

    Scenario: user search for product using SKU
      When user type a Product Sku "AP_MBP_13"
      And user click on the search button
      And user click on the shown product
      Then user should see the result of the SKU search