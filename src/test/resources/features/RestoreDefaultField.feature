Feature:User should be able to restore default field

  @REM-864 @wip
  Scenario:Human source user
  #  Given The user login as a human source
    When the user navigates to Filter and Search box
    Then the user should see four fields
      | Date      |
      | Type      |
      | Author    |
      | To        |
    And the user enter add any field
    And the user click restore default fields