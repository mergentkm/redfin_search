$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/resources/features/SearchProperty.feature");
formatter.feature({
  "name": "Search for properties on redfin.com",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the search result by city",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@search"
    }
  ]
});
formatter.step({
  "name": "User is on the redfin homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchPropertyStepDefinitions.user_is_on_the_redfin_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for properties by the city name",
  "keyword": "When "
});
formatter.match({
  "location": "SearchPropertyStepDefinitions.user_searches_for_properties_by_the_city_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the displayed properties should be for the city searched for",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchPropertyStepDefinitions.the_displayed_properties_should_be_for_the_city_searched_for()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat com.redfin.step_definitions.SearchPropertyStepDefinitions.the_displayed_properties_should_be_for_the_city_searched_for(SearchPropertyStepDefinitions.java:39)\n\tat ✽.the displayed properties should be for the city searched for(file:src/test/java/resources/features/SearchProperty.feature:8)\n",
  "status": "failed"
});
});