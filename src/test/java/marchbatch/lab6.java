package marchbatch;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[@class='navbar-toggler']")).click();
		
		driver.findElement(By.linkText("Components")).click();
		
		driver.findElement(By.linkText("Monitors (2)")).click();
		driver.findElement(By.linkText("Apple Cinema 30\" ")).click();
		
	}

}
