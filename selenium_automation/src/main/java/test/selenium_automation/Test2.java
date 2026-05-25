package test.selenium_automation;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://student.dbatu.ac.in/erp/index.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.myntra.com/");
		
		System.out.println("Title of myntra "+driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://onlinesbi.sbi.bank.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://student.dbatu.ac.in/erp/index.aspx");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().refresh();
		
		System.out.println("Url OF university : "+driver.getCurrentUrl());
		
		driver.close();
		
	}

}
