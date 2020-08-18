
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import files.reusableMethods;
import files.payLoad;


public class staticJSON {

	@Test ()
	//public static void main(String[] args) 
	void addBook(String isbn, String aile) throws IOException
	{
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "http://216.10.245.166";
		
		//Task1 - Grab the complete response and print
		Response res = given().
		body(GenerateStringFromResource("C:\\Users\\SHARMSX14\\Desktop\\GL\\AddBookDetails.JSON")).
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


	public String GenerateStringFromResource (String path) throws IOException
	{
		return new String(Files.readAllBytes(Paths.get(path)));
	}


}