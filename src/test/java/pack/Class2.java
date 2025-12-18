package pack;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class2 {

	
	@Test
	public void facebook() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	@Nullable
	String actualUrl = driver.getCurrentUrl();
	String expectedUrl = "https://www.facebook.com/";
	
	
	Assert.assertEquals(actualUrl, expectedUrl);
	
	System.out.println("this line will be executed only if assertion passed");
	
	}

}
