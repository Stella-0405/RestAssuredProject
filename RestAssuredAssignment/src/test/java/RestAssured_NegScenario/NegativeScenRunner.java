package RestAssured_NegScenario;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Exchange/Negative.feature",glue="RestAssured_NegScenario")
public class NegativeScenRunner {

}
