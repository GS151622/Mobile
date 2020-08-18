import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class basics3 {

	@Test
	public void postAndDeleteData()
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
		Response res = given().queryParam("key", "qaclick123").
		body(bd).
		when().
			post("/maps/api/place/add/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		body("status" , equalTo("OK")).
		extract().response();
		//The response is raw; we need to convert this raw response into to string
		
		String resString = res.asString();
		System.out.println(resString);
		
		//Task2 - Grab the place ID from response
		//https://jsoneditoronline.org/
		JsonPath jp = new JsonPath(resString);
		//JsonPath automatically convert the string in JSON structure so that we can read
		//it easily.
		String placeId = jp.get("place_id");
		System.out.println("Place_id - " + placeId);
		
		
		//Task 3 - Place this place_id into delete request
		
		given().queryParam("key", "qaclick123").
		body("{"+
			 "\"place_id\" : \""+placeId+"\""+
				"}").
		when().
		post("/maps/api/place/delete/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("status", equalTo("OK"));
	}
}
