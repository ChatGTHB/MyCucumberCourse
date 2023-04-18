Feature: DataTable Example

  Scenario: User List
    When Write username "Kerem"
    And Write username and password "Kerem" and "smartboy"
    And Write username as DataTable
      | Kerem   |
      | Yiğit   |
      | Said    |
      | Mustafa |
    And Write username and password as DataTable
      | Kerem   | 12345 |
      | Yiğit   | 12346 |
      | Said    | 12347 |
      | Mustafa | 12348 |