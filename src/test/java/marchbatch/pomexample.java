
package marchbatch;

import org.openqa.selenium.edge.EdgeDriver;

import com.opencart.pageobjects.pageobjects;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pomexample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	pageobjects obj =new pageobjects(driver); 
	
driver.get("https://demo.opencart.com");
	 obj.clickonmyaccount();
	 obj.clickonlogin();
	 obj.clickonenteremail();
	 obj.clickonenterpassword();
	 obj.clickonloginbutton();
	 
	
	/*driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.id("input-email")).sendKeys("abcd@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	*/
	}

}
