Feature: Search module

  Scenario Outline: Search anything by valid credentials
    Given goto search module
    When give <search texts> as inputs
    And goto result page
    And scroll to a tv and click
    And go to that tv details page
    And Increase quantity by two
    And add to your cart
    Examples:
      | search |
      | tv     |