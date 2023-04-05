Feature: verify the login

  Scenario: Login to open cart
    Given Launch the URL
    And Navigate to login page
    And Enter username and password
    When Click on login button
    Then Login should be successful
