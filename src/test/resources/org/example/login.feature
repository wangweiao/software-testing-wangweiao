Feature: Website login page test
  Background:
    Given the homepage is opened
    And the Login button is clicked

    Scenario Outline:
      Given the Username is filled with '<username>' and Password is filled with '<password>'
      When the Login button is clicked
      Then the Login should fail
      Examples:
        | username     | password     |
        |              | secret_sauce |
        | user         | secret_sauce |
        | invalid_user | secret_sauce |
        | new_user     | secret_sauce |
        | regular_user | secret_sauce |
        | hello_user   | secret_sauce |

  Scenario Outline:
      Given the Username is filled with '<username>' and Password is filled with '<password>'
      When the Login button is clicked
      Then the Login should be successful
      Examples:
        | username                | password     |
        | standard_user           | secret_sauce |
        | problem_user            | secret_sauce |
        | performance_glitch_user | secret_sauce |