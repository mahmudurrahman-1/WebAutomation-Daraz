Feature: Registration Module

  Scenario Outline: Registration with valid inputs
    Given goto registration page
    When enter <sheetName> and <rowNum>
    Then Successfully registered
    Examples:
      | sheetName    | rowNum |
      | registration | 0      |