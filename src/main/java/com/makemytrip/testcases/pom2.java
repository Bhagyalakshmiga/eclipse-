package com.makemytrip.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.makemytrip.pageobjects.pgobj2;
import com.makemytrip.utilities.pgobj;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pom2 {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String Projectpath=System.getProperty("user.dir");
	    ExtentReports extent=new ExtentReports();
	    ExtentSparkReporter spark= new ExtentSparkReporter(Projectpath+"\\Reports\\Tc1.html");
	    extent.attachReporter(spark);
	    ExtentTest test=extent.createTest("Book a hotel");
	    String propertypath= ("C:\\Users\\Administrator\\eclipse-workspace\\marchbatch\\src\\main\\java\\com\\makemytrip\\data\\inputparameters");
	    propertypath=propertypath.trim();
	    InputStream input=new FileInputStream(propertypath);
	    Properties prob=new Properties();
	    prob.load(input);
	    String url=prob.getProperty("url");
	    
	    
	    WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

	//pom2 obj1=PageFactory.initElements( driver, pom2.class);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	  pgobj2 obj1 =new pgobj2(driver);
	  driver.get("https://www.makemytrip.com/");
	  obj1.clickonhotels();
	  test.pass("HOTEL CLICKED");
	  obj1.clickonsearch();
	  test.pass("serach clicked");
	  obj1.clickonfindlocation();
	  test.pass("clicked find location");
	  obj1.enterlocation();
	  test.pass("location entered");
	  obj1.selecthotel();
	  test.pass("Hotel selected");
	  obj1.clickonbookhotel();
	  test.pass("clicked book hotel");

	  obj1.clickonfirstname();
	  test.pass("clicked on firstname");
	  obj1.clickonlastname();
	  test.pass("entered last name");
	  obj1.clickonemail();
	  test.pass("entered email");
	  obj1.clickonmobileno();
	  test.pass("entered mobile no");
	
	extent.flush();  
	}
}
	





