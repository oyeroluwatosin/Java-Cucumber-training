Feature: Login Functionality

  Scenario Outline: Invalid username or password should return the correct error message

    Given I land on the homepage
    And I press the sign in link
    When I type "<Username>"
    And I input "<Password>"
    When I click the button for login
    Then I should get the "<error>" message

    Examples:
    | Username                  | Password           | error                         |
    | lanre_april@gmail.com     | test               | Invalid password.              |
    | lanre_     @gmail.com     | testing            | Invalid email address.         |
    |                           |                    | An email address required.    |