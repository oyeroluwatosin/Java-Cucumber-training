Feature: Create User

  Scenario: Create New User

    Given I get on the Homescreen
    When i get on the Login Screen
    And I enter email address for new account
    And I click the create account button
    When I enter all required details
    And I click the register button
    Then My account should be successfully created

    # The user for test can