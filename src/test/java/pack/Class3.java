package pack;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class3 {

	

	@Test
	public void youtube() {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		@Nullable
		String actualOut = driver.getCurrentUrl();
		String expectedOut = "https://www.youtube.com/";
		
		SoftAssert as = new SoftAssert();
		as.assertEquals(expectedOut, actualOut);
		
		System.out.println("this will execute ");
		as.assertAll();
	}
}
