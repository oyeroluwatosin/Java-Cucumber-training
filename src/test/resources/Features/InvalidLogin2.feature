@ignore
Feature: Login Functionality

  Scenario: wrong username with correct password should return correct error message

    Given I get on the home page
    And I press the sign button
    When I enter wrong username
    And I enter the correct password
    When I click the press to login suspect
    Then I should get related error message