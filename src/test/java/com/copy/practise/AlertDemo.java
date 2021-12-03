package com.copy.practise;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {
	
	WebDriver driver;
	String baseUrl = "https://the-internet.herokuapp.com/javascript_alerts";


	@Test
	public void alerttest() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert simplealert=driver.switchTo().alert();
		System.out.println(simplealert.getText());
		simplealert.accept();
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert calert=driver.switchTo().alert();
		System.out.println(calert.getText());
		calert.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert palert=driver.switchTo().alert();
		System.out.println(palert.getText());
		palert.sendKeys("hello dude");
		palert.accept();
		String text=driver.findElement(By.id("result")).getText();
		System.out.println(text);
		
	}
}


