Feature: Saucedemo webshop add item testing

  Background:
    Given the homepage is open
    And the Username is filled with 'standard_user'
    And the Password is filled with 'secret_sauce'
    And the Login button is clicked

  Scenario:
    Given the Sauce Labs Backpack is added to the cart
    Then '1' should be shown on the cart icon

