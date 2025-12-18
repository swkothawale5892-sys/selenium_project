package pack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Class1 {
	
	WebDriver driver = new ChromeDriver();

	@Test
	public void initialize() {
		
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	}
	
	@Test (dependsOnMethods = "initialize")
	public void test() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("myuser");

	}
	@BeforeTest
	public void bike() {
		System.out.println("bike started now");
	}
}
