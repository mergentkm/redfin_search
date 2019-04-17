package com.redfin.step_definitions;

import com.redfin.pages.HomePage;
import com.redfin.utilities.BrowserUtils;
import com.redfin.utilities.ConfigurationReader;
import com.redfin.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class SearchPropertyStepDefinitions {

    @Given("User is on the redfin homepage")
    public void user_is_on_the_redfin_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user searches for properties by the city name")
    public void user_searches_for_properties_by_the_city_name() {
        HomePage homePage = new HomePage();
        homePage.searchBox.sendKeys(ConfigurationReader.getProperty("searchCity"));

        BrowserUtils.waitForClickablility(homePage.suggestedLocation, 5);
        homePage.suggestedLocation.click();

    }

    @Then("the displayed properties should be for the city searched for")
    public void the_displayed_properties_should_be_for_the_city_searched_for() {
        HomePage homePage = new HomePage();
        String expectedLocation = ConfigurationReader.getProperty("searchCity");

        for (WebElement property : homePage.properties){
            System.out.println("Actual:  =>  "+ property.getText());
            System.out.println("Expected:  =>  "+ expectedLocation);

            Assert.assertTrue(property.getText().contains(expectedLocation));
        }
    }
}
