package test.selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class saudedemo {
	EdgeDriver driver;
	@Test
	void usenamepass1() throws InterruptedException {
		driver =new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		//driver.findElement(By.id("logout_sidebar_link")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	void usenamepass2() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		//driver.findElement(By.id("logout_sidebar_link")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	

}
