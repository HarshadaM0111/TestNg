package test.selenium_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		
		// alert with ok
		al.accept();
		Thread.sleep(2000);
		
		//alert with cancle
		al.dismiss();
		
		driver.close();
	}

}
