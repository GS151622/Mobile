package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test (groups={"Smoke"})
	public void PersonalLoan()
	{
		System.out.println("Personal Loan");
	}
	
	@BeforeTest
	public void PreRequisite()
	{
		System.out.println("I will execute first");
	}
}
