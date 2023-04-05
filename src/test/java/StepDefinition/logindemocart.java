package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logindemocart {
	WebDriver driver = new EdgeDriver();
	@Given("Launch the URL")
	public void launch_the_url() {
		WebDriverManager.edgedriver().setup();
		driver.get("https://demo.opencart.com/");
	}

	@And("Navigate to login page")
	public void navigate_to_login_page() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
	}

	@And("Enter username and password")
	public void enter_username_and_password() {
		driver.findElement(By.id("input-email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		
	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();    
	}

	@Then("Login should be successful")
	public void login_should_be_successful() {
		System.out.println("Login successful ");
	}

}
