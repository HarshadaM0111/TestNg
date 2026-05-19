package test.selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ohrmlogin {
	
	ChromeDriver driver;
	
	@Test
	
	void logintest() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.tagName("button")).click();
		System.out.println("Login succefully!");
		
	}
	
	@AfterTest
	void logoutTest() {
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		System.out.println("LogOut Successfully");
		driver.close();
	}

	@BeforeTest
	void launch() {
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		System.out.println("Launch website");
	}
		
	
}
