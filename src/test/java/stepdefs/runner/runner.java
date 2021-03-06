package stepdefs.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty","html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt","junit:target/cucumber-results.xml"},
        features ={"src\\test\\Resources"},
        glue = {"stepdefs"},
        tags={"@Test"}

)

public class runner {
}
//,"usage:target/cucumber-usage.json"