package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{

@Override	
public void onTestFailure(ITestResult result)
{
	String tcName = result.getName();
	Reporter.log("TC "+tcName+" is failed,try again", true);
}
@Override
public void onTestSuccess(ITestResult result)
{
	Reporter.log("TC "+result.getName()+" is successfully passed", true);
}
@Override
public void onTestSkipped(ITestResult result)
{
	Reporter.log("TC "+result.getName()+" is skipped", true);
}

}
