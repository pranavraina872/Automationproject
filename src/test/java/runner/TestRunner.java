package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@CucumberOptions(features ={"src/test/resources/feature"},glue ={"stepdef"},tags ="@testing")
@RunWith(Cucumber.class)
public class TestRunner {
}
