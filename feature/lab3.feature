
Feature: Lab 3 Testing
 
  @tag1
  Scenario: Verifying lab 3 Tc
    Given Launch the url
    And Maximize window
    And click on Desktops
    And click on Mac
    And click on Sortby
    When click on addtocart
    Then Item should be added to cart
  