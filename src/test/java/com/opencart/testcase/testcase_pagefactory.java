
package com.opencart.testcase;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import marchbatch.pagefactory1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class testcase_pagefactory {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1= new File("‪‪‪‪C:\\Users\\Administrator\\eclipse-workspace\\marchbatch\\src\\test\\java\\com\\opencart\\testdata\\data.xlsx");
		FileInputStream fis= new FileInputStream(f1);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);	
	    XSSFSheet sheet=workbook.getSheetAt(0);
		int rowcount=sheet.getPhysicalNumberOfRows();
		for(int i=1;i<rowcount;i++)
		{
			String username=sheet.getRow(i).getCell(0).getStringCellValue();
			String password=sheet.getRow(i).getCell(1).getStringCellValue();
			
		
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
