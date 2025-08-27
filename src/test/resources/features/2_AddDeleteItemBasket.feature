@AddDeleteItem @Sanity
Feature: Validate Add and Delete feature of Basket
  In order to add and successfully delete an item from the basket
  I need to visit Sweets tab
  And select desired product


  Scenario: Verify Add and Delete "Chocolate Cups" from the basket
    Given User navigates to "https://sweetshop.vivrichards.co.uk/" Sweet Shop website
    Then User validates page title as "Sweet Shop"
    And User clicks on Sweets tab
    And User validates the price of each "Chocolate Cups" as "£1.00"
    And User clicks on add to basket button "4" times
    Then User verify basket count for "4" "Chocolate Cups"
    And User clicks on Basket tab
    Then User verify the product name is correct as "Chocolate Cups"
    And User verify the price of each product is correct as "£1.00"
    And User verify the total count of product added as "4"
    And User verify the total amount of "4" products
    Then User clicks on Delete Item and Clicks on Ok button on alert
    And User verify the total count of product added as "0"