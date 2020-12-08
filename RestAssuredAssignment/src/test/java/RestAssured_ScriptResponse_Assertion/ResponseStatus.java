package RestAssured_ScriptResponse_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResponseStatus {
	
	@Test
	public void StatusCodetest() {
		Response response = RestAssured.get("https://api.ratesapi.io/api/2010-01-12");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode,200);
		Assert.assertNotEquals(statusCode,400);
		
	}

}
