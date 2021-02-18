package stepdefs;

import cucumber.api.CucumberOptions;

@CucumberOptions(plugin = { "json:target/cucumber-json.json", "rerun:target/rerun.txt" })
public class RunCukeIT extends AbstractTestNGCucumberParallelTests {

}
