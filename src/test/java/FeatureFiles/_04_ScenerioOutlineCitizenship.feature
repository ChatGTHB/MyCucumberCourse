Feature: CitizenShip Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click button
    Then User should login successfully
    And Navigate to citizenship page

  Scenario Outline: Create citizenship

    When User create a Citizenship name as "<name>" and short name as "<short>"
    Then Success message should be displayed

    When User create a Citizenship name as "<name>" and short name as "<short>"
    Then Already exist message should be displayed

    When User delete the "<name>"
    Then Success message should be displayed


    Examples:
      | name                | short   |
      | NewCity1101 | New0101 |
      | NewCity2202 | New0202 |
      | NewCity3303 | New0303 |
      | NewCity4404 | New0404 |