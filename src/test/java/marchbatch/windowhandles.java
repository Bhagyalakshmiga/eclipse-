package marchbatch;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://letcode.in/windows");
        String Windowhandle = driver.getWindowHandle();
        System.out.println("first window:"+Windowhandle);
        driver.findElement(By.id("multi")).click();
        List <String> l1 = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(l1.size());  
        
        int i;
        for(i=0; i<l1.size();i++)
        {
        	System.out.println(l1.get(i));
        	driver.switchTo().window(l1.get(i));
        	System.out.println("url is : "+driver.getCurrentUrl());	
        }
        
        driver.switchTo().window(l1.get(1));
        driver.findElement(By.id("accept")).click();
		Alert simplealert= driver.switchTo().alert();
		System.out.println("Alert is: " +simplealert.getText());
	    simplealert.accept();
	}


}
