
package marchbatch;

import org.openqa.selenium.edge.EdgeDriver;

import com.opencart.pageobjects.pageobjects;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pomeg{

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
	}

}
