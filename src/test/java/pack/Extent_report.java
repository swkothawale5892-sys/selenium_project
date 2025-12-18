package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_report {

	

		@BeforeSuite
		public void setUp() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		extent.createTest("simple test").pass("test passed");
		extent.flush();
		
		}		
		
		@Test
		public void test1() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.instagram.com/accounts/login/?hl=en");
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("myuser");

			
		}
	

}
