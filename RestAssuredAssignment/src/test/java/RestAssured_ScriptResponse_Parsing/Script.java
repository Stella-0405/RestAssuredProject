package RestAssured_ScriptResponse_Parsing;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.junit.Test;

public class Script {
	
	@Test
	public void Scriptting() {
		
		Response response = RestAssured.get("https://api.ratesapi.io/api/2010-01-12");
		System.out.println("Print--"+response.body().asString());
		
		given().
		when().
		get("https://api.ratesapi.io/api/2010-01-12").
		then().
		statusCode(200).
		log().all();
	}

}
