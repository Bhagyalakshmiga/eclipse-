package com.makemytrip.pageobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class pgobj2 {
	
    WebDriver driver;
	By hotels= By.linkText("Hotels");
	By search=By.xpath("//button[@id='hsw_search_button']");
	By findlocation=By.xpath("//div[@id='_Hlisting_area']/div[2]/div/div[2]/div[2]/div/input");//div[@id='_Hlisting_area']/div[2]/div/div[2]/div[2]/div/input
	By location=By.linkText("South Goa, Goa");
	By hotel=By.xpath("//*[@id=\"htl_id_seo_201905301952544998\"]");
	By bookhotel=By.linkText("BOOK THIS NOW");
	By firstname=By.id("fName");
	By lastname=By.id("lName");
	By email=By.id("email");
	By mobileno=By.id("mNo");

	public  pgobj2(WebDriver driver)
      {	
		this.driver=driver;
      }

	public void clickonhotels()
	{
		 driver.manage().window().maximize();
		 driver.findElement(hotels).click();
	}
	public void clickonsearch() 
	{
		driver.findElement(search).click();
	}
	public void clickonfindlocation() {
		driver.findElement(findlocation).sendKeys("Goa");
	}
	public void enterlocation() {
		WebElement ele=driver.findElement(location);
		Actions builder= new Actions(driver);
		builder.moveToElement(ele).perform();
		ele.click();
	}
	public void selecthotel() throws Exception {
		driver.getWindowHandle();
		driver.findElement(hotel).click();		
	    List <String> l1 = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(l1.get(1));				
	}
	public void clickonbookhotel() {
		driver.findElement(bookhotel).click();
	}
    public void clickonfirstname() {
    	driver.findElement(firstname).sendKeys("Abcd");
	}
	public void clickonlastname() {
		driver.findElement(lastname).sendKeys("G");
	}public void clickonemail() {
		driver.findElement(email).sendKeys("abc@gmail.com");		
	}
    public void clickonmobileno() {
    	driver.findElement(mobileno).sendKeys("123456789");
    	driver.quit();
	}
    
    
}



