@Login @Sanity
Feature: Login Feature Testing
  In order to validate successful login
  I need to login with valid credentials

  Scenario: Verify Login Functionality
    Given User navigates to "https://sweetshop.vivrichards.co.uk/" Sweet Shop website
    Then User validates page title as "Sweet Shop"
    And User go to login screen
    And User enters valid username as "test@user.com"
    And User enters valid password as "password"
    And Click on login button
    Then User verify logged in user "test@user.com"