Feature: Website log out page test

  Scenario Outline:
    Given the homepage is opened
    And the Username is filled with '<username>' and Password is filled with '<password>'
    And the Login button is clicked
    And the Menu button is clicked
    When the Log out button is clicked
    Then the Log out should be successful
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |