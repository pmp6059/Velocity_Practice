package byjusAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Byjus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN-Brand-BYJU%27S-USD-Exact&utm_term=byjus&gclid=CjwKCAjwv4SaBhBPEiwA9YzZvDKnjlMf8wBzzgHVl0xSnQn2iwhcxA99UMC1NGMO5ld3UfQRyBl3rBoCOewQAvD_BwE");

   WebElement text = driver.findElement(By.xpath("//h2[text()='Watch video lessons ']"));	
	
	System.out.println("Text is a "+text.getText());
	
	WebElement Byjus= driver.findElement(By.xpath("//h2[text()='Watch video lessons ']"));
	  WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control video-selection']"));
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(100);
	js.executeScript("arguments[0].scrollIntoView(true)", Byjus);
	
	//to select dropdown 
	Select s= new Select(dropdown);
	for(int i=0; i<7;i++)
	{
		Thread.sleep(100);
		s.selectByIndex(i);
		System.out.println("Available demo video for class "+ (i+4));
		 List<WebElement> video = driver.findElements(By.xpath("//div[@class='row row-inline']//a"));
		 if(video.size()==2) {
			 System.out.println("Passed");
		 }
		video.get(0).click();
		driver.switchTo().frame(0);
		WebElement videoName = driver.findElement(By.xpath("//a[@class='ytp-title-link yt-uix-sessionlink']"));
		System.out.println(videoName.getText());
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//button[@type='button'])[14]")).click();
		
		video.get(1).click();
		driver.switchTo().frame(0);
		 videoName = driver.findElement(By.xpath("//a[@class='ytp-title-link yt-uix-sessionlink']"));
		System.out.println(videoName.getText());
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//button[@type='button'])[14]")).click();
	}
	
	
	
	
	
	
	
	}

}
