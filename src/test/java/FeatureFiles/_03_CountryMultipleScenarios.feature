Feature: Country Multi Scenerio

  Background: # Before scenerio
    Given Navigate to Campus
    When Enter username and password and click button
    Then User should login successfully
    And Navigate to country page

  Scenario: Create country
    When Create a country
    Then Success message should be displayed

  Scenario: Create country 2
    When Create a country name as "ParadiseCountry0123" code as "0101012"
    Then Success message should be displayed
