package com.copy.practise;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DemoReport {

	
		ExtentHtmlReporter extentHtmlReporter;
		ExtentReports extentReports;
		ExtentTest extentTest;
		
		WebDriver driver;

		
		@BeforeClass
		public void setup() {
			
			WebDriverManager.chromedriver().setup();
			extentHtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
			extentReports = new ExtentReports();
			extentReports.attachReporter(extentHtmlReporter);
			
			extentReports.setSystemInfo("OS", "Linux");
			extentReports.setSystemInfo("Browser", "Chrome");
	        
	        //configuration items to change the look and feel
	        //add content, manage tests etc
	        extentHtmlReporter.config().setChartVisibilityOnOpen(true);
	        extentHtmlReporter.config().setDocumentTitle("Orange HCM-QA");
	        extentHtmlReporter.config().setReportName("SANITY Report");
	        extentHtmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	        extentHtmlReporter.config().setTheme(Theme.DARK);
	        extentHtmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	        
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php");
			
		}
	  @Test
	  public void doLogin() {
		  
		  extentTest=extentReports.createTest("withValidUserNameAndPassword");
		  extentTest.log(Status.INFO, "Entering User Name");
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  extentTest.log(Status.INFO, "Entering Password");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  extentTest.log(Status.INFO, "click on login");
		  driver.findElement(By.id("btnLogin")).click();
		  Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Dashboard']")).isDisplayed());
		  
	  }
	  
	  @AfterMethod
		public void afterMethod(ITestResult result) throws Exception {
		  System.out.println("method name:" + result.getMethod().getMethodName());
		  
		  if(result.getStatus() == ITestResult.FAILURE) {
	        extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
	        extentTest.fail(result.getThrowable());
	        String screenshotPath=null;
		
				screenshotPath = getScreenshot(driver, result.getName());
				extentTest.fail("Snapshot below: " + extentTest.addScreenCaptureFromPath(screenshotPath));
	    }
	    else if(result.getStatus() == ITestResult.SUCCESS) {
	        extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
	    }
	    else {
	        extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
	        extentTest.skip(result.getThrowable());
	    }
	  }
	  @AfterClass
	  public void tear() {
		  extentReports.flush();
		  driver.close();
	  }
	  
	  public  String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
	      String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
			return destination;
	}
	}


	


