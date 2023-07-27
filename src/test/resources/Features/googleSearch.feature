Feature: feature to test google search functionlaity

 Background: 
 Given browser is open
 And user is on google search page

  @outlineSearch
  Scenario Outline: Validate google search is working
    #Given browser is open
    #And user is on google search page
    When user enters a <text> in search box
    And hits enter
    Then user is navigated to search <results>
    And browser closes

    Examples: 
      | text     | results    |
      | linkedin | Job Search |
      | software | Software   |
      | samsung  | Samsung    |

  @unfixedSearch
  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters "Linkedin" and "2023" in search box
    And hits enter
    Then user is navigated to search results page
    And browser closes

    
    Given User open browser 
    when User clicks on below 
    