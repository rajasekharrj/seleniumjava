package com.copy.practise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDemo {

	@Test
	public void selectdropdown() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*
		 * driver.get("https://opensource-demo.orangehrmlive.com/");
		 * driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 * driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 * driver.findElement(By.id("btnLogin")).click();
		 * 
		 * driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		 * 
		 * Select s=new Select(driver.findElement(By.id("searchSystemUser_userType")));
		 * 
		 * System.out.println(s.getFirstSelectedOption().getText()); List<WebElement>
		 * listofelements=s.getOptions();
		 * 
		 * for(WebElement we:listofelements) { System.out.println(we.getText()); }
		 */
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select s=new Select(driver.findElement(By.id("cars")));
		Select s1=new Select(driver.findElement(By.id("cars")));
		
		System.out.println("drop down is multi select ? "+ s.isMultiple());
		 List<WebElement>  listofelements=s.getOptions();
		 for(WebElement we:listofelements) { System.out.println(we.getText()); }
		 
		 s.selectByIndex(0);
		 s.selectByValue("saab");
		 s.selectByVisibleText("Audi");
		 
		 List<WebElement> selectElements=s.getAllSelectedOptions();
		 for(WebElement we:selectElements) { System.out.println(we.getText()); }
		 
		 s.deselectByIndex(0);
		 s.deselectByValue("saab");
		 s.deselectByVisibleText("Audi");
		 
		 List<WebElement> remaingElements=s.getAllSelectedOptions();
		 if(remaingElements.size()!=0) {
		 for(WebElement we:remaingElements) { System.out.println(we.getText()); }
		 }else {
			 System.out.println("No eleement selected");
		 }
		 
		 
		 
		 System.out.println(s.hashCode());
		 System.out.println(s1.hashCode());
		 System.out.println(s.equals(s1));
		 
		 List<WebElement>  se=s.getOptions();
		 for(WebElement we:se) { System.out.println(we.getText()); }
		 
		 List<WebElement>  s1e=s1.getOptions();
		 for(WebElement we:s1e) { System.out.println(we.getText()); }
		 
		driver.quit();
		
	}
}

