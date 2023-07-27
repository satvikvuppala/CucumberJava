package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class AirIndia {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("Browser is open and navigated to Air India website")
	public void browserOpen() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.airindia.com/");
	}
	
	@When("User accepts cookies")
	public void cookies() {
		WebElement button = driver.findElement(By.id("c-p-bn"));
		button.click();
	}
	
	@When("User enter journey details")
	public void user_enter_journey_details() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks search")
	public void clicks_search() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User taken to flight list")
	public void user_taken_to_flight_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	
}