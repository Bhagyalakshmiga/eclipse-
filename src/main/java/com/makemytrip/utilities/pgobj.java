package com.makemytrip.utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class pgobj {
	
    WebDriver driver;

    @FindBy(linkText="Hotels")
    WebElement hotellink;
    @FindBy(xpath="//button[@id='hsw_search_button']")
    WebElement searchbutton;
    @FindBy(xpath="//*[@id=\\\"_Hlisting_area\\\"]/div[2]/div/div[2]/div[2]/div/input")
    WebElement searchlocation;
    @FindBy(linkText="South Goa, Goa")
    WebElement location;
    @FindBy(xpath="//*[@id=\\\"htl_id_seo_201905301952544998\\\"]")
    WebElement Selecthotel;
    @FindBy(linkText="BOOK THIS NOW")
    WebElement BookThisNow ;
    @FindBy(id="fName")
    WebElement firstname;
    @FindBy(id="lName")
    WebElement lastname;
    @FindBy(id="email")
    WebElement email;
    //@FindBy(id="mNo")
    //WebElement mobileno;
    

    public void clickonhotels()
	{
		 driver.manage().window().maximize();
		 hotellink.click();
	}
	public void clickonsearch() 
	{
		searchbutton.click();
	}
	public void clickonfindlocation() {
		searchlocation.sendKeys("Goa");
	}
	public void enterlocation(String location1,WebDriver driver) {
        WebElement ele=driver.findElement(By.linkText(location1));
		Actions builder= new Actions(driver);
		builder.moveToElement(ele).perform();
		ele.click();
		location.sendKeys(location1);
	}
	public void selecthotel() throws Exception {
		driver.getWindowHandle();
		Selecthotel.click();		
	    List <String> l1 = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(l1.get(1));				
	}
	public void clickonbookhotel() {
		BookThisNow.click();
	}
    public void clickonfirstname(String firstname1,WebDriver driver) {
    	firstname.sendKeys(firstname1);;
	}
	public void clickonlastname(String lastname1,WebDriver driver) {
		lastname.sendKeys(lastname1);;
	}public void clickonemail(String email1,WebDriver driver) {
		email.sendKeys(email1);
	}
    //public void clickonmobileno(String mobileno1,WebDriver driver) {
    	//mobileno.sendKeys( mobileno1);
    	//driver.quit();
	//}
    
    
    
}



