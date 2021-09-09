package com.inetbanking.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage3;

public class TC_LoginTest_003 extends BaseClass3
{
	
	@Test 
	public void loginTest() throws IOException
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Enter username");
		
		lp.setPassword(password);
		logger.info("Enter password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}	
	}
}
