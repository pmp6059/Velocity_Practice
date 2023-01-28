package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Scrn_Eg2 {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/");
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String str = RandomString.make(4);  //to add random string this will avoid overwriting of file
	
	File destination=new File("C:\\chromedriver_win32\\Screenshot\\Screenshot1"+str+".jpg");
  FileHandler.copy(source, destination);
}
}
