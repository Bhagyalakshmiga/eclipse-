package marchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class lab5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();	
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("ab");
		driver.findElement(By.id("input-lastname")).sendKeys("cd");	
		driver.findElement(By.id("input-email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("123456");
		driver.findElement(By.id("input-newsletter-yes")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		System.out.println("Title of the browser is :"+driver.getTitle());		
	}

}
