package com.copy.practise;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoDriverConfiguration {

	WebDriver driver;
	String baseUrl="https://opensource-demo.orangehrmlive.com/";
	
	@Test(enabled=false)
	public void openChrome() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
	}
	
	@Test(enabled=false)
	public void openFirefox() {
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void openEdge() {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
	}
	
	@Test(enabled=false)
	public void openOpera() {
		
		WebDriverManager.operadriver().setup();
		driver=new OperaDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
	}
}

