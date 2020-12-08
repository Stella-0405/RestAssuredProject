package RestAssured_Framework_BDD;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepDefinitions {
	
	Response response = RestAssured.get("https://api.ratesapi.io/api/2010-01-12");

	@Given("^API for foreign exchange$")
	public void api_for_foreign_exchange() throws Throwable {
		System.out.println("The API is 'https://api.ratesapi.io/api/2010-01-12' ");
	}

	@When("^posted with correct Information$")
	public void posted_with_correct_Information() throws Throwable {
		System.out.println(response.body().asString());
	}

	@Then("^validate positive response code received$")
	public void validate_positive_response_code_received() throws Throwable {
		System.out.println("The Response code is "+response.getStatusCode());
	}

}
