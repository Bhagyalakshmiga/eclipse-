package com.opencart.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjects {
		// TODO Auto-generated method stub
WebDriver driver;
By myaccountlink = By.linkText("My Account");
By loginlink= By.linkText("Login");
By enteremail=By.id("input-email");
By enterpassword=By.id("input-password");
By loginbutton= By.id("//button[@type='submit']");
public  pageobjects(WebDriver driver) {	
this.driver=driver;
}
public void clickonmyaccount()
{
	driver.findElement(By.linkText("My Account")).click();	
}
public void clickonlogin()
{
	driver.findElement(By.linkText("Login")).click();
}
public void clickonenteremail()
{
	driver.findElement(By.id("input-email")).sendKeys("abcd@gmail.com");	
}
public void clickonenterpassword()
{
	driver.findElement(By.id("input-password")).sendKeys("123456");
}
public void clickonloginbutton()
{
	driver.findElement(By.xpath("//button[@type='submit']")).click();	
}

	

}
