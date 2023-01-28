package selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1st_seleniumCode {

	public static void main(String[] args) {
		//set the path of executable browser driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(); //Parent p=new Child(Webdriver = Parent & Chromedriver= Child)
	    driver.get("https://vctcpune.com/");

	    
	}

}
