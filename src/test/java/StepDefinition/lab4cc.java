package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class lab4cc {
	WebDriver driver= new EdgeDriver();
	@Given("Launch the URl")
	public void launch_the_u_rl() {
		WebDriverManager.edgedriver().setup();
		driver.get("https://demo.opencart.com/");		
	}

	@And("Maximize the Window")
	public void maximize_the_window() {
		driver.manage().window().maximize();
	}

	@And("verify page title")
	public void verify_page_title() {
		String expectedtitle="Your Store";
		String actualtitle=driver.getTitle();
		System.out.println("Open Cart title" + actualtitle);
		Assert.assertTrue(actualtitle.equalsIgnoreCase(expectedtitle),"Page title not matched");  
	}

	@And("click on Desktops drop down")
	public void click_on_desktops_drop_down() {
		driver.findElement(By.linkText("Desktops")).click();
	}
	@And("click on Mac")
	public void click_on_mac() {
		driver.findElement(By.linkText("Mac (1)")).click();		
	}
	@And("verify Mac")
	public void verify_mac() {
	WebElement heading = driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));
	System.out.println(heading.getText()) ;
    }
	@And("click on sort by from a-z")
	public void click_on_sort_by_from_a_z() {
		Select sortlist1 = new  Select(driver.findElement(By.id("input-sort")));
		sortlist1.selectByIndex(1);		    
	}

	@When("click on add to cart")
	public void click_on_add_to_cart() {
		driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();	
	}

	@Then("item should be added to cart")
	public void item_should_be_added_to_cart() {		
	System.out.println("Item added to cart succesfully");
  
	
	}

}
