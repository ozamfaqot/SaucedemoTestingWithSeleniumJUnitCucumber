@All
Feature: Login User

  @SmokeTest1
  Scenario: Validate logging into the Application using valid credentials
    Given User is on the login page
    When User inputs valid credentials
    Then User successfully enters to the product page
    And User should be able to view all of product

  @SmokeTest2
  Scenario: Validate logging into the Application using invalid credentials
    Given User is on the login page
    When User inputs invalid credentials
    Then Error message appears
