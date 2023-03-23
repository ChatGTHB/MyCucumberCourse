Feature: CitizenShip Functionality
  
  Background:   
    Given Navigate to Campus
    When Enter username and password and click button
    Then User should login successfully
    And Navigate to citizenship page

  Scenario: Create citizenship
  
    When User create a Citizenship name as "NewCitizenship" and short name as "New0101"    
    Then Success message should be displayed

    When User create a Citizenship name as "NewCitizenship" and short name as "New0101"
    Then Already exist message should be displayed