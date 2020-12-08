package RestAssured_NegScenario;

import static io.restassured.RestAssured.given;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;



public class NegScript {

	String uri = "https://api.ratesapi.io/api";
	Response response;

	@Given("^API for foreign exchange$")
	public void api_for_foreign_exchange() throws Throwable {
		RestAssured.baseURI= "https://api.ratesapi.io/api";
	}

	@When("^posted with correct Information$")
	public void posted_with_correct_Information() throws Throwable {
		response = RestAssured.get("https://api.ratesapi.io/api");
		System.out.println("Print--"+response.body().asString());
	}

	@Then("^validate positive response code received$")
	public void validate_positive_response_code_received() throws Throwable {
		given().
		when().
		get("https://api.ratesapi.io/api").
		then().
		statusCode(400).
		log().all();
	}

	@Then("^Store the response into response object$")
	public void store_the_response_into_response_object() throws Throwable {
		String Stat = response.getBody().asString();
		System.out.println(Stat);
	}

}
