package TestRestAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import com.sun.tools.javac.util.Log;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class basicsapi3 {

	//https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=1500&type=restaurant&keyword=cruise&key=YOUR_API_KEY
	@Test()
	public void AddandDeletePlace() {
		
		RestAssured.baseURI= "https://maps.googleapis.com";
		
		given().
		param("location","-33.8670522,151.1957362").
		param("radius","500").
		param("key", "AIzaSyDKZ4nIn528cxZkLicFCcfsrkl6VzJXYTc").
		when().
		get("/maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		
		body("results[0].name", equalTo("Sydney"));
		//body("status",equalTo("OK"));
		
		
		
	}

}
