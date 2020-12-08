package RestAssured_ScriptResponse_Parsing;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class Script {

	Response response;
		
	@Given("^API for foreign exchange$")
	public void api_for_foreign_exchange() throws Throwable {
		RestAssured.baseURI= "https://api.ratesapi.io/api/2010-01-12";
	}
	
	@When("^posted with correct Information$")
	public void posted_with_correct_Information() throws Throwable {
		response = RestAssured.get("https://api.ratesapi.io/api/2010-01-12");
		System.out.println("Print--"+response.body().asString());
	}
	
	@Then("^validate positive response code received$")
	public void validate_positive_response_code_received() throws Throwable {
		given().
		when().
		get("https://api.ratesapi.io/api/2010-01-12").
		then().
		statusCode(200).
		log().all();
	}
}


