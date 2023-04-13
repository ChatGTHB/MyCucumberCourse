Feature: ApacahePOI Citizen Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click button
    Then User should login successfully
    And Navigate to citizenship page

    Scenario: Create and Delete CitizenShip From Excel
      When User create citizenship with ApachePOI
      Then User delete citizenship with ApachePOI
