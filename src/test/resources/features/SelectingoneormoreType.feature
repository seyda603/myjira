Feature:User should be able to search by selecting one or more Type

  @REM-863 @wip
  Scenario:Human source user4
    #Given The user login as a human source
    When the user navigates to Filter and Search box
    Then the user enter select button
    And the user should see thirteen item
      | Posts                    |
      | Announcements           |
      | Appreciations           |
      | Polls                   |
      | Conversations           |
      | Tasks                   |
      | Working time management |
      | Work reports            |
      | Calendar                |
      | External source data    |
      | Photo gallery           |
      | Wiki                    |
      | Workflows               |

    And the user select one or more
    And the user click search