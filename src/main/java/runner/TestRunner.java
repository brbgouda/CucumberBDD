package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/features", //the path of the feature files
		tags={"@fclogin3"},
		glue={"stepDefinitions"}, //the path of the step definition files
		format={"pretty","html:reports/cucumber", "json:reports/cucumber.json"},
		monochrome=true,
		strict=true, 
		dryRun=false)

public class TestRunner {

}
