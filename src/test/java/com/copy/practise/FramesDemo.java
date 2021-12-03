package com.copy.practise;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {
	
	WebDriver driver;
	String baseUrl = "file:///home/rvkinfotech/iframes.html";

	@Test
	public void demo() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> list=driver.findElements(By.tagName("iframe"));
		

		// frame with index
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@class='navbar__tutorial-menu']")).click();
		
		// switch to main document
		driver.switchTo().defaultContent();
		
		
		for(WebElement e: list) {
			
			if(	e.getAttribute("src").equals("https://jquery.com/")) {
				
				// frame with id or name
				driver.switchTo().frame(e.getAttribute("id"));
				Thread.sleep(1000);
				driver.findElement(By.name("s")).sendKeys("click");
				Thread.sleep(1000);
			}
		}
		driver.switchTo().defaultContent();
		
		//  frame with web element argument
		
		driver.switchTo().frame(driver.findElement(By.id("IF1")));
		driver.findElement(By.className("icon-search")).click();
		driver.findElement(By.name("keyword")).sendKeys("frame handling in selenium");
		

	}
	
}


