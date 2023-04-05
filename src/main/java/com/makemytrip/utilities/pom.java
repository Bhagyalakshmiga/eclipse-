package com.makemytrip.utilities;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class pom {

	@Test
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
	    String url=prob.getProperty("makemytripurl");
	    
	    File f1=new File(Projectpath+"\\src\\main\\java\\com\\makemytrip\\data\\projectdata.xlsx");
	    FileInputStream fis=new FileInputStream(f1);
	    XSSFWorkbook workbook=new XSSFWorkbook(fis);
	    XSSFSheet sheet=workbook.getSheetAt(0);
	    int rowcount=sheet.getPhysicalNumberOfRows();
	    
	    WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

	pgobj obj=PageFactory.initElements( driver, pgobj.class);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
	
		//pgobj obj =new pgobj(driver);
	  driver.get(url);
	  obj.clickonhotels();
	  test.pass("HOTEL CLICKED");
	  obj.clickonsearch();
	  test.pass("serach clicked");
	  obj.clickonfindlocation();
	  test.pass("clicked find location");
	  obj.enterlocation(Projectpath , driver);
	  test.pass("location entered");
	  obj.selecthotel();
	  test.pass("Hotel selected");
	  obj.clickonbookhotel();
	  test.pass("clicked book hotel");

	  for(int i=1;i<rowcount;i++)
	    {
	    XSSFRichTextString firstname=sheet.getRow(i).getCell(0).getRichStringCellValue();
	    XSSFRichTextString lastname=sheet.getRow(i).getCell(1).getRichStringCellValue();
	    XSSFRichTextString email=sheet.getRow(i).getCell(2).getRichStringCellValue();
	    XSSFRichTextString mobileno=sheet.getRow(i).getCell(3).getRichStringCellValue();
	    
	   
	  obj.clickonfirstname(Projectpath, driver);
	  test.pass("clicked on firstname");
	  obj.clickonlastname(Projectpath, driver);
	  test.pass("entered last name");
	  obj.clickonemail(Projectpath, driver);
	  test.pass("entered email");
	  //obj.clickonmobileno(Projectpath, driver);
	  //test.pass("entered mobile no");
	    }
	extent.flush();  
	}
	}
	





