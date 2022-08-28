Feature: Registration Module

  Scenario Outline: John goes to the site and does registration
    Given John on home page after opening open site
    And Jogn click Signup/Login button to go Login in page
    And John clicks register and goes registration page
    When John decides to registration with email
    And John enters <sheetName> and <rowNum> to exact values
    Then Successfully registered
    Examples:
      | sheetName    | rowNum |
      | registration | 0      |