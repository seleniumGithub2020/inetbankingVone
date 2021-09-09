

package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass1 {
    
	public String baseURL = "http://demo.guru99.com/v4/index.php";
    public String username= "mngr164225DontRun";
    public String password= "jahetAPDontRun";
    public static WebDriver driver;
    
    
    @BeforeClass
    public void setup()
    {
      System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/Drivers/chromedriver.exe");
	  driver = new ChromeDriver();
       
    }  
    
    @AfterClass
    public void tearDown()
    {
    	driver.quit();
    }
}
    
    