package test.selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	@Test
	void check() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String expected_Title = "OrangeHRM";
		String actual_title=driver.getTitle();
		Assert.assertEquals(expected_Title,actual_title);
		
		driver.close();
		
		
	}
}
