@smoke
Feature: F08_Wishlist | User could add products to wishlist
  Scenario: user add product to wishlist successfully
    When user click on add to wishlist button for the product
    Then user should see the success message

  Scenario: user add product to wishlist and verify size
    When user click on add to wishlist button to add product
    And user wait for the success message to disappear
    Then user should verify quantity value