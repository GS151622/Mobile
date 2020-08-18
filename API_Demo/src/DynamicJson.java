import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import files.reusableMethods;
import files.payLoad;


public class DynamicJson {

	@Test (dataProvider = "DataForBooks")
	//public static void main(String[] args) 
	void addBook(String isbn, String aile)
	{
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "http://216.10.245.166";
		
		//Task1 - Grab the complete response and print
		Response res = given().
		body(payLoad.addBook(isbn, aile)).
		when().
			post("/Library/Addbook.php").
		then().assertThat().statusCode(200).
		extract().response();				
		
		JsonPath js = reusableMethods.rawToJson(res);
		String id = js.get("id");
		System.out.println(id);
	}
	
	
	@DataProvider (name = "DataForBooks")
	public Object[][] getData()
	{
		return new Object[][] {{"ASDcfv12","sasafswa412"},{"DJMKCdnw812","HHDnbNBH12"}};
	}
}