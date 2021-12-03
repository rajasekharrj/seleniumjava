package com.practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {
	WebDriver driver;
	String baseurl="https://opensource-demo.orangehrmlive.com/index.php";
  @Test(dataProvider="loginTestData")
  public void Testlogin(String userName,String password) throws Exception {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get(baseurl);
	  driver.findElement(By.id("txtUsername")).sendKeys("userName");
	  driver.findElement(By.id("txtPassword")).sendKeys("password");
	  driver.findElement(By.id("btnLogin")).click();
	  Assert.assertTrue(driver.findElement(By.id("branding")).isDisplayed());
	  Thread.sleep(2000);
	  TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"/execution/image2.png");
		FileUtils.copyFile(source, dest);
	
	  driver.quit();
	  
	  
	  
  }
  
  @DataProvider(name="loginTestData")
  public Object[][] loginData() {
	  Object[][] data=new Object[2][2];
	  data[0][0]="Admin";
	  data[0][1]="admin123";
	  
	  data[1][0]="Admin";
	  data[1][1]="test123";
	  
	  return data;
	  
	  
	  
	  
  }
}
