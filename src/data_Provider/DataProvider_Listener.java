//package data_Provider;
//
//import java.io.IOException;
//
//
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//import org.testng.Reporter;
//
//
//
//public class DataProvider_Listener extends Base_dataProvider implements ITestListener
//{
//
//	@Override
//	public void onTestFailure(ITestResult result)
//	{
//  		try 
//			{
//				Reporter.log("TC "+result.getName()+" failed", true);
//				Utility_Data_Provider.takesScreenshot(driver, result.getName());
//				
//			}
//			catch (IOException e) 
//			{
//
//				e.printStackTrace();
//			}
//		
//	}
//	
//	@Override
//	public void onTestSuccess(ITestResult result)
//	{
//		
//		try {
//			Reporter.log("TC "+result.getName()+"passed", true);
//			Utility_Data_Provider.takesScreenshot(driver, result.getName());
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//	}
//
//	}
