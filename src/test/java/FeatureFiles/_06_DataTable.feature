Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click button
    Then User should login successfully



  Scenario: Create Country

    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | KeremUlk01 |
      | codeInput | i3434     |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | KeremUlk01 |

    Then Success message should be displayed


@Regression
  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | KeremUlk01 |

    And Click on the element in Dialog
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | KeremUlk01 |

    Then Success message should be displayed


  @Regression
  Scenario: Fee Functionality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | fees          |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput       | Course Fee |
      | codeInput       | 12345      |
      | integrationCode | 67890      |
      | priorityCode    | 19687456   |

    And Click on the element in Dialog
      | toggleBar  |
      | saveButton |

    Then Success message should be displayed

    And User delete item from Dialog Content
      | Course Fee |

    Then Success message should be displayed


