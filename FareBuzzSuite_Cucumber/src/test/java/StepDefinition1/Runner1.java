package StepDefinition1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src/test/resources/Features",
glue= {"StepDefinition1"},
monochrome=true,
plugin = {"pretty","html:target/htmlReports"},
tags="@smoketest",
dryRun = false
)

public class Runner1 {

}
