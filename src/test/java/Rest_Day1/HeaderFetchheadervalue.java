package Rest_Day1;

import org.testng.annotations.Test;


import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class HeaderFetchheadervalue {
	
	@Test
	void HeaderTest() {
		Response header_var = given ()
		
				.when()
		      .get("https://github.com/");
		      
		      String head_var = header_var.getHeader("server");
		
		System.out.println("This is the header value"+head_var);
	
	}

}
