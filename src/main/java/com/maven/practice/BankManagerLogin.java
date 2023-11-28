package com.maven.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BankManagerLogin extends BestClass
{
	@Test
	public void BankManagerLogin()
	{
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Banl manager login
		driver.findElement(By.xpath(".//button[text()='Bank Manager Login']")).click();
		// Addcustomer
		driver.findElement(By.xpath("(.//button[contains(text(),'Add Customer')])")).click();
		
		driver.findElement(By.xpath(".//input[@placeholder='First Name']")).sendKeys("Komal");
		driver.findElement(By.xpath(".//input[@placeholder='Last Name']")).sendKeys("Pipare");
		driver.findElement(By.xpath(".//input[@placeholder='Post Code']")).sendKeys("411013");
		driver.findElement(By.xpath(".//button[text()='Add Customer']")).click();
		
		
	}
	

}
