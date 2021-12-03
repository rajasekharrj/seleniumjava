package com.copy.practise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplictWaitDemo {

	@Test
	public void test() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testproject.io/");
		driver.manage().window().maximize();
		
		WebDriverWait ww=new WebDriverWait(driver, 60);

		driver.findElement(By.linkText("Login")).click();
		String parenthandle=driver.getWindowHandle();
		Set<String> setHandles=driver.getWindowHandles();
		for(String s:setHandles) {
			if(!s.equals(parenthandle)) {
				driver.switchTo().window(s);
				System.out.println(driver.getTitle());
				ww.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
				driver.findElement(By.id("username")).sendKeys("hello");
			}
		}
		
		
	}
}


