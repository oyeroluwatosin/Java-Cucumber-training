Feature: Homepage logo and Cart Button

  Scenario: Verify Logo and Cart Button are displayed on the Homepage

    Given I launch a browser
    And I enter Application url
    When I wait for 5 seconds
    Then I should see application logo and add to cart button
