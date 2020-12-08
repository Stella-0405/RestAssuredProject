package RestAssured_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class testData {
	Response response;
	
	@DataProvider(name="ForeignRatesProvider")
	public String[][] getCountry(){     
		String country[][] = {{"GBP"}, {"HKD"}, {"IDR"}};
		return (country);
	}


	@Given("^API for foreign exchange$")
	public void api_for_foreign_exchange() throws Throwable {
		RestAssured.baseURI= "https://api.ratesapi.io/api/2010-01-12";
	}

	@When("^posted with correct Information$")
	public void posted_with_correct_Information() throws Throwable {
		response = RestAssured.get("https://api.ratesapi.io/api/2010-01-12");
		System.out.println("Print--"+response.body().asString());
	}
	@Test(dataProvider="ForeignRatesProvider")
	@Then("^validate positive response code received$")
	public void validate_positive_response_code_received(String country) throws Throwable {
		given().
		when().
		get("https://api.ratesapi.io/api/2010-01-12").getBody().
		equals(getCountry());
	}


}
