package com.copy.practise;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class htmlHeadLessTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 @Test(priority=1,enabled=true) public void htmlunitheadless() {
			  
			  HtmlUnitDriver driver=new HtmlUnitDriver();
			  driver.get("https://www.aha.video/all"); driver.manage().window().maximize();
			  System.out.println(driver.getTitle());
			  //System.out.println(driver.getPageSource());
			  
			  }
	}

}
