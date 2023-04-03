Feature: Fees Multiple Values Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click button
    Then User should login successfully

  Scenario Outline: Fee Functionality

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | fees       |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content

      | nameInput       | <name>     |
      | codeInput       | <code>     |
      | integrationCode | <intCode>  |
      | priorityCode    | <priority> |


    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | <name> |

    Then Success message should be displayed

    Examples:

      | name  | code | intCode  | priority |
      | Fee01 | 9123 | payPal   | 912345   |
      | Fee02 | 9123 | cash     | 912346   |
      | Fee03 | 9123 | cheque   | 912347   |
      | Fee04 | 9123 | applePal | 912348   |
      | Fee05 | 9123 | crypto   | 912349   |





