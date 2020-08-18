package Test;

import org.testng.annotations.Test;

public class day4 {

	@Test (groups={"Smoke"})
	public void WebLoginHomeLoan()
	{
		//Write selenium code for web login
		System.out.println("WebLoginHomeLoan");
	}
	
	@Test
	public void MobileLoginHomeLoan()
	{
		//Write Mobile code for login using Appium
		System.out.println("MobileLoginHomeLoan");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		//Write REST API
		System.out.println("LoginAPIHomeLoan");
	}
	
}
