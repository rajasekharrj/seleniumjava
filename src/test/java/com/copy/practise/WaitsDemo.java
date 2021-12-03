package com.copy.practise;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {

	@Test
	public void test() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testproject.io/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MILLISECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		FluentWait<WebDriver> fl=new FluentWait<WebDriver>(driver);
		fl.withTimeout(Duration.ofMillis(10000));
		
		WebDriverWait wait=new WebDriverWait(driver, 0);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("")));
		Function<WebDriver, Boolean> f=new Function<WebDriver, Boolean>() {
			
			@Override
			public Boolean apply(WebDriver driver) {
				
				return driver.findElement(By.name("")).isDisplayed();
			}
		};
		
		driver.findElement(By.linkText("Login")).click();
		String parenthandle=driver.getWindowHandle();
		Set<String> setHandles=driver.getWindowHandles();
		for(String s:setHandles) {
			if(!s.equals(parenthandle)) {
				driver.switchTo().window(s);
				//wait.until(d->d.findElement(By.name("")).isDisplayed());
				driver.findElement(By.name("your-email")).sendKeys("hello");
			}
		}
		
		
	}
}


