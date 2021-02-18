package stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "@target/rerun.txt")
public class RunFailIT extends AbstractTestNGCucumberTests {

}
