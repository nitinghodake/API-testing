package Rest_Day1;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;


public class PostAuto {

	@Test
	void createData() {
		//Jsonobject 
		JSONObject object_name = new JSONObject();
		object_name.put("name", "Nitin");
		object_name.put("Job", "Engineer");
		
		given()
		.contentType("application/json")
		
		.body(object_name.toString())
		
		.when()
		      .post("https://reqres.in/api/users")
		      
		.then()
		      .statusCode(201)
		      
		      .log().all();
		
	}
}
