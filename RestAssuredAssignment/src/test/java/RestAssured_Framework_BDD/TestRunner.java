package RestAssured_Framework_BDD;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Exchange/foreignExchange.feature",glue="RestAssured_Framework_BDD")
public class TestRunner {
		
}
