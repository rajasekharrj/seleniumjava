package Selenium.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
       driver.get("https://en-gb.facebook.com/");
       driver.manage().window().maximize();

	}

}
