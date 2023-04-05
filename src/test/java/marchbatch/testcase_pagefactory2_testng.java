
package marchbatch;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class testcase_pagefactory2_testng {
	@Test
public void testcase1() throws IOException  {
	/*InputStream input = new FileInputStream(propertypath);
	Properties prob =new Properties();
	prob.load(input);
	String url=prob.getProperty("url");	*/
	
	String projectpath= System.getProperty("user.dir");
	//File f1= new File("‪C:\\Users\\Administrator\\eclipse-workspace\\marchbatch\\parameters.xlsx");
	FileInputStream fis= new FileInputStream(projectpath+"‪\\data.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);	
    XSSFSheet sheet=workbook.getSheetAt(0);
	int rowcount=sheet.getPhysicalNumberOfRows();
	for(int i=1;i<rowcount;i++)
	{
		String username=sheet.getRow(i).getCell(0).getStringCellValue();
		String password=sheet.getRow(i).getCell(1).getStringCellValue();
		// TODO Auto-generated method stub
	WebDriverManager.edgedriver().setup();
	WebDriver driver = new EdgeDriver();
	
	pagefactory1  obj =PageFactory.initElements(driver, pagefactory1.class);
	
driver.get("https://demo.opencart.com");
	 obj.clickonmyaccount();
	 obj.clickonlogin();
	 obj.clickonenteremail(username);
	 obj.clickonenterpassword(password);
	 obj.clickonloginbutton();
	 driver.quit();
	}
	
	}
}