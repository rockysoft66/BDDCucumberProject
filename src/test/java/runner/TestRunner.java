package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( features = {"/Freecrm/src/test/resources/Features/Log.feature"}, 
				glue = {"stepDefinitions","AppHooks"}, dryRun = false,monochrome = true,
				plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"}
)

public class TestRunner {

}
