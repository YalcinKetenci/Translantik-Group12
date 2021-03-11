Feature: Truck driver bla bla

  Background:
    Given The user on the login page
    When The user enters valid credentials
    Then User should be able to login

  Scenario:
    Given the user navigates to "Fleet" "Vehicle Costs"
    And the user clicks any cost
    And the user clicks Add Attachment button
    And the user clicks Choose File button
