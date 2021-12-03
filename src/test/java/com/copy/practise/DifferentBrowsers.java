package com.copy.practise;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DifferentBrowsers {

   WebDriver driver;
   String baseUrl="https://opensource-demo.orangehrmlive.com/";
	
  @Test
  public void openChrome() {
	  
	 System.setProperty("webdriver.chrome.driver", "/home/rvkinfotech/eclipse-workspace/practice/src/resources/chromedriver");
	  driver=new ChromeDriver();
	  driver.get(baseUrl);
	  driver.manage().window().maximize();
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
  }
  
  @Test
  public void openFirefox() {
	  
	 System.setProperty("webdriver.gecko.driver", "/home/rvkinfotech/eclipse-workspace/practice/src/resources/geckodriver");
	  driver=new FirefoxDriver();
	  driver.get(baseUrl);
	  driver.manage().window().maximize();
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
  }
  
  
  @Test
  public void openEdge() {
	  
	 System.setProperty("webdriver.edge.driver", "/home/rvkinfotech/eclipse-workspace/practice/src/resources/msedgedriver");
	  driver=new EdgeDriver();
	  driver.get(baseUrl);
	  driver.manage().window().maximize();
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  
  }
  @Test
  public void openOpera() {
	  
	 System.setProperty("webdriver.opera.driver", "/home/rvkinfotech/eclipse-workspace/practice/src/resources/operadriver");
	  driver=new OperaDriver();
	  driver.get(baseUrl);
	  driver.manage().window().maximize();
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
  }
  
  @AfterMethod
  public void closeDrivers() {
	  driver.quit();
  }
}


