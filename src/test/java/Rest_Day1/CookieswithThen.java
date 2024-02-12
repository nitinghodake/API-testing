package Rest_Day1;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;



public class CookieswithThen {
	
	
	@Test
	
	void cookiesTest () {
		
		     when()
			     .get("https://github.com/")
			     
			.then()     
			      .cookies("_gh_sess", "GitHub.com")
			      .cookies("_octo", "github.com");
		}

}

