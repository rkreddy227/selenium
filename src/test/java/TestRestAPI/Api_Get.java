package TestRestAPI;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import com.sun.tools.javac.util.Log;

public class Api_Get {

	// @Test
	public void testStatusCode() {

		given().get("https://jsonplaceholder.typicode.com/posts/3").then().statusCode(200).log().all();
	}

	// @Test
	public void tesLoging() {
		given().get("http://services.groupkt.com/country/get/iso2code/IN\r\n").then().statusCode(200).log().all();
	}

	// @Test
	public void testEqualToFunction() {

		given().get("http://services.groupkt.com/country/get/iso2code/US").then().body("RestResponse.result.name",
				equalTo("United States of America"));

	}
	
	//@Test
	public void testWithoutRoot() {
		given().
			get("http://services.groupkt.com/country/get/iso3code/ITA").
		then().
			body("RestResponse.result.name",is("Italy")).
		    body("RestResponse.result.alpha2_code",is("IT")).
		    log().all().
		    body("RestResponse.result.alpha3_code",is("ITA"));

	}

	//@Test
	public void testWithRoot() {
		given().
			get("http://services.groupkt.com/country/get/iso3code/ITA").
		then().
			//root("RestResponse.result").
			body("RestResponse.result.name",is("Italy")).
		    body("RestResponse.result.alpha2_code",is("IT")).
		    log().all().
		    body("RestResponse.result.alpha3_code",is("ITA"));

	}
	
	

	
	
}
