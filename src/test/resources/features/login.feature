Feature: Users should be able to login

  @REM-860 @wip
  Scenario: User as a human source
    Given :The user is on the login page
    When :The user enters the human source information
    Then :The user should be able to login

  #Scenario: User as a helpdesk
  #  Given :The user is on the login page
   # When :The user enters the helpdesk information
   # Then :The user should be able to login

  #Scenario: User as a marketing
   # Given :The user is on the login page
   # When :The user enters the marketing information
    #Then :The user should be able to login