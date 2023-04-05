
package marchbatch;

import org.openqa.selenium.edge.EdgeDriver;

import com.opencart.testcase.lab11_testcases;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class lab11pom{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	lab11_testcases obj =new lab11_testcases(driver);
     driver.get("https://demo.opencart.com");
  obj.clickonmyaccount();
  obj.clickonregister();
  obj.clickonfirstname();
  obj.clickonlastname();
  obj.clickonenteremail();
  obj.clickonenterpassword();
  obj.clickoncontinuebutton();
     
	}

}
