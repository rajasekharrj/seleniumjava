package com.copy.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemoInSelenium {

	@Test
	public void waitsdemo() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	
		// page
		// script
		// element
		
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("alert('hello');");
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		assert driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']")).isDisplayed();
		
		
	}
}

