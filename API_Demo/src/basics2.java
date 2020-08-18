import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static org.hamcrest.Matchers.equalTo;

public class basics2 {
	
	//In POST, we have three different types of parameter;
	//1. Path parameter
	//2. Query parameter
	//3. Header parameter
	
	
	@Test
	public void postData()
	{
		//Create a place		
		String bd = "{\r\n" + 
				"    \"location\":{\r\n" + 
				"        \"lat\" : -38.383494,\r\n" + 
				"        \"lng\" : 33.427362\r\n" + 
				"    },\r\n" + 
				"    \"accuracy\":50,\r\n" + 
				"    \"name\":\"Frontline house\",\r\n" + 
				"    \"phone_number\":\"(+91) 983 893 3937\",\r\n" + 
				"    \"address\" : \"29, side layout, cohen 09\",\r\n" + 
				"    \"types\": [\"shoe park\",\"shop\"],\r\n" + 
				"    \"website\" : \"http://google.com\",\r\n" + 
				"    \"language\" : \"French-IN\"\r\n" + 
				"}";
		
		RestAssured.baseURI = "http://216.10.245.166";
		
		//Task1 - Grab the complete response and print
		given().queryParam("key", "qaclick123").
		body(bd).
		when().
			post("/maps/api/place/add/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		body("status" , equalTo("OK"));
	}
}
