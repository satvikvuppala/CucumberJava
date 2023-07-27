package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class lufthansa {

	WebDriver driver = new ChromeDriver();

	@Given("browser is opened")
	public void browser_is_opened() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");

	}

	@And("browser navigates to lufthansa website")
	public void browser_navigates_to_lufthansa_website() {
		driver.navigate().to("https://www.lufthansa.com/");

		driver.manage().window().maximize();
	}

	@When("user accepts the cookies")
	public void user_accepts_the_cookies() {
		WebElement button = driver.findElement(By.id("cm-acceptAll"));
		button.click();
	}

	@And("lufthansa webite opens")
	public void lufthansa_webite_opens() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Website is open");
	}

	@And("user enter from and to details")
	public void enterDetails() throws InterruptedException {
		WebElement from = driver.findElement(By.xpath("(//input[@placeholder='From'])"));
		Thread.sleep(2000);
		from.sendKeys(Keys.BACK_SPACE);
		from.clear();
		Thread.sleep(2000);
		from.sendKeys("Delhi");
		Thread.sleep(2000);
		from.sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("(//input[@placeholder='To'])")).sendKeys("Mumbai");

		Thread.sleep(3000);
	}
	
	@And("enter fly date")
	public void dates() throws InterruptedException {
		
		WebElement datesFromTO = driver.findElement(By.name("flightQuery.flightSegments[0].travelDatetime"));
		Thread.sleep(3000);
		datesFromTO.click();
	}
	
	@And("clicks on enter")
	public void clicks_on_enter() {
		WebElement enterButton = driver.findElement(By.cssSelector(".btn.btn-primary")); 
		enterButton.click();
	}

	@Then("browser should close")
	public void browser_should_close() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}

	@And("inform user test successful")
	public void test_successful() {
		System.out.println("Test is successfully complete");
	}

}
