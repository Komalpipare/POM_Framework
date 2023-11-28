package com.maven.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;




public class BestClass 
{
	WebDriver driver;
	@Parameters("Browsername")
	@BeforeClass
	public void OpenBrowser(String Browsername)
	{
		if(Browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(Browsername.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
	}
	@BeforeMethod
	public void OpenApp()
	{
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void testResult(ITestResult result)    
	{
	       String methodname  = result.getName();
		
		if(result.getStatus()==1)
		{
			Reporter.log(methodname+"Execution is pass");
		}
		else
		{
			Reporter.log(methodname+"Execution is fail");
		}
		
	}
	@AfterClass
	public void CloseApp()
	{
		driver.close();
		
	

}
}
