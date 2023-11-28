package com.maven.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPage extends BestClass
{
	@Test
	public void CustomerLogin() throws InterruptedException
	{
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Login customer 
		driver.findElement(By.xpath(".//button[text()='Customer Login']")).click();
		//Enter name
		driver.findElement(By.id("userSelect")).click();
		driver.findElement(By.xpath(".//option[text()='Harry Potter']")).click();
		Thread.sleep(3000);
		//click on Login
		driver.findElement(By.xpath(".//button[text()='Login']")).click();
		driver.findElement(By.xpath(".//button[text()='Home']")).click();
		
		//
		//driver.findElement(By.xpath(".//button[text()='Bank Manager Login']")).click();
		//
		//driver.findElement(By.xpath("(.//button[contains(text(),'Add Customer')])")).click();
		
		
	}
	

}
