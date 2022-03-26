package com.instarentProjectManagement.testCases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.instarentProjectManagement.Utilities.ReadConfig;
import com.instarentProjectManagement.pageObjects.Loginpage;

public class TC_LoginPage_001 extends BaseClass {
	
	ReadConfig rc=new ReadConfig();
	public String url=rc.getApplicationUrl();
	public String userEmail=rc.getusername();
	public String userPassword=rc.getpassword();
	
	@Test
	public void loginTest() throws IOException, InterruptedException {

		//driver.get(url);
		Loginpage lp = new Loginpage(driver);
		logger.info("Browser Opened and Instarent Website Launched");
		lp.setUsername(userEmail);
		logger.info("User Email Entered");
		lp.setPassword(userPassword);
		logger.info("User Password Entered");
		lp.clickSignin();
		Thread.sleep(12000);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("User Properties | Instarent")) {
			logger.info("Login Test Pass");
			Assert.assertTrue(true);

		} else {
			//captureScreenshot(driver, "loginTest");
			//captureScreenshot(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test Failed");
		}

	}

	
	
}
