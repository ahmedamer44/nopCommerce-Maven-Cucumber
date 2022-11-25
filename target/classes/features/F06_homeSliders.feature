@smoke
Feature: F06_HomeSliders | user could select product from Home Sliders
  Scenario: first slider is clickable on home page ( Nokia Lumia )
    When user click on nokia lumia home slider
    Then user should be redirected to The Nokia product page

  Scenario: second slider is clickable on home page
    When user click on iphone home slider
    Then user should be directed to the iphone product page
