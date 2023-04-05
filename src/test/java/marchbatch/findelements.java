package marchbatch;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();	
		
		driver.get("https://demo.opencart.com/");
	    
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		List <WebElement> l1=driver.findElements(By.xpath("//a[@class='list-group-item']"));
		System.out.println("size of the list : "+l1.size());
		//int i;
		
		for(WebElement i:l1)
		{
			System.out.println("list is:"+i.getText());
			System.out.println("Attribute is"+i.getAttribute("class"));
			System.out.println("Attribute is"+i.getAttribute("href"));
			i.click();
		}
	
	}

}
