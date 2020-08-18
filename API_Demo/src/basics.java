import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;


public class basics {

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
		
		RestAssured.baseURI="https://maps.googleapis.com";
		given().
				param("location", "-33.8670522,151.1957362").
				param ("radius", "500").
				//param("types", "food").
				//param("name", "harbour").
				param("key", "AIzaSyD8DE32Kc3-8pcmFXiQIXsoaBAoj3Z8QiM").
				/*header("key", "value").
				cookie("key", "value").
				body("body of request")*/
		when().
		get("/maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and().
		body("results[0].name", equalTo("Sydney")).and().
		//body("results[0].geometry.location.lat",equalTo("-33.8710748"));
		body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).and().
		header("Server", "scaffolding on HTTPServer2");
			
		
		
		
	}

}
