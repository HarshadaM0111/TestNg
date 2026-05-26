package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmail {
	
	@Given("user should be registerd withvalid creadential")
	public void first() {
		System.out.println("Precondition : user should be registerd!");
	}

	@When("user enter email and password")
	public void second() {
		System.out.println("Email : harshada123@gmail.com");
		System.out.println("Password : harshada@123");
	}
	
	@Then("gmail login successfull")
	public void third() {
		System.out.println("Login successsfully");
	}
}
