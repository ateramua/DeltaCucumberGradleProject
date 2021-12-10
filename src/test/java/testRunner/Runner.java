package testRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import testUtility.TestBase;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", 
monochrome = true, 
glue = "stepDefinitions", 
dryRun = false)

public class Runner extends TestBase {
	

}
