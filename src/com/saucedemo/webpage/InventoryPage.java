package com.saucedemo.webpage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage 
{
	//Declaration
WebDriver driver;
	
	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement item;
	
	@FindBy(id="shopping_cart_container")
	private WebElement addcart;
	
	@FindBy(xpath=".//select[@class='product_sort_container']")
	private WebElement filter;
	
	@FindBy(xpath=".//div[@class='inventory_item_price']")
	private List<WebElement> price;
	
	public InventoryPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addItem() {
		item.click();
	}
	
	public void clickOnAddCart() {
		addcart.click();
	}
	
	public void clickOnFilter() {
		Select s = new Select(filter);
		s.selectByValue("lohi");
	}
	
	public void getPriceOfProducts() {
		for(int i=0; i<price.size();i++) {
			System.out.println(price.get(i).getText());
		}
	}
		
		
	}
	 


