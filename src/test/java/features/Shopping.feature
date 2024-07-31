@All
  Feature: Purchase a product

    @SmokeTest7
    Scenario: Validate checkout prosses
      Given User is on the login page
      When User inputs valid credentials
      Then User successfully enters to the product page
      And User should be able to view all of product
      When User clicks add to cart button
      Then the number of shopping cart increases
      When User clicks shopping cart icon
      Then User should be able to view List products on the cart page
      When User clicks checkout button
      Then User will be redirected to the checkout information page
      And User inputs valid checkout information
      When User clicks continue button
      Then User will be redirected to the Checkout Overview
      And User should be able to view all of product checkouted
      And User should be able to view Payment Information
      And User should be able to view Shipping Information
      And User should be able to view Price Total
      When User clicks finish button
      Then User will be redirected to the checkout complete page
      And User can view checkout complete successfully message
      When User clicks back home button
      Then User will be redirected to the product page

