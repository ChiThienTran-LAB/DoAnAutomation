package Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	@Override
	public void onFinish(ITestContext agr0) 
	{
		System.out.println("Finish all TCs");
	}
	@Override
	public void onStart(ITestContext agr0) 
	{
		System.out.println("Start Test");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult agr0) 
	{
		
	}
	@Override
	public void onTestFailure(ITestResult agr0) 
	{
		System.out.println("Hava TCs Failed");
	}
	@Override
	public void onTestSkipped(ITestResult agr0) 
	{
		System.out.println("Hava TCs Skipped");
	}
	@Override
	public void onTestStart(ITestResult agr0) 
	{
		
	}
	@Override
	public void onTestSuccess(ITestResult agr0) 
	{
		System.out.println("Test Successfully");
	}
	
}