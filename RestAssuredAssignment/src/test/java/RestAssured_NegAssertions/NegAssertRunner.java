package RestAssured_NegAssertions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Exchange/Negative.feature",glue="RestAssured_NegAssertions")
public class NegAssertRunner {
	

}
