package RestAssured_NegAssertions;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AssertStepdef {
	String uri = "https://api.ratesapi.io/api";
	Response response= RestAssured.get("https://api.ratesapi.io/api");

	@Given("^API for foreign exchange$")
	public void api_for_foreign_exchange() throws Throwable {
		System.out.println("The uri is "+uri);
	}

	@When("^posted with correct Information$")
	public void posted_with_correct_Information() throws Throwable {
		System.out.println(response);		
	}

	@Then("^validate positive response code received$")
	public void validate_positive_response_code_received() throws Throwable {
		System.out.println("The Response code is "+response.getStatusCode());		
	}

	@Then("^Store the response into response object$")
	public void store_the_response_into_response_object() throws Throwable {
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode,400);
		Assert.assertNotEquals(statusCode,200);		
	}
}
