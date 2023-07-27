@smokeFeature
Feature: feature to login functionality

@smokeTest
  Scenario: Check login is successful wth valid credentials
    Given user is on login page
    When user enters username and password
    And user clicks on login button
    Then user is navigated to the home page
