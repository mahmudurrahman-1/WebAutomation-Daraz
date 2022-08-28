Feature: Login Module

  Scenario: John open the site and Login
    Given John on home page after opening open site
    And John clicks SIGNUP/lOGIN button from the Nav bar
    When John enters "email" and "password"
    Then Jhon successfully Login



