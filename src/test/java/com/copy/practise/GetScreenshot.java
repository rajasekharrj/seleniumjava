package com.copy.practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetScreenshot {

	WebDriver driver;
	String baseUrl = "https://opensource-demo.orangehrmlive.com/index.php";

	@Test
	public void test() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin1");
		driver.findElement(By.id("btnLogin")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(System.getProperty("user.dir")+"/execution/image1.jpg");
		
		//Files.copy(source, dest);
		
		FileUtils.copyFile(source, dest);
		
	}
	
	
}


