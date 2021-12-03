package com.copy.practise;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverInferfaceDemo {
	
	WebDriver driver;
	String baseUrl="https://opensource-demo.orangehrmlive.com/";
	
	@Test
	public void demo() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(baseUrl);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String currurl=driver.getCurrentUrl();
		System.out.println(currurl);
		
		String source=driver.getPageSource();
		System.out.println(source);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		
		List<WebElement>  elementslist=driver.findElements(By.className("button"));
		System.out.println("==========================="+elementslist.size());
		for(WebElement e:elementslist) {
			
			if(e.getAttribute("value").equals("LOGIN")) {
				e.click();
				break;
			}
		}
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
		
		driver.navigate().back();
		
	      
		
		Thread.sleep(1000);
		driver.close();
	}

}

