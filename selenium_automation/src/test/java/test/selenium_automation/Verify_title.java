package test.selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_title {

	@Test
	void verifytitle() {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.cravitaindia.com/");
		String expected_title="Home | cravita Technologues";
		String actual_title = driver.getTitle();
		System.out.println(driver.getTitle());
		if(expected_title.equals(actual_title)) {
			System.out.println("Cravita Title is matched!!");
		}
		else {
			System.out.println("Cravita Title is not matched!!");
		}
		
	
		
	}
}
