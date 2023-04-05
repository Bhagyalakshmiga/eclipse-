package marchbatch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
WebDriver driver= new EdgeDriver();
driver.get("https://demo.opencart.com/");
driver.manage().window().maximize();
String expectedtitle="Your Store";
String actualtitle=driver.getTitle();
System.out.println("Open Cart title" + actualtitle);
Assert.assertTrue(actualtitle.equalsIgnoreCase(expectedtitle),"Page title not matched");
driver.findElement(By.linkText("Desktops")).click();
driver.findElement(By.linkText("Mac (1)")).click();
WebElement heading = driver.findElement(By.xpath("//*[@id=\"content\"]/h2"));
System.out.println(heading.getText());
Select sortlist1 = new  Select(driver.findElement(By.id("input-sort")));
sortlist1.selectByIndex(1);
driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();	
System.out.println("Item added to cart succesfully");
	}

}
