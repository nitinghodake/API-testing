package Rest_Day1;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class FetchCookiesHeader {
	
	
	
	
	
		@Test(priority=1)
		void headerTest( ) {
			
			when()
			     .get("https://github.com/")
			.then()     
			      .header("server", "GitHub.com")
			      .header("content-type", "text/html; charset=utf-8");
		}
		
		
		@Test(priority=2)
		void cookiesTest( ) {
			
			when()
			     .get("https://github.com/")
			.then()     
			      .cookies("_gh_sess", "GitHub.com")
			      .cookies("_octo", "github.com");
		}

		
	}

	


