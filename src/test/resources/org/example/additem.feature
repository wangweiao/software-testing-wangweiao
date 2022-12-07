Feature: Saucedemo webshop add item testing

  Background:
    Given the homepage is open
    And the Username is filled with 'standard_user'
    And the Password is filled with 'secret_sauce'
    And the Login button is clicked

  Scenario:
    Given the Sauce Labs Backpack is added to the cart
    Then '1' should be shown on the cart icon

  Scenario:
    Given the Sauce Labs Bike Light is added to the cart
    Then '2' should be shown on the cart icon

  Scenario:
    Given the Sauce Labs T-Shirt is added to the cart
    Then '3' should be shown on the cart icon

  Scenario:
    Given the Sauce Labs Jacket is added to the cart
    Then '4' should be shown on the cart icon

  Scenario:
    Given the Sauce Labs Onesie is added to the cart
    Then '5' should be shown on the cart icon

  Scenario:
    Given the Sauce Labs Red T-Shirt is added to the cart
    Then '6' should be shown on the cart icon
