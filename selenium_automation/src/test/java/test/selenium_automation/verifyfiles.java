package test.selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyfiles {

	@Test
	void checktitle() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.fortunecloudindia.com/");
		String expected_title ="Fortune Cloud Technologies";
		String actual_title = driver.getTitle();
		Assert.assertEquals(expected_title,actual_title);
		
	}
}
