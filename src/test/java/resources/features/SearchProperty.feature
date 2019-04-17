Feature: Search for properties on redfin.com

  @search
  Scenario: Verify the search result by city

    Given User is on the redfin homepage
     When user searches for properties by the city name
     Then the displayed properties should be for the city searched for