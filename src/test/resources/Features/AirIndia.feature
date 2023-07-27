Feature: Flight search

  Scenario: To test fight search functionality
    Given Browser is open and navigated to Air India website
    When User accepts cookies
    And User enter journey details
    And Clicks search
    Then User taken to flight list
