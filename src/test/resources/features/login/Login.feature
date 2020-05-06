@Android
Feature: Login

  @Login
  Scenario: login with correct username and password
    Given User is on moka start page
    When User click sign in button on moka start page
    Then User type username "theodoricjonathan@gmail.com"
    And User type password "123abc"
    And User click sign in button
    Then User logged in and see "Favorites" page