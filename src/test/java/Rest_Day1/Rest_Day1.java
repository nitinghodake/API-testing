package Rest_Day1;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Rest_Day1 {
/*
	//give()-body ,param,headers
	//when()- get,post put,delete
	//then()-jsonbody,response body,statuscode
	*/
	@Test
	void testCase_1() {
		
		
		
		when ()
		.get("https://reqres.in/api/users/2")
		
		.then()
		.statusCode(200)
		//.log().all();
		//or
		.body("data[0].id",equalTo(7));
		
		
	}
	/*@Test
void testCase_2() {

		
		
		
		when ()
		.get("https://reqres.in/api/users")
		
		.then()
		.statusCode(200)
		.log().all();
		
		
	}*/
	/*@Test
	void deleteAPI() {
		
	when ()
	.delete("https://reqres.in/api/users")
	
	.then()
	.statusCode(204)
	.log().all();
	
	}*/
	
}
