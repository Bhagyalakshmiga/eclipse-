package marchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab3 {
@Test
	public void testcase() {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.get("https://demo.opencart.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("Desktops")).click();
driver.findElement(By.linkText("Mac (1)")).click();
Select sortlist1 = new  Select(driver.findElement(By.id("input-sort")));
sortlist1.selectByIndex(1);
driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();	
	}

}
