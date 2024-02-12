package Rest_Day1;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;



public class Cookies_FetchCookiesvalue {
	
	@Test
	void CookiesTest() {
		
		Response cookie_var = given ()
				
		.when ()
		       .get("https://github.com");
		    String cok_var= cookie_var.getCookie("_gh_sess");
		    
		    System.out.println("This is the cookie value "+cok_var);
		
	}

}
