Feature: Country Functionality

  Scenario: Create a country

    Given Navigate to Campus
    When Enter username and password and click button
    Then User should login successfully
    And Navigate to country page
    When Create a country
    Then Success message should be displayed