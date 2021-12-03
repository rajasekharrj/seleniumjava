package com.copy.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessTesting {

	@Test
	public void chromeheadless() {

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");

		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		// System.out.println(driver.getPageSource());
		assert driver.findElement(By.xpath("//span[text()='Enter Email/Mobile number']")).isDisplayed();
	}

	@Test
	public void firefoxheadless() {

		WebDriverManager.firefoxdriver().setup();

		FirefoxOptions fo = new FirefoxOptions();
		fo.setHeadless(true);
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://www.primevideo.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		// System.out.println(driver.getPageSource());

	}

}
