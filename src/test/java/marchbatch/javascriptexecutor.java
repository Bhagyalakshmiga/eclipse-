package marchbatch;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("alert ('Hello world!')");
		

	}

}
