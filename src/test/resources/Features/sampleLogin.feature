Feature: Login in to the web site

  Scenario: Successful login
    Given Browser is open and navigated to the website
    #When Login button is clicked
    And username and password are added
    And user click on login button
    Then Browser closes
