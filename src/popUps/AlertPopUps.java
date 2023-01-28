package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {
public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/delete_customer.php");
	 Thread.sleep(100);
	 driver.findElement(By.name("submit")).click();
	 
	 Alert alt = driver.switchTo().alert();
	 
	 // alt.accept(); clicking on ok button
	 
	 System.out.println(alt.getText());//getting alert pop ups text
	 alt.dismiss();// Clicking on cancel button
	 
	String text = driver.findElement(By.xpath("//h2[text()='Guru99 Bank']")).getText();
	 System.out.println("Text is " + text);
	 
}
}
