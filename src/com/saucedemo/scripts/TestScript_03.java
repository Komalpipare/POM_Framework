package com.saucedemo.scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.saucedemo.webpage.InventoryPage;
import com.saucedemo.webpage.LoginPage;

public class TestScript_03 {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginPage rv = new LoginPage(driver);
		rv.SetLogin("standard_user", "secret_sauce");
		rv.clickOnLoginButton();
		
		InventoryPage ip = new InventoryPage(driver);
		ip.clickOnFilter();
		ip.getPriceOfProducts();
	}

}
