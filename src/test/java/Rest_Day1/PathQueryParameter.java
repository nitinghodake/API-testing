package Rest_Day1;

import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PathQueryParameter {
	@Test
	void QueryPathParameter() {
		
		given()
		.pathParam("path_parameter_1", "api")
		.pathParam("path_parameter_2", "users")
		.queryParam("page", 2)
		
		.when()
		     .get("https://reqres.in/api/(path_parameter_1)/(path_parameter_2)")
		     
		.then()
		     .log().all();
	}

}
