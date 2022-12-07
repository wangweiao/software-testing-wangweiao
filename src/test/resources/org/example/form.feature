Feature: Website search page test

  Background:
    Given the form page is open

  Scenario Outline:
    And the Name is filled with '<name>'
    And the Message is filled with '<message>'
    And the Submit button is clicked
    Then the '<feedback>' should not appear
    Examples:
      | name | message | feedback                 |
      |      |         | Thanks for contacting us |
      | Will |         | Thanks for contacting us |
      |      | Hello   | Thanks for contacting us |
      | John |         | Thanks for contacting us |
      | Mike |         | Thanks for contacting us |
      |      | World   | Thanks for contacting us |