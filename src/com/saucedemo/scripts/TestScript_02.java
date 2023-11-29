package com.saucedemo.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.saucedemo.webpage.CartPage;
import com.saucedemo.webpage.InventoryPage;
import com.saucedemo.webpage.LoginPage;

public class TestScript_02 {

	public static void main(String[] args) 
	{
		
			
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.saucedemo.com/");
			
			LoginPage rv = new LoginPage(driver);
			rv.SetLogin("standard_user", "secret_sauce");
			rv.clickOnLoginButton();
			
			InventoryPage ip   = new InventoryPage(driver);
			ip.addItem();
			ip.clickOnAddCart();
			
			CartPage cp = new CartPage(driver);
			cp.productAddedOrNot();
			
	}

}
