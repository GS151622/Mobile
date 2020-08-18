package Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void LastExecution()
	{
		System.out.println("I will exceute last");
	}
	
	@Test (groups={"Smoke"})
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@Test
	public void SecondDemo()
	{
		System.out.println("Bye");
	}
}
