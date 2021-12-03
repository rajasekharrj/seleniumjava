package com.copy.practise;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseopsdemo {

	@Test
	public void test() throws ParseException {
		/*
		 * WebDriverManager.chromedriver().setup(); WebDriver driver=new ChromeDriver();
		 * driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		 * 
		 * driver.findElement(By.id("first_date_picker")).click();
		 */
		
		String dates="30/Feb/2021";
		SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/yyyy");
		//sdf.setLenient(false);
		Date date=sdf.parse(dates);
		System.out.println(date);
		
	}
}

