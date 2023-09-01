package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"classpath:features"}, 
		glue = {"StepDefinitions"},
		tags = "@lufthansaScenario", 
		monochrome = false, 
		dryRun = false,
		plugin = {"pretty", "json:target/cucumber.json"})

public class MainRunner extends AbstractTestNGCucumberTests {

}
