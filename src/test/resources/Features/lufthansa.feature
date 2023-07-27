@lufthansaFeature
Feature: Search for flights in lufthansa website

  @lufthansaScenario
  Scenario: Open browser and search flights
    Given browser is opened
    And browser navigates to lufthansa website
    When user accepts the cookies
    And lufthansa webite opens
    And user enter from and to details
    And enter fly date
    #And clicks on enter
    #And browser should close
    #And inform user test successful
