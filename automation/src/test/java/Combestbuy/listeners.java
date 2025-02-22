package Combestbuy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners extends Common implements ITestListener{

	

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((Common)result.getInstance()).driver;
		try {
			shots1("pass");
		} catch (IOException e) {
		  e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=((Common)result.getInstance()).driver;
		try {
			shots1("fail");
		} catch (IOException e) {
		  e.printStackTrace();
		}
	}
	
}

	
