package TestRestAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class TestPostRestAussured {
	
	@Test
	public void testPostReq() {	
		given().
			headers("appKey", "Key-value").
			param("wsfsfirst_name","first").
			param("wsfslast_name","last").
			param("wfsemail", "test@test.com").
		when().
		post("http://api.fonts.com/rest/json/Accounts/").
		then().
		statusCode(200).log().all();
		
	}

}
