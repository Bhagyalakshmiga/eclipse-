package com.opencart.testcase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class lab11_testcases {
		// TODO Auto-generated method stub
WebDriver driver;
By myaccountlink = By.linkText("My Account");
By loginlink= By.linkText("Register");
By enterlastname=By.id("input-lastname");
By enterfirstname=By.id("input-firstname");
By enteremail=By.id("input-email");
By enterpassword=By.id("input-password");
By loginbutton= By.id("//button[@type='submit']");
public  lab11_testcases(WebDriver driver) {	
this.driver=driver;
}
public void clickonmyaccount()
{
	driver.findElement(By.linkText("My Account")).click();	
}
public void clickonregister()
{
	driver.findElement(By.linkText("Register")).click();
}
public void clickonfirstname() 
{
	driver.findElement(By.id("input-firstname"));
}
public void clickonlastname() 
{
	driver.findElement(By.id("input-lastname"));
}
public void clickonenteremail()
{
	driver.findElement(By.id("input-email")).sendKeys("abcd@gmail.com");	
}
public void clickonenterpassword()
{
	driver.findElement(By.id("input-password")).sendKeys("123456");
}
public void clickoncontinuebutton()
{
	driver.findElement(By.xpath("//button[@type='submit']")).click();	
}
}
