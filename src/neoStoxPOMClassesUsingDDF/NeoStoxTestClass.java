package neoStoxPOMClassesUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://neostox.com/");
	
	
	//read data from excel
	
		File myFile =new File("C:\\Users\\HP\\Documents\\Book5.xlsx");
	    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
	    
	    
//mobile number, password, expected username
		
        String mobNum = mySheet.getRow(0).getCell(0).getStringCellValue();
		String pass = mySheet.getRow(0).getCell(1).getStringCellValue();
		String expUserName = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		//Create object of homePage
		
		NeoStoxHomePage home =new NeoStoxHomePage(driver);
		home.clickOnSubmitButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStoxSignInPage signIn =new NeoStoxSignInPage(driver);
		signIn.enterMobNum(mobNum);
		signIn.clickOnSignInButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStoxPasswordPage pwd =new NeoStoxPasswordPage(driver);
		pwd.enterPassword(pass);
		pwd.clickOnSubmitButton();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		NeoStoxDashBoardPage dashBoard = new NeoStoxDashBoardPage(driver);
		dashBoard.handlePopUp();
		dashBoard.validateUserName(expUserName);
		dashBoard.logOutFromNeoStox();
		
		
	   
		driver.close();
}

}
