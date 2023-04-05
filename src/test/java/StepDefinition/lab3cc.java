package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class lab3cc {
	
	WebDriver driver= new EdgeDriver();
	@Given("Launch the url")
	public void launch_the_url() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/");  
	}

	@And("Maximize window")
	public void maximize_window() {
		driver.manage().window().maximize();
	}

	@And("click on Desktops")
	public void click_on_desktops() {
		driver.findElement(By.linkText("Desktops")).click();
		}
	@And("click on mac")
	public void click_on_mac() {
		driver.findElement(By.linkText("Mac (1)")).click();  
	}

	@And("click on Sortby")
	public void click_on_sortby() {
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Mac (1)")).click();  	   
	}
	@When("click on addtocart")
	public void click_on_add_to_cart() {
		driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();	
	}
	@Then("Item should be added to cart")
	public void item_should_be_added_to_cart() {
		driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();	

	}


}
