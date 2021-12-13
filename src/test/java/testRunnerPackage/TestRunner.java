package testRunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = "stepDefinitionPackage",
monochrome = true, dryRun = false, tags = "@Priority2",
plugin = {"pretty","html:target/BDD-Report.html"})



public class TestRunner {

}
