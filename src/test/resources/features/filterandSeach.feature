Feature: Filter and Search box control

@REM-859 @wip
  Scenario:Human source user
  #  Given The user login as a human source
    When the user navigates to Filter and Search box
    Then the title contains type
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |
