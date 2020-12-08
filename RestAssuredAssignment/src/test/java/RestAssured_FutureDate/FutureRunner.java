package RestAssured_FutureDate;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Exchange/FutureDate.feature",glue="RestAssured_FutureDate")
public class FutureRunner {

}
