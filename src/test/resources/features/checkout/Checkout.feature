@Android
Feature: Checkout

  @Checkout
  Scenario: checkout one green tea latte from favorites pages using suggested amount
    Given User at favorites pages
    When User click "Green Tea Latte"
    And User click charge
    Then User click suggested amount
    And User click charge button
    Then User click no thank you

  Scenario: checkout one green tea latte and fries from favorites pages using manual input amount
    Given User at favorites pages
    When User click "Green Tea Latte"
    And User click "Fries"
    And User click charge
    Then User type "15000"
    And User click charge button
    Then User click no thank you