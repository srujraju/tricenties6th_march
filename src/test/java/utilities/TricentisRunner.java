package utilities;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit = "--step-notifications",
		features = "feature",
		plugin = {"json:target/cucumber.json"},
		glue={"stepss"},
		
		tags = {"@Login"}
		
				
		)
public class TricentisRunner {


}
