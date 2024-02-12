package Rest_Day1;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;


public class DummyAPI {
	
@Test	(priority=1)
void testCase_1() {
		
		
		
		when ()
		.get("https://reqres.in/api/users/")
		
		.then()
		.statusCode(200)
		.log().all();
}

	   @Test (priority=2)
		void createDatatestcase_2() {
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
       @Test (priority=3)
       void Updatedatatestcase_3() {
			//Jsonobject
			JSONObject object_name = new JSONObject();
			object_name.put("name", "Yogesh");
			object_name.put("Job", "Tester");
			
			given()
			.contentType("application/json")
			.body(object_name.toString())
			
			.when()
			      .put("https://reqres.in/api/users")
			      
			.then()
			      .statusCode(201)
			      .log().all();
	
      
       }  
       @Test(priority=4)
       void AgainFetchdtatestCase_4() {
   		
   		
   		                                 
   		when ()
   		.get("https://reqres.in/api/users/")
   		
   		.then()
   		.statusCode(200)
   		.log().all();
   }



}
