package com.instarentProjectManagement.testCases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.instarentProjectManagement.Utilities.XLUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LoginDDT_002{
//String path=null;
	@Test(dataProvider ="Logint")
	public void logintest(String user,String pwd) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instarent.com.au/login");
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(pwd);
	
//	public static void main (String [] args) throws IOException{
//		//Path of the excel file
//		FileInputStream fs = new FileInputStream(".\\LoginData.xlsx");
//		//Creating a workbook
//		XSSFWorkbook workbook = new XSSFWorkbook(fs);
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		XSSFRow row = sheet.getRow(0);
//		int rows=sheet.getLastRowNum();
//		int cols=sheet.getRow(1).getLastCellNum();	
//		for (int i=1;i<=rows;i++) {
//			for (int j=0;j<cols;j++) {
//				System.out.println(sheet.getRow(i).getCell(j));
//			}
//		}
//		System.out.println();
		//String cellval = cell.getStringCellValue();
		//System.out.println(cellval);
	}
	@DataProvider(name="Logint")
   public String[][] getData() throws IOException{
//	String loginData[][]= 
//		{{"landlord@instarent.com.au","Demo@2142"},{"tenant@instarent.com.au","Demo@2142"}};
	String path="LoginData.xlsx";
	XLUtils xlutil=new XLUtils(path);
	int totalrows=xlutil.getRowCount("Sheet1");
	int totalcols=xlutil.getCellCount("Sheet1", 1);
	String loginData[][]=new String[totalrows][totalcols];
    for(int i=1;i<=totalrows;i++) {
		for (int j=0;j<totalcols;j++) {
			loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			
		}
	}
	return loginData;
	
	
	


}
	
//	@DataProvider(name="Logint")
//public String[][] getData(){
//	String loginData[][]= 
//		{{"landlord@instarent.com.au","Demo@2142"},{"tenant@instarent.com.au","Demo@2142"}};
//	
//
//	return loginData;
//}
}