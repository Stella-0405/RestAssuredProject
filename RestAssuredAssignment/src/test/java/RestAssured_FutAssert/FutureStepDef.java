package RestAssured_FutAssert;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FutureStepDef {

	String uri = "https://api.ratesapi.io/api/2020-15-12";
	Response response = RestAssured.get(uri);

	@Given("^API for future date$")
	public void api_for_future_date() throws Throwable {
		 System.out.println("The Uri is"+uri);
	}

	 @When("^posted with future date Information$")
	 public void posted_with_future_date_Information() throws Throwable {
	 System.out.println(response);
	 }
	 
	 @Then("^validate positive response code received for future date$")
	 public void validate_positive_response_code_received_for_future_date() throws Throwable {
		 int statusCode = response.getStatusCode();
		 System.out.println(statusCode);
		 Assert.assertEquals(statusCode,400);
		 Assert.assertNotEquals(statusCode,200);
	 }

	 @Then("^store the future response into response object$")
	 public void store_the_future_response_into_response_object() throws Throwable {
		 System.out.println("The Response code is "+response.getStatusCode());
		 String res = response.getBody().asString();
		 System.out.println(res);
	 }

	
	
}
