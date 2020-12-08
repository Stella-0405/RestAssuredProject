package RestAssured_FutureDate;


import static io.restassured.RestAssured.given;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;



public class FuturelogStepDef {
	String uri = "https://api.ratesapi.io/api/2020-15-12";
	
	@Given("^API for future date$")
	public void api_for_future_date() throws Throwable {
		System.out.println("The Uri is"+uri);

	}
	
	@When("^posted with future date Information$")
	public void posted_with_future_date_Information() throws Throwable {
		Response response = RestAssured.get(uri);
		System.out.println(response);
	}


	@Then("^validate positive response code received for future date$")
	public void validate_positive_response_code_received_for_future_date() throws Throwable {
		given().
		when().
		get(uri).
		then().
		statusCode(400).
		log().all();

	}

	@Then("^store the future response into response object$")
	public void store_the_future_response_into_response_object() throws Throwable {
		Response response = RestAssured.get(uri);
		System.out.println("The Response code is "+response.getStatusCode());
		String res = response.getBody().asString();
		System.out.println(res);
	}
	
}
