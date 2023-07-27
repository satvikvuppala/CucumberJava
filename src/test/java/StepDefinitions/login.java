package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {

	@Given("user is on login page")
	public void a1() {
		System.out.println("Hello, Given is working");
	}

	@When("user enters username and password")
	public void a2() {
		System.out.println("Hello, When is working");
	}

	@And("user clicks on login button")
	public void a3() {
		System.out.println("Hello, And is working");
	}

	@Then("user is navigated to the home page")
	public void a4() {
		System.out.println("Hello, Then is working");
	}
}
