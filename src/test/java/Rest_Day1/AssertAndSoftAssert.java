package Rest_Day1;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;



public class AssertAndSoftAssert {
	@Test
	
	void asserts() {
		Response asrt_var=given()
				
	.when()
	      .get("https://reqres.in/api/users?page=2");
		
	Assert.assertEquals(asrt_var.getStatusCode(), 201);
	Assert.assertEquals(asrt_var.header("connection"), "keep-alive");
	}

}
