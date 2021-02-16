@login
Feature: Login

  Scenario: Users should be able to login
    Given The user on the login page
    When The user enters valid credentials as a "Store manager"
# You need to enter one of the belows
#       Truck Driver
#       Store Manager
#       Sales Manager
    Then User should be able to login

