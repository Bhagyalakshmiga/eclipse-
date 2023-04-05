package marchbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=20_27");

		Select sortlist1 = new  Select(driver.findElement(By.id("input-sort")));
		sortlist1.selectByIndex(6);
		Select sortlist2 = new  Select(driver.findElement(By.id("input-limit")));
		
		
		//Thread.sleep(30);
		sortlist2.selectByIndex(2);
	}

}
