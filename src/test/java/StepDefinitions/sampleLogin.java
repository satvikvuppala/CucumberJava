package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class sampleLogin {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("Browser is open and navigated to the website")
	public void browserOpen() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("users.dir")+"[src/main/java/drivers/chromedriver.exe]");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.webdriveruniversity.com/Login-Portal/index.html");
		
	}

	@When("Login button is clicked")
	public void loginButton() {
		
		driver.findElement(By.xpath("(//a[@id=\"login-portal\"])"));
		
	}

	@And("username and password are added")
	public void username_and_password() {
		
		driver.findElement(By.xpath("(//*[@id='text'])")).sendKeys("webdriver");
		driver.findElement(By.xpath("(//*[@id='password'])")).sendKeys("webdriver123");
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
		
		driver.findElement(By.xpath("(//*[@id='login-button'])")).click();
		
	}

//	@Then("Browser closes")
//	public void browserClose() {
//		driver.quit();
//	}
	
}