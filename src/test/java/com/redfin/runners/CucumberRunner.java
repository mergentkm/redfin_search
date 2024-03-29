package com.redfin.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"
        },
        features = "src/test/java/resources/features",
        glue = "com.redfin.step_definitions",
        dryRun = false
)
public class CucumberRunner {
}
