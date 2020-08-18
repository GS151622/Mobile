import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;
import files.reusableMethods;

public class basics5 {

	@Test
	//public static void main(String[] args) 
	void TestCase1()
	{
		// TODO Auto-generated method stub
		
		//This is our GET request
		/*https://maps.googleapis.com/maps/api/place/nearbysearch/json?
			location=-33.8670522,151.1957362&
			radius=500  &
			types=food&
			name=harbour&
			key=AIzaSyD8DE32Kc3-8pcmFXiQIXsoaBAoj3Z8QiM
			*/
		
		//Logging using given.log.all() methods
		RestAssured.baseURI="https://maps.googleapis.com";
		Response res = given().
				param("location", "-33.8670522,151.1957362").
				param ("radius", "500").
				//param("types", "food").
				//param("name", "harbour").
				param("key", "AIzaSyD8DE32Kc3-8pcmFXiQIXsoaBAoj3Z8QiM").log().all().
				/*header("key", "value").
				cookie("key", "value").
				body("body of request")*/
		when().
		get("/maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("results[0].name", equalTo("Sydney")).and().
		//body("results[0].geometry.location.lat",equalTo("-33.8710748"));
		body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).log().all().and().
		header("Server", "scaffolding on HTTPServer2").log().all().and().
		extract().response();
		
		JsonPath js = reusableMethods.rawToJson(res);
		int resSize = js.get("results.size()");
		System.out.println(resSize);
		
		for(int i=0; i<resSize;i++)
		{
			System.out.println(js.get("results["+i+"].name").toString());
		}
			
		
		
		
	}

}
