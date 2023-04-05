package unacademyproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testcase {
	
	public static void main(String[] args) throws InterruptedException, IOException {
 	
	String Projectpath=System.getProperty("user.dir");
    ExtentReports extent=new ExtentReports();
    ExtentSparkReporter spark= new ExtentSparkReporter(Projectpath+"\\Reports\\Tc1.html");
    extent.attachReporter(spark);
    ExtentTest test=extent.createTest("Book a Room");
    String propertypath= ("C:\\Users\\Administrator\\eclipse-workspace\\marchbatch\\src\\test\\java\\unacademyproject\\inputparameters");
    propertypath=propertypath.trim();
    InputStream input=new FileInputStream(propertypath);
    Properties prob=new Properties();
    prob.load(input);
    String url=prob.getProperty("url");
    
    WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
    Thread.sleep(20);
    driver.findElement(By.linkText("Hotels")).click();
    Thread.sleep(20);
	driver.findElement(By.id("hsw_search_button")).click();
	Thread.sleep(200);
	driver.findElement(By.xpath("//*[@id=\"_Hlisting_area\"]/div[2]/div/div[2]/div[2]/div/input")).sendKeys("Goa");
	WebElement ele=driver.findElement(By.linkText("South Goa, Goa"));
	Actions builder= new Actions(driver);
	builder.moveToElement(ele).perform();
	ele.click();
     driver.getWindowHandle();
	driver.findElement(By.xpath("//*[@id=\"htl_id_seo_201905301952544998\"]")).click();
	Thread.sleep(60);
    List <String> l1 = new ArrayList<String>(driver.getWindowHandles());

    driver.switchTo().window(l1.get(1));
	 driver.findElement(By.linkText("BOOK THIS NOW")).click();
	//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/span/div/div/div[1]/div[2]/span")).click();
	driver.findElement(By.id("fName")).sendKeys("Abcd");
	driver.findElement(By.id("lName")).sendKeys("G");
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	driver.findElement(By.id("mNo")).sendKeys("123456789");
    
	
	if(driver.findElement(By.id("mNo")).isDisplayed())
	{
		System.out.println("Hotel Booked");
	}
	else
	{
		System.out.println("Hotel not Booked");	
	}
	extent.flush();
}
}