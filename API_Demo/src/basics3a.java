import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import files.resources;
import files.payLoad;

public class basics3a {
	
	Properties prop = new Properties();
	
	@BeforeTest()
	public void getData() throws IOException
	{
		FileInputStream fs = new FileInputStream("C:\\Users\\SHARMSX14\\eclipse-workspace\\API_Demo\\src\\files\\env.properties");
		prop.load(fs);
	}
	
	
	@Test
	public void postAndDeleteData()
	{
		//Create a place		
				
		RestAssured.baseURI  = prop.getProperty("HOST");
		
		//Task1 - Grab the complete response and print
		Response res = given().queryParam("key", "qaclick123").
		body(payLoad.getPostData()).
		when().
			post(resources.placePostData()).
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
		
		given().queryParam("key", prop.getProperty("KEY")).
		body("{"+
			 "\"place_id\" : \""+placeId+"\""+
				"}").
		when().
		post(resources.deletePostData()).
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("status", equalTo("OK"));		
	}
}
