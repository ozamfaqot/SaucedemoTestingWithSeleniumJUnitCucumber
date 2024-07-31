@All
Feature: Add to Cart

  @SmokeTest3
  Scenario: Validate adding product into cart directly from product page
    Given User is on the login page
    When User inputs valid credentials
    Then User successfully enters to the product page
    And User should be able to view all of product
    When User clicks add to cart button
    Then the number of shopping cart increases

  @SmokeTest4
  Scenario: Validate removing product from cart directly from product page
    Given User is on the login page
    When User inputs valid credentials
    Then User successfully enters to the product page
    And User should be able to view all of product
    When User clicks add to cart button
    Then the number of shopping cart increases
    When User clicks remove button
    Then the number of shopping cart decreases
    And Add to cart button appears

  @SmokeTest5
  Scenario: Validate adding product into cart from detail product page
    Given User is on the login page
    When User inputs valid credentials
    Then User successfully enters to the product page
    And User should be able to view all of product
    When User clicks the product Title
    Then User should be able to view detail product
    When User clicks add to cart button on detail product page
    Then the number of shopping cart increases on detail product page

  @SmokeTest6
  Scenario: Validate removing product into cart from detail product page
    Given User is on the login page
    When User inputs valid credentials
    Then User successfully enters to the product page
    And User should be able to view all of product
    When User clicks the product Title
    Then User should be able to view detail product
    When User clicks add to cart button on detail product page
    Then the number of shopping cart increases on detail product page
    When User clicks remove button on detail product page
    Then Add to cart button appears on detail product page


