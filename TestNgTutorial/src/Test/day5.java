package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day5 {

	@Parameters({"URL"})
	@Test
	public void ParametersTesting(String urlname)
	{
		//Write REST API
		System.out.println(urlname);
	}
}
