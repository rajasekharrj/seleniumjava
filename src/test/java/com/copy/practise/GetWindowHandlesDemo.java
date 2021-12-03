package com.copy.practise;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandlesDemo {
	
	WebDriver driver;
	String baseUrl = "https://www.naukri.com/";

	@Test
	public void demo() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		String str=driver.getWindowHandle();
		System.out.println(str);
		Set<String> handles=driver.getWindowHandles();
		
		for(String s:handles) {
			if(!str.equals(s)) {
				System.out.println(s);
				driver.switchTo().window(s);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
	}
	
}




