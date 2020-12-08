package RestAssured_ScriptResponse_Assertion;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResponseStatus {

	Response response; 

	@Given("^API for foreign exchange$")
	public void api_for_foreign_exchange() throws Throwable {
		RestAssured.baseURI= "https://api.ratesapi.io/api/2010-01-12";

	}

	@When("^posted with correct Information$")
	public void posted_with_correct_Information() throws Throwable {
		response = RestAssured.get("https://api.ratesapi.io/api/2010-01-12");
	}

	@Then("^validate positive response code received$")
	public void validate_positive_response_code_received() throws Throwable {
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode,200);
		Assert.assertNotEquals(statusCode,400);
	}



	

}


