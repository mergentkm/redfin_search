Feature: Search for properties on redfin.com

  Background:
    Given User is on the redfin homepage


  Scenario: Verify the search result by city

     When user searches for properties by the city name
     Then the displayed properties should be for the city searched for


  Scenario: Verify the search result by zip code

    When user searches for properties by the zip code
    Then the displayed properties should be for the zip code searched for



  Scenario: Verify the search result school name

    When user searches for properties by the school name
    Then the displayed properties should be in the same city as the school location city