
Feature: Lab4 Testing

  @tag1
  Scenario: Lab4 Executing
    Given Launch the URl
    And Maximize the Window
    And verify page title
    And click on Desktops drop down
    And click on Mac
    And verify Mac
    And click on sort by from a-z
    When click on add to cart
    Then item should be added to cart

 