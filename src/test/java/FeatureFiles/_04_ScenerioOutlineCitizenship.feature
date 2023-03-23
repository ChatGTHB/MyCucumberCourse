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

    Examples:
      | name | short |
      | NewCitizenship01 | New0101 |
      | NewCitizenship02 | New0202 |
      | NewCitizenship03 | New0303 |
      | NewCitizenship04 | New0404 |