Feature: Login Functionality

  Scenario: User should be able to login with valid credentials

    Given I am on the homepage
    When I click the sign in button
    And I enter valid username
    And I enter valid password
    When I click the login button
    Then I should be logged in successfully