package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class day7 {

	@Test (dataProvider="getData")
	public void ParametersTesting(String u, String p)
	{
		System.out.println(u + ", " + p);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - Testing with username/password
		//2nd combination - Another username/password - no credit history
		//3rd combination - Fraudlent credit history
		
		Object[][] data = new Object[3][2];
		
		//1st set
		data[0][0] = "firstsetusername";
		data[0][1] = "firstsetpassword";
		//2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondsetpassword";
		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdsetpassword";
				
		return data;		
	}
}
