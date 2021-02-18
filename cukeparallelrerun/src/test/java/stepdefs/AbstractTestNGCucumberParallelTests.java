package stepdefs;

import org.testng.annotations.DataProvider;

import cucumber.api.testng.AbstractTestNGCucumberTests;

public class AbstractTestNGCucumberParallelTests extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
