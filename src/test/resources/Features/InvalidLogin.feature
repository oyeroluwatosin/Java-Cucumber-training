@ignore
Feature: Login Functionality

  Scenario: Login with invalid credentials should return the error message

    Given I am on the landing page
    When I select the sign in link
    And I enter the correct Username
    And I enter incorrect password
    When I click the button to login
    Then I should get the correct error message