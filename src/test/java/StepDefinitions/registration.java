package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class registration {
	WebDriver driver = new ChromeDriver();
	
	@Given("Browser is open") 
	public void browser_open() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Desktop\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver.manage().window().maximize();
	}

	@And("Lufthansa website is opened")
	public void website_open() {
		driver.navigate().to("https://lufthansa.miles-and-more.com/web/row/en/login.html?client_id=yA8iz2C5BnAIf2GKKdkAlgPPW9y6wjLO&target_state=AUTHENTICATED&target_url=https://consent.msp.miles-and-more.com/&response_type=code&redirect_uri=https%3A%2F%2Fwww.lufthansa.com&scope=AUTHENTICATED%20IDENTIFIED%20urn%3Amilesandmore%3Atech%3Abackground%3Av1%3Aactive&state=%2Fin%2Fen%2Fhomepage&principal_type=EMAIL&reduced_state=NONE&prompt=login&consentmgr=c1%3A1%257Cc2%3A0%257Cc3%3A0%257Cc4%3A0%257Cts%3A1686549031583%257Cconsent%3Atrue&utag_main=v_id%3A01882dba02d3001ac236828d48e60508100280790086e%24_sn%3A16%24_se%3A22%24_ss%3A0%24_st%3A1686550831583%24dc_visit%3A15%24ses_id%3A1686217014604%253Bexp-session%24_pn%3A4%253Bexp-session%24dc_event%3A21%253Bexp-session");
//		WebElement button = driver.findElement(By.id("cm-acceptAll"));
//		button.click();
	}
	
	@And("Registration page is opened")
	public void website_check() {
		driver.getCurrentUrl();	
		System.out.println("Website is open");
	}
	
	@And("Email Id is entered")
	public void email() {
		WebElement emailTextElement = driver.findElement(By.xpath("(//input[@type='email'])"));
		emailTextElement.sendKeys("abcxyz@gmail.com");
		
		driver.findElement(By.xpath("(//button[@type='submit'])")).click();
	}
	
	@Then("Browser closes")
	public void close() {
		driver.quit();
	}
	
}