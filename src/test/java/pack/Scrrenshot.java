package pack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Scrrenshot {

	public static void main(String[] args) throws InterruptedException, IOException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("myuser");

		TakesScreenshot ts = (TakesScreenshot)driver; 
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dst = new File("screenshot.png");
			
			Files.copy(src,dst);
			
				
	}

}
