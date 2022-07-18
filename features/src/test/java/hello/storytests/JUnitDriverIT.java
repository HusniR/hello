package hello.storytests;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions( features = "src/test/resources/storytests", plugin = {
	"pretty:target/cucumber-pretty-report.txt",
	"html:target/cucumber-html-report.html",
	"json:target/cucumber-json-report.json"
})
public class JUnitDriverIT{}


