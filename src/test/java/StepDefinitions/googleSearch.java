package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class googleSearch {

	WebDriver driver;
	
	By txt_text = By.name("q");
//	By txt_results = By.

	@Given("browser is open")
	public void browser_is_open() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		System.out.println("Given is working");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com/");
	}

	@When("^user enters a (.*) in search box$")
	public void user_enters_a_text_in_search_box(String text) {
		driver.findElement(txt_text).sendKeys(text);
	}
	
	@When("user enters {string} and {string} in search box")
	public void user_enters_and_in_search_box(String string1, String string2) {
		driver.findElement(txt_text).sendKeys(string1+" "+string2);
	}
		
	@And("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^user is navigated to search (.*)$")
	public void user_is_navigated_to_search_results(String results) {
		if (driver.getPageSource().contains(results)) {
			System.out.println("Search successful");
		}

		else {
			System.out.println("Search unsuccessful");
		}
	}

	@And("browser closes")
	public void browser_closes() {
		System.out.println("Next Testing");
//		driver.close();
//		driver.quit();
	}
}
