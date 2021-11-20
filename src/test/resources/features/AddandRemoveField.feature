Feature: User should be able to add and remove field.

  @REM-861 @wip
  Scenario:Human source user2
    Given The user login as a human source
    When the user navigates to Filter and Search box
    Then the user enter add field
    And the user should see seven item
      | Date      |
      | Type      |
      | Author    |
      | To        |
      | Favorites |
      | Tag       |
      | Extranet  |
    And the user add and remove