@login
Feature: Login

  Scenario: Users should be able to login
    Given The user on the login page
    When The user enters valid credentials
    Then User should be able to login

