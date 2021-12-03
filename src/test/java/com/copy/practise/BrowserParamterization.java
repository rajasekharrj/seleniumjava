package com.copy.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserParamterization {
  
	WebDriver driver;
	String baseUrl="https://opensource-demo.orangehrmlive.com/";
	
  @Parameters({"browser"})
  @Test
  public void f(@Optional("msedge") String browserName) {
	  
	  System.out.println(System.getProperty("user.dir"));
	  
	  if(browserName.equals("chrome")) {
		  
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/resources/chromedriver");
		  driver=new ChromeDriver();
		  
	  }else if(browserName.equals("firefox")) {
		  
		  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/resources/geckodriver");
		  driver=new FirefoxDriver();
		  
	  }else if(browserName.equals("opera")) {
		  
		  System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"/src/resources/operadriver");
		  driver=new OperaDriver();
		  
	  }else {
		  
		  System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/src/resources/msedgedriver");
		  driver=new EdgeDriver();
	  }
	  
	  driver.get(baseUrl);
	  driver.manage().window().maximize();
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  
  }
  
  @AfterMethod
  public void closeDrivers() {
	  driver.close();
  }
}


