Feature:Testing JDBC States

  Background:
    Given Navigate to Campus
    When Enter username and password and click button
    Then User should login successfully

  Scenario: States testing with JDBC
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | states     |
    Then Send the query the database "select * from States" and control match