package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day6 {

	@Parameters({"URL", "APIKey"})
	@Test
	public void ParametersTesting(String urlname, String APIKey)
	{
		//Write REST API
		System.out.println(urlname + ", " + APIKey);
	}
}
