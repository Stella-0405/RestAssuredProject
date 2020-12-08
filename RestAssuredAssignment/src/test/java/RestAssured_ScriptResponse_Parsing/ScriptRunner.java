package RestAssured_ScriptResponse_Parsing;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:Exchange/foreignExchange.feature",glue="RestAssured_ScriptResponse_Parsing")
public class ScriptRunner {

}
