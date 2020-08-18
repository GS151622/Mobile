package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class day3 {

	@BeforeClass
	public void BFClass()
	{
		System.out.println("Executing before class");
	}
	
	@AfterClass
	public void AFClass()
	{
		System.out.println("Executing after class");
	}
	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I'm number last number");
	}
	
	@Test (groups={"Smoke"})
	public void WebLoginCarLoan()
	{
		//Write selenium code for web login
		System.out.println("webLoginCarLoan");
	}
	
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("I'm number 1");
	}
	
	@BeforeMethod
	public void BeforeEveryMethod()
	{
		System.out.println("I will exceute before every test method");
	}
	
	@AfterMethod
	public void AfterEveryMethod()
	{
		System.out.println("I will exceute after every test method");
	}
	
	
	@Test(dependsOnMethods= {"LoginAPICarLoan", "WebLoginCarLoan"})
	public void MobileLoginCarLoan()
	{
		//Write Mobile code for login using Appium
		System.out.println("MobileLoginCarLoan");
	}
	
	@Test//(enabled=false)  //(timeOut=4000)
	public void LoginAPICarLoan()
	{
		//Write REST API
		System.out.println("LoginAPICarLoan");
	}
	}
