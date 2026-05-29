package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newuser_signup {
	ChromeDriver driver;
	
	@Given("Launch automation exercise website")
	public void launch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
		
	}
	@When("user enter the name and email address")
	public void user_input() {
		driver.findElement(By.name("name")).sendKeys("radha");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("radha12@gmail.com");
	}

	@Then("New user should redirect to create account page")
	public void sign_up() {
		driver.findElement(By.xpath("//button[(text()='Signup')]")).click();
	}
}
