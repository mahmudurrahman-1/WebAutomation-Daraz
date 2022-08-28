Feature: Login Module

  Scenario: John opens the site and Login
    Given John on homepage after opening open site
    And John clicks SIGNUP/lOGIN button from the Nav bar
    When John enters "email" and "password" to input fields
    Then John successfully Login



