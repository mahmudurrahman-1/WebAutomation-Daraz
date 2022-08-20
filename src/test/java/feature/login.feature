Feature: Login Module

  Background: Login with invalid credentials
    Given goto daraz website and click SIGNUP/lOGIN button from the navigation
    When give "email" and "password" to login
    Then show incorrect result

  Scenario: Login with valid credentials
    Given refresh page
    When give valid "email" and "password"
    Then successfully login


