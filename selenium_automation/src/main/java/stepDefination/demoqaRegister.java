package stepDefination;



import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demoqaRegister {
	EdgeDriver ed;
	@Given("Register page should be luanch in egdebroweser")
	public void launch() {
		ed= new EdgeDriver();
		ed.get("https://demoqa.com/register");
		ed.manage().window().maximize();
	}

	@When("Enter the firstname as {string} and lastname as {string}")
	public void enter_the_firstname_as_and_lastname_as(String fname, String lname) {
	    ed.findElement(By.id("firstname")).sendKeys(fname);
	    ed.findElement(By.id("lastname")).sendKeys(lname);
	}

	@When("enter the username as {string} and password as {string}")
	public void enter_the_username_as_and_password_as(String uname, String pass) {
	    ed.findElement(By.id("userName")).sendKeys(uname);
	    ed.findElement(By.id("password")).sendKeys(pass);
	}
	@Then("register should successful with three records")
	public void btn() {

	    WebDriverWait wait =
	            new WebDriverWait(ed, Duration.ofSeconds(10));

	    WebElement regbtn = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                    By.id("register")
	            )
	    );

	    JavascriptExecutor js =
	            (JavascriptExecutor) ed;

	    js.executeScript(
	            "arguments[0].scrollIntoView(true);",
	            regbtn
	    );

	    js.executeScript(
	            "arguments[0].click();",
	            regbtn
	    );

	    System.out.println("Register button clicked");
	}
}