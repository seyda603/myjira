Feature: User should be able to search by selecting Date

  @REM-862 @wip
  Scenario:Human source user3
   # Given The user login as a human source
    When the user navigates to Filter and Search box
    Then the user enter date
    And the user should see fourteen item
      | Any date        |
      | Yesterday       |
      | Current day     |
      | This week       |
      | This month      |
      | Current quarter |
      | Last 7 days     |
      | Last 30 days    |
      | Last 60 days    |
      | Last 90 days    |
      | Last N days     |
      | Month           |
      | Quarter         |
      | Year            |

    And the user select anyone
    And the user click search