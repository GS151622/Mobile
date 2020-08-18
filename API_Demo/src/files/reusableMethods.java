package files;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class reusableMethods {
	public static JsonPath rawToJson(Response r)
	{
		String response = r.asString();
		JsonPath jp = new JsonPath(response);
		return jp;
	}
}
