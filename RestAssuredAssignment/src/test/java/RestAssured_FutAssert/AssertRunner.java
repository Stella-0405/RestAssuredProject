package RestAssured_FutAssert;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Exchange/FutureDate.feature",glue="RestAssured_FutAssert")
public class AssertRunner {

}
