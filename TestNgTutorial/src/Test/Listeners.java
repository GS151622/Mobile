package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListerner Interface - Has all methods for testng listening
public class Listeners implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test case failed: " + result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test case success");
	}
}
