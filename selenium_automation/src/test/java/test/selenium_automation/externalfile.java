package test.selenium_automation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class externalfile {

	@Test
	void fileread() throws IOException, InterruptedException {
		
		FileReader  fl = new FileReader("C:\\Users\\Harshada Mane\\git\\test\\selenium_automation\\src\\test\\java\\test\\selenium_automation\\base.properties");
		
		Properties p = new Properties();
		p.load(fl);
		
		// test scenario : launch fortunecloud and check all the image display
		
		ChromeDriver driver = new ChromeDriver();
		// check wheterr cravita title displying on only home page 
		driver.get(p.getProperty("fcturl"));
		Thread.sleep(2000);
		driver.close();
	}
}