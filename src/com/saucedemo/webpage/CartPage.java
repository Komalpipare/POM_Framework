package com.saucedemo.webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
WebDriver driver;
	
	@FindBy(id="remove-sauce-labs-bolt-t-shirt")
	private WebElement removebutton;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void productAddedOrNot() {
		if(removebutton.isDisplayed())
			System.out.println("PRODUCT ADDED");
		else
			System.out.println("PRODUCT NOT ADDED");

}
}
